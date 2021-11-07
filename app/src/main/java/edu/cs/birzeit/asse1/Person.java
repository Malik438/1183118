package edu.cs.birzeit.asse1;

import android.widget.Toast;

import java.util.ArrayList;

public class Person {
    private String Name ;
    private  int Password ;
    private  boolean islogged ;
    ArrayList<Person> array = new ArrayList<>();
    public Person(){
        array.add(new Person("malik",123,true)) ;
        array.add(new Person("samer",1234,true));
        array.add(new Person("Roa",12345,true));
    }
    public Person(String name, int password, boolean islogged) {
        Name = name;
        Password = password;
        this.islogged = islogged;

    }
    public  boolean  chcekexiting(String name , int pass){
        for (int i =0 ; i<array.size();i++){
            if(array.get(i).getName() == name && array.get(i).getPassword() == pass){
                return  true;
            }


        }
        return  false ;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int password) {
        Password = password;
    }

    public boolean isIslogged() {
        return islogged;
    }

    public void setIslogged(boolean islogged) {
        this.islogged = islogged;
    }
}
