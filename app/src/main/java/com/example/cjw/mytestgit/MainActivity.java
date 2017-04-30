package com.example.cjw.mytestgit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.cjw.mytestgit.util.StrUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("dev_1.0 1.screen: " + MainActivity.class.getSimpleName());
        testDev1("dev_1.0");
    }

    private void testDev1(String testStr) {
        if (!StrUtil.isEmpty(testStr)) {
            System.out.println("dev_1.0 2.screen: " + testStr);
        }
    }

    public void go(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
