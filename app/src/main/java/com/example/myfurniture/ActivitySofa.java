package com.example.myfurniture;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ActivitySofa extends AppCompatActivity {

    private CardView home;
    private CardView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sofa);

        home = findViewById(R.id.home_sofa);
        back = findViewById(R.id.back_sofa);

        home.setOnClickListener(v -> {
            Intent intent = new Intent(ActivitySofa.this, MainActivity.class);
            startActivity(intent);
        });

        back.setOnClickListener(v -> {
            Intent intent = new Intent(ActivitySofa.this, MenuActivity.class);
            startActivity(intent);
        });
    }
}