package com.example.minip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BabyFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby_food);
        //hide the action bar
        getSupportActionBar().hide();
    }
}