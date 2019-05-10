package com.example.datasend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    EditText e1,e2,e3;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    { super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      e1=findViewById(R.id.name);
      e2=findViewById(R.id.username);
      e3=findViewById(R.id.password);

      b=findViewById(R.id.button);

      b.setOnClickListener(new View.OnClickListener()
      {
          @Override
          public void onClick(View v)
          {
              String n=e1.getText().toString();
              String u=e2.getText().toString();
              String p=e3.getText().toString();
              Intent i=new Intent(MainActivity.this,Main2Activity.class);
              i.putExtra("name",n);
              i.putExtra("user",u);
              i.putExtra("password",p);
              startActivity(i);

          }
      });


    }
}