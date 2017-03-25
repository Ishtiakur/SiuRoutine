package com.example.shobojit.siuroutine;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SteramIO extends AppCompatActivity implements View.OnClickListener {
    private static final String FILE_NAME = "sample.txt";
    private static final String TAG = SteramIO.class.getSimpleName();
    Context cn;
    Button btw,btr;
    EditText ed;
    TextView tt;
        SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steram_io);
        cn= this;
        btw= (Button) findViewById(R.id.btw);
        btr = (Button) findViewById(R.id.btr);
        tt= (TextView) findViewById(R.id.ttv);
        ed = (EditText) findViewById(R.id.editText);
        preferences = getSharedPreferences(getPackageName()+"."+TAG,MODE_PRIVATE);

        btw.setOnClickListener(this);
        btr.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btw : WriteContentTofile();break;
            case R.id.btr :ShowtextonTextview();break;
                default: break;
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        ShowtextonTextview();
    }

    public void ShowtextonTextview (){
        tt.setText(preferences.getString("Sample","String is not Found"));
       /* try {
            tt.setText(readtxtfromFIle(FILE_NAME));

        } catch (IOException e) {
            Toast.makeText(cn,"Some thing Went Wrong",Toast.LENGTH_SHORT).show();
        }*/
    }
    public String readtxtfromFIle (String flname) throws FileNotFoundException,IOException{
        String txt = "";
        FileInputStream fileInputStream = openFileInput(flname);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        StringBuilder stringBuilder = new StringBuilder(txt);
        while((txt = reader.readLine())!=null){
            stringBuilder.append(txt);
        }
        inputStreamReader.close();
        return stringBuilder.toString();
    }

    public void WriteContentTofile()  {
        String msg = ed.getText().toString();

        if (isStringEmpty(msg)){
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("Sample",msg);
            editor.commit();
        }
    /*    if(isStringEmpty(msg)){
            try {
                WriteTofile(FILE_NAME,msg,MODE_PRIVATE);
            } catch (IOException e) {
                Toast.makeText(cn,"Something Went Worng",Toast.LENGTH_SHORT).show();
            }
        }*/
    }

    public void WriteTofile(String fname,String data,int mode)throws FileNotFoundException,IOException{
        FileOutputStream fileOutputStream = openFileOutput(fname,mode);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        outputStreamWriter.write(data);
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }

    public boolean isStringEmpty(String string ){
        if(string!=null && !string.equals("") && string.length()>0){
            return true;
        }
        else {
            return false;
        }
    }

}
