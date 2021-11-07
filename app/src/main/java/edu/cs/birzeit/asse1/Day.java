package edu.cs.birzeit.asse1;

import java.util.ArrayList;
import java.util.HashMap;

public class Day {
    private String Breakfast;
    private String lunch;
    private String Dinner;
    ArrayList<Day> arrayList;

    public Day() {
    }

    public Day(String breakfast, String lunch, String dinner) {
        Breakfast = breakfast;
        this.lunch = lunch;
        Dinner = dinner;
    }



    public ArrayList<Day> filldata(Double bmi) {
        Days days = new Days();
        //HashMap<String, Day> hashMap = new HashMap<>();
        if (bmi <= 18.5) {
        for (int i = 0; i < days.getDays().size(); i++) {
                if (days.getDays().get(i).equals("sutrday")) {
                    arrayList.add(new Day("sutrday","sutrday","sutrday"));
                } else if (days.getDays().get(i).equals("sunday")) {
                    arrayList.add(new Day
                            ("Sunday","Sunday","Sunday"));

                } else if (days.getDays().get(i).equalsIgnoreCase("monday")) {
                    arrayList.add(new Day
                            ("monday","monday","monday"));

                } else if (days.getDays().get(i).equalsIgnoreCase("Tuesday")) {
                    arrayList.add(new Day
                            ("Tuesday","Tuesday","Tuesday"));

                } else if (days.getDays().get(i).equalsIgnoreCase("wensday")) {

                    arrayList.add(new Day
                            ("wensday","wensday","wensday"));


                } else if (days.getDays().get(i).equalsIgnoreCase("thursday")) {
                    arrayList.add(new Day
                            ("thursday","thursday","thursday"));



                } else if (days.getDays().get(i).equalsIgnoreCase("Friday")) {
                    arrayList.add(new Day
                            ("Friday","Friday","Friday"));


                }
            }

        }
        return arrayList;
    }
}