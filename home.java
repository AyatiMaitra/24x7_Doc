package com.example.introduction;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;

public class home extends AppCompatActivity {
    CardView button;
    CardView button1;
    CardView button2;
    CardView button3;
    CardView button4;
    CardView button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        button =  findViewById(R.id.imageButton2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendetail();
            }
        });
        button1 = findViewById(R.id.imageButton3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openapointment();
            }
        });
        button2 =  findViewById(R.id.imageButton4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhospitalnearme();
            }
        });
        button3 =findViewById(R.id.imageButton5);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openselfcare();
            }
        });
        button4 =  findViewById(R.id.imageButton6);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlistofdoctors();
            }
        });
        button5 =  findViewById(R.id.imageButton7);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpharmacy();
            }
        });

    }
   public void opendetail() {
        Intent intent = new Intent(this, detail.class);
        startActivity(intent);
    }
    public void openapointment() {
        Intent intent = new Intent(this, apointment.class);
        startActivity(intent);
    }
    public void openhospitalnearme() {
        Intent intent = new Intent(this, hospitalnearme.class);
        startActivity(intent);
    }
    public void openselfcare() {
        Intent intent = new Intent(this, selfcare.class);
        startActivity(intent);
    }
    public void openlistofdoctors() {
        Intent intent = new Intent(this, listofdoctors.class);
        startActivity(intent);
    }
    public void openpharmacy() {
        Intent intent = new Intent(this, pharmacy.class);
        startActivity(intent);
    }
}
