package com.example.form;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.time.Instant;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText e1, e2, e3, e4;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.name);
        e2 = findViewById(R.id.roll);
        e3 = findViewById(R.id.course);
        e4 = findViewById(R.id.branch);
        b = findViewById(R.id.button);
        b.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        String n = e1.getText().toString();
        String r = e2.getText().toString();
        String c = e3.getText().toString();
        String branch = e4.getText().toString();

         Intent i=new Intent(MainActivity.this,Main2Activity.class);
         i.putExtra("Name",n);
         i.putExtra("Roll",r);
         i.putExtra("course",c);
         i.putExtra("branch",branch);
         startActivity(i);
    }
}