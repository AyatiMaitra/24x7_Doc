package com.example.introduction;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText etUsername, etPassword;
    Button btSubmit;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        etUsername = findViewById(R.id.et_usename);
        etPassword = findViewById(R.id.et_password);
        btSubmit = findViewById(R.id.bt_submit);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etUsername.getText().toString().equals("admin") &&
                        etPassword.getText().toString().equals("admin")) {

                    openhome();


                } else {
                    Toast.makeText(getApplicationContext(),
                            "Invalid Username and Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
        public void openhome(){
            Intent intent = new Intent(this, home.class);
            startActivity(intent);

        }






}














