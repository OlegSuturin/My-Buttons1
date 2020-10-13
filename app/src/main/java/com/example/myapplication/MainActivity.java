package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void OnClickButton1(View view) {
        Log.d("qwer", "OnClickButton1: ");
    }

    public void OnClickButton2(View view) {
        Log.d("qwer", "OnClickButton2: ");
    }

    public void OnClickButton3(View view) {
        Log.d("qwer", "OnClickButton3: ");
    }
}