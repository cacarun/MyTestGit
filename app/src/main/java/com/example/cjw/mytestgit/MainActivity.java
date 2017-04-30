package com.example.cjw.mytestgit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "dev_2.0 onCreate");
    }

    public void go(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "dev_2.0 onResume");
    }
}
