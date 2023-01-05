package com.example.minip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Paracetamol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paracetamol);
        //hide the action bar
        getSupportActionBar().hide();
    }
}