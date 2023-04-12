package com.example.aulaspdm2023;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubstituirChar extends AppCompatActivity {

    Button btnSaveWord, btnLoc, btnSub;
    EditText edWord, edLocSub, edNewChar;
    TextView tvPosit;
    String palavra, localizado, newChar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_substituir_char);
        btnSaveWord = findViewById(R.id.btnSaveWord);
        btnLoc = findViewById(R.id.btnLoc);
        btnSub = findViewById(R.id.btnSub);
        edWord = findViewById(R.id.edWord);
        edLocSub = findViewById(R.id.edLocSub);
        edNewChar = findViewById(R.id.edNewChar);
        tvPosit = findViewById(R.id.tvPosit);

        btnSaveWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                palavra = edWord.getText().toString().toLowerCase();
            }
        });

        btnLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                localizado = edLocSub.getText().toString().toLowerCase();
                tvPosit.setText(String.valueOf(palavra.indexOf(localizado)));
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                localizado = edLocSub.getText().toString().toLowerCase();
                newChar = edNewChar.getText().toString();
                edWord.setText(palavra.replace(localizado, newChar));

            }
        });

    }
}