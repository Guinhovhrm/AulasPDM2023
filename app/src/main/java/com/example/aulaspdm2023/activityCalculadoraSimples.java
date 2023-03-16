package com.example.aulaspdm2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activityCalculadoraSimples extends AppCompatActivity {
    Button btnVoltar;
    Button btnCalcular;
    Button btnMais;
    EditText edN1, edN2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadorasimples);
        edN1 = findViewById(R.id.edN1);
        edN2 = findViewById(R.id.edN2);
        btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(activityCalculadoraSimples.this, MainActivity.class);
                startActivity(in);
            }
        });

        btnMais = findViewById(R.id.btnMais);
        btnMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(edN1.getText().toString());
                double n2 = Double.parseDouble(edN1.getText().toString());
                double soma = n1 + n2;


            }
        });




    }
}