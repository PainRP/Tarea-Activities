package com.example.tarea_activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btnTextActivity = findViewById(R.id.btnTextActivity);
        btnTextActivity.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TextActivity.class);
            startActivity(intent);
        });

        Button btnButtonActivity = findViewById(R.id.btnButtonActivity);
        btnButtonActivity.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
            startActivity(intent);
        });

        Button btnWidgetsActivity = findViewById(R.id.btnWidgetsActivity);
        btnWidgetsActivity.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WidgetsActivity.class);
            startActivity(intent);
        });

        Button btnLayouts = findViewById(R.id.btnLayouts);
        btnLayouts.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LayoutActivity.class);
            startActivity(intent);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}