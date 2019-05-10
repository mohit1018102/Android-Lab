package com.example.datasend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText e1,e2,e3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i=getIntent();
        e1=findViewById(R.id.n);
        e2=findViewById(R.id.u);
        e3=findViewById(R.id.p);
        e1.setEnabled(false);
        e2.setEnabled(false);
        e3.setEnabled(false);
        e1.setText(i.getStringExtra("name"));
        e2.setText(i.getStringExtra("user"));
        e3.setText(i.getStringExtra("password"));
    }
}
