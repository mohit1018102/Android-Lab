package com.example.calling;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText t1;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.editText);
        b=findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v)
            {
                String num=t1.getText().toString();

                Intent i=new Intent(Intent.ACTION_CALL, Uri.parse("tel"+num));

                try{
                    startActivity(i);
                }
                catch(SecurityException e)
                {
                    Log.d("MSG","ERROR");
                }
            }
        });
    }
}
