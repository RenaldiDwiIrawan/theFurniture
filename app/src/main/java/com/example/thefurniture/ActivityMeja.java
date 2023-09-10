package com.example.thefurniture;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ActivityMeja extends AppCompatActivity {

    private CardView home;
    private CardView back;
    private CardView ar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meja);

        home = findViewById(R.id.home_meja);
        back = findViewById(R.id.back_meja);
        ar1 = findViewById(R.id.card1_meja);

        home.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityMeja.this, MainActivity.class);
            startActivity(intent);
        });

        back.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityMeja.this, MenuActivity.class);
            startActivity(intent);
        });

        ar1.setOnClickListener(v ->{
            Intent intent = new Intent(ActivityMeja.this, ActivityARMeja1.class);
            startActivity(intent);
        });
    }
}