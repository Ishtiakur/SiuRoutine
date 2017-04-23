package com.example.shobojit.siuroutine.SplashScreenPackage;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.aapbd.appbajarlib.notification.BusyDialog;
import com.aapbd.appbajarlib.notification.StylusBusy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.crashlytics.android.Crashlytics;
import com.example.shobojit.siuroutine.MainActivity;
import com.example.shobojit.siuroutine.Model.SharedPreferencesMOdel;
import com.example.shobojit.siuroutine.R;
import com.example.shobojit.siuroutine.viewpager_Routine.RoutineDetail;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.fabric.sdk.android.Fabric;
import org.json.JSONObject;
public class SplashScreen extends AppCompatActivity {
    ImageView imageView;
    String dptName;
    BusyDialog busyDialog;
    String url ="https://api.myjson.com/bins/13ydi7";
    Context cn;
    SharedPreferencesMOdel sharedPreferencesMOdel;
    private FirebaseAnalytics mFirebaseAnalytics;
    private RequestQueue req;
    SharedPreferences preferences;
    private static final String TAG = SplashScreen.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_splash_screen);
        cn = this ;
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(cn);
        req = Volley.newRequestQueue(this);
        preferences = getSharedPreferences("RoutineData",MODE_PRIVATE);
        intialzation();
        StartAlgo();
    }

    void  StartAlgo(){
        if(!haveNetworkConnection()){
            String res = preferences.getString("Routine","null");
            if(!res.equals("null")){
                if(CheckDpt(res)){
                    StartRoutineActivity();
                }else {
                    StartMainActivity(res);
                }

            }else {
                AlertDialog alertDialog = new AlertDialog.Builder(cn).create();
                alertDialog.setTitle("No Internet Connection");
                alertDialog.setMessage("Would you like to try Again");
                alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "NO",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                finish();
                            }
                        });
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "YES",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                StartAlgo();
                            }
                        });

                alertDialog.show();
            }
        }else {
            busyDialog = new BusyDialog(cn,false,"Please wait....",false);
          busyDialog.show();

            GetDataFromNet();

        }

    }

    void GetDataFromNet(){
        JsonObjectRequest jsr  =new JsonObjectRequest(Request.Method.GET, url, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                String routine = response.toString();
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("Routine",routine);
                editor.commit();
                Log.i("Data",routine);
               // StartMainActivity(routine);
                if(CheckDpt(routine)==true){
                    StartRoutineActivity();
                }else {
                    StartMainActivity(routine);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        req.add(jsr);
    }

    void StartMainActivity(final String routine){
        if(busyDialog!=null){
            busyDialog.dismis();
        }
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this,MainActivity.class).putExtra("Value",routine));
                finish();
            }
        },1000);
    }

    void StartRoutineActivity(){
        if(busyDialog!=null){
            busyDialog.dismis();
        }
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this,RoutineDetail.class));
                finish();
            }
        },1000);
    }

    private boolean haveNetworkConnection() {
        boolean haveConnectedWifi = false;
        boolean haveConnectedMobile = false;
        ConnectivityManager cm = (ConnectivityManager) getSystemService(this.CONNECTIVITY_SERVICE);
        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
        for (NetworkInfo ni : netInfo) {
            if (ni.getTypeName().equalsIgnoreCase("WIFI"))
                if (ni.isConnected())
                    haveConnectedWifi = true;
            if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
                if (ni.isConnected())
                    haveConnectedMobile = true; }
        return haveConnectedWifi || haveConnectedMobile;
    }

    void intialzation (){
        Animation anim = AnimationUtils.loadAnimation(this,R.anim.fadein);
        imageView = (ImageView) findViewById(R.id.splashimg);
        imageView.setAnimation(anim);

    }

    boolean CheckDpt(String routine){
        dptName = preferences.getString("Dpt","null");
      String json   = preferences.getString("Dpt","null");
        if(!dptName.equals("null")){
            new SharedPreferencesMOdel().setDptName(dptName);
            new SharedPreferencesMOdel().setJsonData(routine);
            return  true;
        }else {
            return  false ;
        }
    }
}
