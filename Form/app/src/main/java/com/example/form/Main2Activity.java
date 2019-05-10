package com.example.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView e1, e2, e3, e4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1 = findViewById(R.id.t1);
        e2 = findViewById(R.id.t2);
        e3 = findViewById(R.id.t3);
        e4 = findViewById(R.id.t4);

        Intent i=getIntent();

        e1.setText("Name : "+i.getStringExtra("Name"));
        e2.setText("Roll No : "+i.getStringExtra("Roll"));
        e3.setText("Course : "+i.getStringExtra("course"));
        e4.setText("Branch : "+i.getStringExtra("branch"));


    }
}
