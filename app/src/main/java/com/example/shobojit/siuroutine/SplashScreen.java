package com.example.shobojit.siuroutine;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shobojit.siuroutine.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_splash_screen);
        Animation anim = AnimationUtils.loadAnimation(this,R.anim.fadein);
        ImageView spLogo = (ImageView) findViewById(R.id.splash_screen_logo);
        spLogo.setAnimation(anim);
        TextView tt = (TextView) findViewById(R.id.tt);
        Animation anim1 = AnimationUtils.loadAnimation(this,R.anim.fadein);
       tt.setAnimation(anim1);
        TextView tt1 = (TextView) findViewById(R.id.tt1);
        Animation anim2 = AnimationUtils.loadAnimation(this,R.anim.fadein);
        tt1.setAnimation(anim2);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this,MainActivity.class));
                finish();
            }
        },4000);

    }
}
