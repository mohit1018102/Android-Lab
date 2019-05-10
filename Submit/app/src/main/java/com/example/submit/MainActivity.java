package com.example.submit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("msg 1:","onCreate called");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("msg2:","onstart called");
    }

    @Override
    protected void onResume()
    { super.onResume();
      Log.d("msg3:","onResume called");

    }

    @Override
    protected void onPause()
    { super.onPause();
        Log.d("msg4:","onPause called");
    }

    @Override
    protected void onStop()
    { super.onStop();
        Log.d("msg5:","onStop called");

    }

    @Override
    protected void onRestart()
    { super.onRestart();
      Log.d("msg6:","onRestart called");
    }

    @Override
    protected void onDestroy()
    { super.onDestroy();
        Log.d("msg7:","onDestroy called");

    }
}
