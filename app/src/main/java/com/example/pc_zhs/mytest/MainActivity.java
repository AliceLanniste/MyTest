package com.example.pc_zhs.mytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: MainActivity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: Start Activity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: resume");
    }

    @Override
    protected void onPause()
    {    super.onPause();
        Log.i(TAG, "onPause: pause Activity");
    }
    
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: Stop Activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
