package com.example.shobojit.siuroutine.viewpager_Routine.Fragment_model;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.shobojit.siuroutine.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by SHOBOJIT on 4/16/2017.
 */

public class Sat extends Fragment {
    View v;
    ListView satList;
    SharedPreferences preferences;
    String dptName;
    List<String> SatClass,SatRoom,SatTeacher,SatStart,SatEnd;
    String Data;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.sat_list,container,false);
        getDptName();
        getJsonData();
        Intialized(v);
        return v;
    }

    void Intialized(View v){
    satList = (ListView) v.findViewById(R.id.satlist);
    }

    void getDptName(){
        SatClass = new ArrayList<>();
        SatRoom = new ArrayList<>();
        SatTeacher = new ArrayList<>();
        SatStart = new ArrayList<>();
        preferences = getActivity().getPreferences(Context.MODE_PRIVATE);
        dptName = preferences.getString("Dpt", "null");
        Data =  preferences.getString("Routine","null");
    }
    void getJsonData(){
        try {
            JSONObject js = new JSONObject(Data);
            JSONArray js1 = new JSONArray(dptName);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

class  SatAdapter extends ArrayAdapter{

    public SatAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }
}
