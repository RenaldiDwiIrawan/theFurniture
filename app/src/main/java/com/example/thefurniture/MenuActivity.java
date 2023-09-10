package com.example.thefurniture;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MenuActivity extends AppCompatActivity {

    private CardView lemari;
    private CardView meja;
    private CardView kursi;
    private CardView home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        lemari = findViewById(R.id.tombol1);
        kursi = findViewById(R.id.tombol2);
        meja = findViewById(R.id.tombol3);
        home  = findViewById(R.id.tombol4);

        lemari.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, ActivityLemari.class);
            startActivity(intent);
        });

        meja.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, ActivityMeja.class);
            startActivity(intent);
        });

        kursi.setOnClickListener(v ->{
            Intent intent = new Intent(MenuActivity.this, ActivitySofa.class);
            startActivity(intent);
        });

        home.setOnClickListener(v ->{
            Intent intent = new Intent(MenuActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}