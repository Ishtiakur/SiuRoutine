package com.example.shobojit.siuroutine;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.flaviofaria.kenburnsview.KenBurnsView;

public class Kenburns extends AppCompatActivity {
    KenBurnsView kenBurnsView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kenburns);
        kenBurnsView = (KenBurnsView) findViewById(R.id.ken);

    }
}
