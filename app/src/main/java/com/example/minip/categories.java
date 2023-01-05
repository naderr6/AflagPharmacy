package com.example.minip;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class categories extends AppCompatActivity {

    Button additem, MedicalDevices, paracetamol, BabyFood, DentalCare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        //hide the action bar
        getSupportActionBar().hide();
        //call by id
        additem = (Button) findViewById(R.id.add1tem8tn);
        MedicalDevices = (Button) findViewById(R.id.med1ca1dvice8tn);
        paracetamol = (Button) findViewById(R.id.Parac8am0l8tn);
        BabyFood = (Button) findViewById(R.id.ba8yf00d8tn);
        DentalCare = (Button) findViewById(R.id.denta1care8tn);

        additem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(categories.this, "Add Item has been clicked", Toast.LENGTH_SHORT).show();
                Intent si = new Intent(categories.this,NewClass.class);
                startActivity(si);
            }
        });
        //move to next page
        MedicalDevices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(categories.this, "Medical Devices has been clicked", Toast.LENGTH_LONG).show();

                Intent ww = new Intent(categories.this,MedicalDevices.class);
                startActivity(ww);

            }
        });

        paracetamol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(categories.this, "paracetamol has been clicked", Toast.LENGTH_LONG).show();

                Intent qq = new Intent(categories.this,Paracetamol.class);
                startActivity(qq);

            }
        });

        BabyFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(categories.this, "Baby Food has been clicked", Toast.LENGTH_LONG).show();

                Intent ss = new Intent(categories.this,BabyFood.class);
                startActivity(ss);

            }
        });

        DentalCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(categories.this, "Dental Care has been clicked", Toast.LENGTH_LONG).show();

                Intent ww = new Intent(categories.this,DentalCare.class);
                startActivity(ww);

            }
        });

    }
}