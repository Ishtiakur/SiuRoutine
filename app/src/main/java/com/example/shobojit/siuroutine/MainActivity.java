package com.example.shobojit.siuroutine;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import rebus.bottomdialog.BottomDialog;
import ss.com.bannerslider.banners.DrawableBanner;
import ss.com.bannerslider.banners.RemoteBanner;
import ss.com.bannerslider.views.BannerSlider;

public class MainActivity extends AppCompatActivity {
    Toolbar tl;
    Context cn;TextView tv;
    private BottomDialog dialog;
    FloatingActionButton fab;
    BannerSlider bannerSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cn = this;
        Initializaion();
        Banner();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dailog();
            }
        });
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

    void Banner(){
        bannerSlider = (BannerSlider) findViewById(R.id.banner_slider1);
       /* bannerSlider.addBanner(new DrawableBanner(R.drawable.a));
        bannerSlider.addBanner(new DrawableBanner(R.drawable.law));*/
        bannerSlider.addBanner(new DrawableBanner(R.drawable.ragbba));
        bannerSlider.addBanner(new DrawableBanner(R.drawable.ragsiu));
        bannerSlider.addBanner(new DrawableBanner(R.drawable.bng));
        bannerSlider.addBanner(new DrawableBanner(R.drawable.rag));
        bannerSlider.addBanner(new DrawableBanner(R.drawable.rag2));
    }
    void Initializaion (){
        fab = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        tv = (TextView) findViewById(R.id.tt1);
        tv.setSelected(true);
        tl= (Toolbar) findViewById(R.id.tool);
        setSupportActionBar(tl);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }


    }
}
