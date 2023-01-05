package com.example.minip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DentalCare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dental_care);
        //hide the action bar
        getSupportActionBar().hide();
    }
}