package com.example.minip;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login, register, skip ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //hide the action bar
        getSupportActionBar().hide();
        // call buttons by id
        login =(Button) findViewById(R.id.l0g1n8tn);
        register =(Button) findViewById(R.id.regi5ter8tn);
        skip =(Button) findViewById(R.id.sk1p8tn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Login has been clicked", Toast.LENGTH_LONG).show();

                Intent qq = new Intent(MainActivity.this,SignIn_Activity.class);
                startActivity(qq);

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "register has been clicked", Toast.LENGTH_LONG).show();

                Intent ww = new Intent(MainActivity.this,SignUp.class);
                startActivity(ww);

            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "skip has been clicked", Toast.LENGTH_LONG).show();

                Intent vv = new Intent(MainActivity.this,categories.class);
                startActivity(vv);

            }
        });

    }
}