package com.example.shobojit.siuroutine;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shobojit.siuroutine.Model.JsonData;
import com.example.shobojit.siuroutine.Model.SharedPreferencesMOdel;
import com.example.shobojit.siuroutine.SplashScreenPackage.SplashScreen;
import com.example.shobojit.siuroutine.viewpager_Routine.RoutineDetail;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.marcoscg.headerdialog.HeaderDialog;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {
    Toolbar tl;
    Context cn;
    TextView tv;
    Button go;

    String SelectSpinner;
    List<String> batchlist;
    String data;
    SharedPreferences preferences;
    Spinner rspinner;
    JsonData js;
    SharedPreferencesMOdel shmodel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cn = this;
        shmodel = new SharedPreferencesMOdel();
        batchlist = new ArrayList<>();
        preferences = getSharedPreferences("RoutineData",cn.MODE_PRIVATE);
       data = getIntent().getStringExtra("Value");
       // data = preferences.getString("Routine","null");
        getBatchlist(data);
        Initializaion();

    }

    void getBatchlist(String data){
        try {
            JSONObject js = new JSONObject(data);
            JSONArray ar = js.getJSONArray("dpt");
            for (int i = 0;i<ar.length();i++){
                batchlist.add(ar.getJSONObject(i).getString("name"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    



    void Initializaion (){

        tv = (TextView) findViewById(R.id.tt1);
        tv.setSelected(true);
        go = (Button) findViewById(R.id.go);
        tl= (Toolbar) findViewById(R.id.tool);
      //  setSupportActionBar(tl);
//        if(getSupportActionBar()!=null){
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//            getSupportActionBar().setDisplayShowHomeEnabled(true);
//        }
       //Log.i("Main Activity Data",data);
        rspinner = (Spinner) findViewById(R.id.sp);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                R.layout.spinner, batchlist);
        rspinner.setAdapter(adapter);
    /*    rspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
             SelectSpinner = batchlist.get(position);
             //setDpt(SelectSpinner);
           *//* Toast.makeText(cn, SelectSpinner, Toast.LENGTH_SHORT).show();*//*
         }
         @Override
         public void onNothingSelected(AdapterView<?> parent) {

         }
     });*/

    }

   public  void GoRoutine(View v){
       String value  = rspinner.getSelectedItem().toString();
    // Toast.makeText(cn,rspinner.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
    /*   SharedPreferences.Editor editor = preferences.edit();
       editor.putString("Dpt",value);
       editor.commit();*/
        setDpt(rspinner.getSelectedItem().toString());

       new SharedPreferencesMOdel().setDptName(value);
       new SharedPreferencesMOdel().setJsonData(data);
      String s =  new SharedPreferencesMOdel().getDptName();
     // Toast.makeText(cn,"Shared : "+s , Toast.LENGTH_SHORT).show();
      StartActivityMethod();

    }

    void StartActivityMethod(){

        startActivity(new Intent(MainActivity.this,RoutineDetail.class));
        finish();
    }

    void setDpt(String dpt){
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("Dpt",dpt);
        editor.commit();
    }
    void Exit(){
        finish();
    }

    @Override
    public void onBackPressed() {
       /* super.onBackPressed();*/
        new HeaderDialog(this)
                .setColor(getResources().getColor(R.color.colorAccent)) // Sets the header background color
                .setElevation(false) // Sets the header elevation, true by default
                .setIcon(getResources().getDrawable(R.mipmap.logout)) // Sets the dialog icon image
                .setTitle("Exit") // Sets the dialog title
                .setMessage("Are You Sure You Want to Exit?") // Sets the dialog message
                .justifyContent(true) // Justifies the message text, false by default
                .setTitleColor(Color.parseColor("#212121")) // Sets the header title text color
                //    .setIconColor(Color.parseColor("#212121")) // Sets the header icon color
                .setTitleGravity(Gravity.CENTER_HORIZONTAL) // Sets the header title text gravity
                .setMessageGravity(Gravity.CENTER_HORIZONTAL) // Sets the message text gravity
                .setTitleMultiline(false) // Multiline header title text option, true by default
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    Exit();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("Close", null)
                .show();
    }
}
