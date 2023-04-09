package com.example.aulaspdm2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class MemoriaResultado extends AppCompatActivity {

    TextView tvResultadoMemoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memoria_resultado);
        Intent in = getIntent();
        tvResultadoMemoria = findViewById(R.id.tvResultadoMemoria);

        String resposta = in.getStringExtra("resposta");

        if (resposta.equals("Android Studio")) {
            tvResultadoMemoria.setText("Você acertou!".toUpperCase());
        } else {
            tvResultadoMemoria.setText("Você errou!".toUpperCase());
        }

    }
}