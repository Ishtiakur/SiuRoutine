package com.example.shobojit.siuroutine.viewpager_Routine.Fragment_model;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.shobojit.siuroutine.Model.SharedPreferencesMOdel;
import com.example.shobojit.siuroutine.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SHOBOJIT on 4/16/2017.
 */

public class Mon  extends Fragment {
    View v;
    ListView MonList;
    SharedPreferences preferences;
    String dptName;
    Context cn;
    List<String> MonClass,MonRoom,MonTeacher,MonStart,MonEnd;
    String Data;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.mon_list,container,false);
        cn = getActivity().getApplicationContext();
        preferences =  getActivity().getPreferences(Context.MODE_PRIVATE);
        getDptName();
        getJsonData();
        Intialized(v);

        return v;
    }

    void Intialized(View v){
        MonList = (ListView) v.findViewById(R.id.monlist);
        MonList.setAdapter(new MonAdapter(getActivity(),MonClass,MonRoom,MonTeacher,MonStart,MonEnd));
    }

    void getDptName(){
        MonClass = new ArrayList<>();
        MonRoom = new ArrayList<>();
        MonTeacher = new ArrayList<>();
        MonStart = new ArrayList<>();
        MonEnd = new ArrayList<>();
        // preferences = getActivity().getPreferences(cn.MODE_PRIVATE);
        dptName = new SharedPreferencesMOdel().getDptName();
        Data = new SharedPreferencesMOdel().getJsonData();
        //dptName = preferences.getString("Dpt", "null");
        //Toast.makeText(cn,dptName,Toast.LENGTH_LONG).show();
        //Data =  preferences.getString("Routine","null");

    }


    void getJsonData(){
        try {
            JSONObject js = new JSONObject(Data);
            JSONObject js1 = js.getJSONObject(dptName);
            JSONArray js2 = js1.getJSONArray("MON");
            for (int i = 0;i<js2.length();i++){
                MonClass.add(js2.getJSONObject(i).getString("name"));
                MonRoom.add(js2.getJSONObject(i).getString("room"));
                MonTeacher.add(js2.getJSONObject(i).getString("tname"));
                MonStart.add(js2.getJSONObject(i).getString("start"));
                MonEnd.add(js2.getJSONObject(i).getString("end"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}


class  MonAdapter extends ArrayAdapter {
    private Activity cn;
    List <String> clss,room,teacher,start,end;
    public MonAdapter( Context context, List<String> clss,List<String> room,List<String> teacher,List<String> start,List<String> end) {
        super(context,0, clss);
        this.cn = (Activity) context;
        this.clss=clss;
        this.room=room;
        this.teacher = teacher;
        this.start =start;
        this.end=end;
    }

    private static class ViewHolder {
        TextView classname,roomno,teachername,starttime,endtime;
    }


    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater;
        ViewHolder holder;

        if (view == null) {
            holder = new ViewHolder();
            inflater = cn.getLayoutInflater();
            view = inflater.from(cn).inflate(R.layout.routine_list_view, parent, false);
            holder.classname = (TextView) view.findViewById(R.id.classname);
            holder.roomno = (TextView) view.findViewById(R.id.roomno);
            holder.teachername = (TextView) view.findViewById(R.id.tname);
            holder.starttime = (TextView) view.findViewById(R.id.starttime);
            holder.endtime = (TextView) view.findViewById(R.id.endtime);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        holder.classname.setText(clss.get(position));
        holder.roomno.setText(room.get(position));
        holder.teachername.setText(teacher.get(position));
        holder.starttime.setText(start.get(position));
        holder.endtime.setText(end.get(position));


        return view;
    }
}






