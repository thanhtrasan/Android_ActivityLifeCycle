package com.example.trasan.activitylifecycle;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity Life Cycle","onCreate ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity Life Cycle","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity Life Cycle","oResume ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity Life Cycle","onPause ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity Life Cycle","onStop ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity Life Cycle","onRestart ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity Life Cycle","onDestroy ");
    }
}
