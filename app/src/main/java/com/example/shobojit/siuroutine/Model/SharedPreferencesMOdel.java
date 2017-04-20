package com.example.shobojit.siuroutine.Model;

/**
 * Created by SHOBOJIT on 4/17/2017.
 */

public class SharedPreferencesMOdel {
    private static String JsonData ;
   private static String DptName;



    public String getJsonData() {
        return JsonData;
    }

    public String getDptName() {
        return DptName;
    }

    public void setJsonData(String jsonData) {
        JsonData = jsonData;
    }

    public void setDptName(String dptName) {
        DptName = dptName;
    }
}
