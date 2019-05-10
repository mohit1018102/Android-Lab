package com.example.callbacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("msg1:","Created");
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("msg2 :","Started");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("msg3:","Resumed");
    } @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("msg4 :","Paused");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("msg5 :","Stopped");
    }
    protected void onRestart()
    {
        super.onRestart();
        Log.d("msg6 :","Restarted");
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("msg5 :","Destroyed");
    }

}
