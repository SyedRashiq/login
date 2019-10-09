package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button reg,log;
    EditText editText1,editText2,editText3,editText4,editText5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reg=findViewById(R.id.btnreg);
        log=findViewById(R.id.btnlogin);
        editText1=findViewById(R.id.etname);
        editText2=findViewById(R.id.etadd);
        editText3=findViewById(R.id.etemail);
        editText4=findViewById(R.id.etuname);
        editText5=findViewById(R.id.etpass);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=editText1.getText().toString();
                String address=editText2.getText().toString();
                String email=editText3.getText().toString();
                String username=editText4.getText().toString();
                String password=editText5.getText().toString();
                String type="reg";
                BackgroundTask backgroundTask=new BackgroundTask(getApplicationContext());
                backgroundTask.execute(type,name,address,email,username,password);

            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,login.class);
                startActivity(i);
            }
        });


    }
}
