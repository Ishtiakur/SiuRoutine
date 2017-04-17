package com.example.shobojit.siuroutine.viewpager_Routine;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.shobojit.siuroutine.R;
import com.example.shobojit.siuroutine.viewpager_Routine.Fragment_model.Mon;
import com.example.shobojit.siuroutine.viewpager_Routine.Fragment_model.Sat;
import com.example.shobojit.siuroutine.viewpager_Routine.Fragment_model.Sun;
import com.example.shobojit.siuroutine.viewpager_Routine.Fragment_model.Thu;
import com.example.shobojit.siuroutine.viewpager_Routine.Fragment_model.Tue;
import com.example.shobojit.siuroutine.viewpager_Routine.Fragment_model.Wed;

import java.util.ArrayList;
import java.util.List;

public class RoutineDetail extends AppCompatActivity {
    ViewPager vp;
    TabLayout tb;
    Context cn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine_detail);
        cn=this;
        Initialize();
        SetupViewPager(vp);
        tb.setupWithViewPager(vp);

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

    }

    void Initialize (){
        vp = (ViewPager) findViewById(R.id.vp);
        tb = (TabLayout) findViewById(R.id.tab);

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
