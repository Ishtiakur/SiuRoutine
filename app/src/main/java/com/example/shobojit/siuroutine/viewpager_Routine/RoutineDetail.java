package com.example.shobojit.siuroutine.viewpager_Routine;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shobojit.siuroutine.MainActivity;
import com.example.shobojit.siuroutine.Model.SharedPreferencesMOdel;
import com.example.shobojit.siuroutine.R;
import com.example.shobojit.siuroutine.viewpager_Routine.Fragment_model.Mon;
import com.example.shobojit.siuroutine.viewpager_Routine.Fragment_model.Sat;
import com.example.shobojit.siuroutine.viewpager_Routine.Fragment_model.Sun;
import com.example.shobojit.siuroutine.viewpager_Routine.Fragment_model.Thu;
import com.example.shobojit.siuroutine.viewpager_Routine.Fragment_model.Tue;
import com.example.shobojit.siuroutine.viewpager_Routine.Fragment_model.Wed;
import com.marcoscg.headerdialog.HeaderDialog;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class RoutineDetail extends AppCompatActivity {
    ViewPager vp;
    TabLayout tb;
    TextView tooltext;
    Context cn ;
    SharedPreferences preferences;
    Toolbar tol;
    String Data,Dpt,toolname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine_detail);
        preferences = getSharedPreferences("RoutineData",cn.MODE_PRIVATE);
        cn=this;
        Data =new SharedPreferencesMOdel().getJsonData();
        Dpt = new SharedPreferencesMOdel().getDptName();
        getJsonData(Data,Dpt);
        Initialize();
        SetupViewPager(vp);
        tb.setupWithViewPager(vp);

    }

    void getJsonData(String Data ,String Dpt){
        try {
            JSONObject js = new JSONObject(Data);
            JSONObject js1 = js.getJSONObject(Dpt);
            toolname = js1.getString("ToolName").toString();
            Toast.makeText(cn,toolname, Toast.LENGTH_SHORT).show();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    void GetDateToSetViewPager(){
        Calendar c = Calendar.getInstance();
        int day =c.get(Calendar.DAY_OF_WEEK);
       if(day==1){vp.setCurrentItem(1);}
       else if (day ==2){vp.setCurrentItem(2);}
       else if (day ==3){vp.setCurrentItem(3);}
       else if (day ==4){vp.setCurrentItem(4);}
       else if (day==5){vp.setCurrentItem(5);}
       else if (day==6){ vp.setCurrentItem(6); }
    }

    void SetupViewPager(ViewPager vp){
       ViewPagerAdapter vpa = new ViewPagerAdapter(getSupportFragmentManager());
       vpa.AddFragment(new Sat(),"SAT");
       vpa.AddFragment(new Sun(),"SUN");
       vpa.AddFragment(new Mon(),"MON");
       vpa.AddFragment(new Tue(),"TUE");
       vpa.AddFragment(new Wed(),"WED");
       vpa.AddFragment(new Thu(),"THU");
       vp.setAdapter(vpa);
        GetDateToSetViewPager();
    }

    void Initialize (){
        vp = (ViewPager) findViewById(R.id.vp);
        tb = (TabLayout) findViewById(R.id.tab);
       // tooltext = (TextView) findViewById(R.id.tooltext);
        //tooltext.setText("Shuvojit");
       tol = (Toolbar) findViewById(R.id.toolbar);
       tol.setTitle(toolname);
        setSupportActionBar(tol);;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.toolbarmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int resId = item.getItemId();
        if(resId==R.id.logout){
            Logout();
        } else if(resId==R.id.exit){
           finish();
        }
        return super.onOptionsItemSelected(item);
    }

    void Logout(){
        new HeaderDialog(this)
                .setColor(getResources().getColor(R.color.colorAccent)) // Sets the header background color
                .setElevation(false) // Sets the header elevation, true by default
                .setIcon(getResources().getDrawable(R.mipmap.logout)) // Sets the dialog icon image
                .setTitle("Logout") // Sets the dialog title
                .setMessage("Are You Sure You Want to Logout?") // Sets the dialog message
                .justifyContent(true) // Justifies the message text, false by default
                .setTitleColor(Color.parseColor("#212121")) // Sets the header title text color
            //    .setIconColor(Color.parseColor("#212121")) // Sets the header icon color
                .setTitleGravity(Gravity.CENTER_HORIZONTAL) // Sets the header title text gravity
                .setMessageGravity(Gravity.CENTER_HORIZONTAL) // Sets the message text gravity
                .setTitleMultiline(false) // Multiline header title text option, true by default
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                         String s=new SharedPreferencesMOdel().getJsonData();
                        startActivity(new Intent(RoutineDetail.this, MainActivity.class).putExtra("Value",s));
                        finish();
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
                       finish();
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

class ViewPagerAdapter extends FragmentPagerAdapter {
     List<Fragment> Fraglist = new ArrayList<>();
     List<String> Fragname = new ArrayList<>();
        public ViewPagerAdapter(FragmentManager fm) {
                super(fm);
            }
        void AddFragment(Fragment f,String fragname){
                Fraglist.add(f);
                Fragname.add(fragname);
            }

        @Override
        public CharSequence getPageTitle(int position) {
                return Fragname.get(position);
            }

        @Override
        public Fragment getItem(int position) {
                return Fraglist.get(position);
            }

        @Override
        public int getCount() {
                return Fraglist.size();
            }
        }
