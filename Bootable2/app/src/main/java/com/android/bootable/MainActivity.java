package com.android.bootable;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText e;
Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=findViewById(R.id.editText);
        b=findViewById(R.id.button);
       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String num = e.getText().toString();
               Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + num));
               try {
                   startActivity(i);
               } catch (SecurityException e) {
               }
           }
       });
    }

    }

