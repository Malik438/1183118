package edu.cs.birzeit.asse1;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;

public class Days  {
    ArrayList<String> days = new ArrayList<>();



    public Days(){
        days.add("sutrday");
        days.add("sunday");
        days.add("monday");
        days.add("Tuesday");
        days.add("wensday");
        days.add("thursday");
        days.add("friday");
    }
    public ArrayList<String> getDays() {
        return days;
    }

    public void setDays(ArrayList<String> days) {
        this.days = days;
    }

}
