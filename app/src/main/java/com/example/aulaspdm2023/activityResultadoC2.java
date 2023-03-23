package com.example.aulaspdm2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activityResultadoC2 extends AppCompatActivity {

    TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_c2);

        tvResultado = findViewById(R.id.tvResultado);
        Intent in = getIntent();

    }
}