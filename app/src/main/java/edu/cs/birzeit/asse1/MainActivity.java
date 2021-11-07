package edu.cs.birzeit.asse1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final  String Name = "NAME" ;
    public static final  String Pass = "PASS" ;
    public static final  String Flag = "FLAG" ;
    private EditText editname ;
    private EditText editpass ;
    private CheckBox chx ;
    private SharedPreferences preferences ;
    private SharedPreferences.Editor editor ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
        setupsharedprefernces();
        checkPrefs();
    }
    private  void setupsharedprefernces(){
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = preferences.edit();

    }
    private void setupViews(){
        editname = findViewById(R.id.usernameid);
        editpass = findViewById(R.id.passwordid);
        chx = findViewById(R.id.chxid);
    }
    private void checkPrefs(){
        boolean flag = preferences.getBoolean(Flag,false) ;
        if(flag){
                String name  = preferences.getString(Name,"");
                String password = preferences.getString(Pass,"");
            editname.setText(name);
            editpass.setText(password);
            chx.setChecked(true);
        }
    }

    public void btnloginOnClick(View view) {
        Person person = new Person();
        String name = editname.getText().toString();
        String password = editpass.getText().toString();


        if(person.chcekexiting(name,Integer.parseInt(password)) == false ){
        if(chx.isChecked()){
            editor.putString(Name,name);
            editor.putString(Pass,password);
            editor.putBoolean(Flag,true);
            editor.commit();

        }
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);

        } else {
            Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show();
        }
    }
}