package com.example.tarea_activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_text);

        Button btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(TextActivity.this, MainActivity.class);
            startActivity(intent);
        });

        TextView textView = findViewById(R.id.txtvw);
        EditText editText = findViewById(R.id.editTextText);
        EditText editTextPassword = findViewById(R.id.editTextTextPassword);
        EditText editTextEmail = findViewById(R.id.editTextTextEmailAddress);

        textView.setOnClickListener(v -> Toast.makeText(TextActivity.this, "TextView clicked. Text: " + textView.getText(), Toast.LENGTH_SHORT).show());

        editText.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                Toast.makeText(TextActivity.this, "EditText para normal.", Toast.LENGTH_SHORT).show();
            }
        });

        editTextPassword.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                Toast.makeText(TextActivity.this, "EditText para password.", Toast.LENGTH_SHORT).show();
            }
        });

        editTextEmail.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                Toast.makeText(TextActivity.this, "EditText para email address.", Toast.LENGTH_SHORT).show();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}