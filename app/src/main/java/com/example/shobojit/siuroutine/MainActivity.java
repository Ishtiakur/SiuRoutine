package com.example.shobojit.siuroutine;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shobojit.siuroutine.Model.JsonData;
import com.example.shobojit.siuroutine.SplashScreenPackage.SplashScreen;
import com.example.shobojit.siuroutine.viewpager_Routine.RoutineDetail;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import rebus.bottomdialog.BottomDialog;


public class MainActivity extends AppCompatActivity {
    Toolbar tl;
    Context cn;
    TextView tv;
    Button go;
    private BottomDialog dialog;
    FloatingActionButton fab;
    String SelectSpinner;
    List<String> batchlist;
    String data;
    SharedPreferences preferences;
    Spinner rspinner;
    JsonData js;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cn = this;
        batchlist = new ArrayList<>();
        preferences = getSharedPreferences("RoutineData",MODE_PRIVATE);
       // data = getIntent().getStringExtra("Value");
        data = preferences.getString("Routine","null");
        getBatchlist(data);
        Initializaion();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dailog();
            }
        });
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

    
    void Dailog(){

        dialog = new BottomDialog(MainActivity.this);
        dialog.title(R.string.app_name);
        dialog.canceledOnTouchOutside(true);
        dialog.cancelable(true);
        dialog.inflateMenu(R.menu.dail);
        dialog.setOnItemSelectedListener(new BottomDialog.OnItemSelectedListener() {
            @Override
            public boolean onItemSelected(int id) {
                switch (id) {
                    case R.id.admission:
                        Toast.makeText(cn, "Admission", Toast.LENGTH_SHORT).show();
                         return false;
                    case R.id.home:
                        Toast.makeText(cn, "Home", Toast.LENGTH_SHORT).show();
                        return false;
                    case R.id.authomenu:
                        Toast.makeText(cn, "Home", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.exit:
                        finish();
                        return true;
                    case R.id.school:
                        Toast.makeText(cn, "School", Toast.LENGTH_SHORT).show();
                        return false;
                    default:
                        return false;
                }
            }
        });
        dialog.show();
    }


    void Initializaion (){
        fab = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        tv = (TextView) findViewById(R.id.tt1);
        tv.setSelected(true);
        go = (Button) findViewById(R.id.go);
        tl= (Toolbar) findViewById(R.id.tool);
        setSupportActionBar(tl);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        Log.i("Main Activity Data",data);
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
       Toast.makeText(cn,rspinner.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
       setDpt(rspinner.getSelectedItem().toString());
       startActivity(new Intent(MainActivity.this,RoutineDetail.class));
    }


    void setDpt(String dpt){
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("Dpt",dpt);
        editor.commit();
    }
}
