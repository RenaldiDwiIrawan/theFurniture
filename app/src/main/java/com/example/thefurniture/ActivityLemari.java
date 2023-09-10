package com.example.thefurniture;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ActivityLemari extends AppCompatActivity {

    private CardView home;
    private CardView back;
    private CardView ar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lemari);

        home = findViewById(R.id.home_lemari);
        back = findViewById(R.id.back_lemari);
        ar1 = findViewById(R.id.card1_lemari);

        home.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityLemari.this, MainActivity.class);
            startActivity(intent);
        });

        back.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityLemari.this, MenuActivity.class);
            startActivity(intent);
        });
        ar1.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityLemari.this, ActivityARLemari1.class);
            startActivity(intent);
        });
    }
}