package edu.cs.birzeit.asse1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private EditText heighttext;
    private EditText wighttext;
    private EditText Bmitext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        heighttext = findViewById(R.id.Heightid);
        wighttext = findViewById(R.id.weightid);
        Bmitext = findViewById(R.id.bmiid);

    }

    public void btnbmiOnClick(View view) {
        Double height = Double.parseDouble(heighttext.getText().toString());
        Double wight = Double.parseDouble(wighttext.getText().toString());
        Double Bmi = wight / Math.pow(height, 2);
        Bmitext.setText("your Bmi is : " + Bmi);
        //Days days = new Days();
        //Day day = new Day();
          /*  for(int i = 0 ; i < days.getDays().size() ; i++){
                if(days.getDays().get(i).equals(day.hashMap.get(days.getDays().get(i)))){
                    if(days.getDays().get(i).equals("sutrday")) {
                        day.hashMap.get(days.getDays().get(i)).setBreakfast("1- Cup of milk  \n 2- benaut butter + shofan + banana");
                        day.hashMap.get(days.getDays().get(i)).setLunch("1- Cup of milk  \n 2- benaut butter + shofan + banana");
                        day.hashMap.get(days.getDays().get(i)).setDinner("1- Cup of milk  \n 2- benaut butter + shofan + banana");
                    }else if(days.getDays().get(i).equals("Sunday")){
                        day.hashMap.get(days.getDays().get(i)).setBreakfast("1- Sunday ");
                        day.hashMap.get(days.getDays().get(i)).setLunch("Sunday");
                        day.hashMap.get(days.getDays().get(i)).setDinner("Sunday");

                    }else if(days.getDays().get(i).equalsIgnoreCase("monday")){
                        day.hashMap.get(days.getDays().get(i)).setBreakfast("1- monday ");
                        day.hashMap.get(days.getDays().get(i)).setLunch("monday");
                        day.hashMap.get(days.getDays().get(i)).setDinner("monday");
                    } else  if(days.getDays().get(i).equalsIgnoreCase("Thursday")){
                        day.hashMap.get(days.getDays().get(i)).setBreakfast("1- Thursday ");
                        day.hashMap.get(days.getDays().get(i)).setLunch("Thursday");
                        day.hashMap.get(days.getDays().get(i)).setDinner("Thursday");

                    } else if(days.getDays().get(i).equalsIgnoreCase("wensday")){
                        day.hashMap.get(days.getDays().get(i)).setBreakfast("1- wensday ");
                        day.hashMap.get(days.getDays().get(i)).setLunch("wensday");
                        day.hashMap.get(days.getDays().get(i)).setDinner("wensday");


                    } else if(days.getDays().get(i).equalsIgnoreCase("thursday")){
                        day.hashMap.get(days.getDays().get(i)).setBreakfast("1- thursday ");
                        day.hashMap.get(days.getDays().get(i)).setLunch("thursday");
                        day.hashMap.get(days.getDays().get(i)).setDinner("thursday");



                    }else  if(days.getDays().get(i).equalsIgnoreCase("Friday")){
                        day.hashMap.get(days.getDays().get(i)).setBreakfast("1- Friday ");
                        day.hashMap.get(days.getDays().get(i)).setLunch("Friday");
                        day.hashMap.get(days.getDays().get(i)).setDinner("Friday");

                    }



                }*/
        Toast.makeText(this, "dayString", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "dayStringgggggg", Toast.LENGTH_SHORT).show();

        Day day = new Day();
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor editor = prefs.edit();
            Gson gson = new Gson();
        ArrayList<Day> list = day.filldata(Bmi);

            String dayString = gson.toJson(list);

            editor.putString("123", dayString);
            editor.commit();
            Toast.makeText(this, dayString, Toast.LENGTH_SHORT).show();

        }

    }

