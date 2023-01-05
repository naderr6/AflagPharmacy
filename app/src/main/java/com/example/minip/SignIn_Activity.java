package com.example.minip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn_Activity extends AppCompatActivity {

    EditText LoginEmail, LoginPassword;
    Button LogInBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        //hide the action bar
        getSupportActionBar().hide();
        //call the button and edittext by their id
        LoginEmail = findViewById(R.id.EmailTV);
        LoginPassword = findViewById(R.id.Passw0rdTV);
        LogInBTN = findViewById(R.id.s1gn1n8tn);

        LogInBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (LoginEmail.getText().toString().equals("nader@mec.com") && LoginPassword.getText().toString().equals("4321")){
                    Toast.makeText(SignIn_Activity.this, "welcome back", Toast.LENGTH_SHORT).show();
                    Intent og = new Intent(getApplicationContext(),categories.class);
                    startActivity(og);
                }
                else
                {
                    Toast.makeText(SignIn_Activity.this, "Check Email/Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
