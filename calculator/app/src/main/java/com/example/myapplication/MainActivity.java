package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView p;
    EditText e1,e2;
    Button add,mul,div,sub;
    int a,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p=findViewById(R.id.p);
        e1=findViewById(R.id.t1);
        e2=findViewById(R.id.t2);
        add=findViewById(R.id.add);
        div=findViewById(R.id.div);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        add.setOnClickListener(new View.OnClickListener(){
             @Override
                     public void onClick(View v)
                     {
                         try{a=Integer.parseInt(e1.getText().toString());
                         c=Integer.parseInt(e2.getText().toString());}
                         catch (Exception e)
                         {}
                         p.setText((a+c)+"");
                     }
        });
        mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                try{a=Integer.parseInt(e1.getText().toString());
                    c=Integer.parseInt(e2.getText().toString());}
                catch (Exception e)
                {}
                p.setText((a*c)+"");
            }
        });

        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                try{a=Integer.parseInt(e1.getText().toString());
                    c=Integer.parseInt(e2.getText().toString());}
                catch (Exception e)
                {}
                p.setText((a/c)+"");
            }
        });

        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                try{a=Integer.parseInt(e1.getText().toString());
                    c=Integer.parseInt(e2.getText().toString());}
                catch (Exception e)
                {}
                p.setText((a-c)+"");
            }
        });
    }


    }

