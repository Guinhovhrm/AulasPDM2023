package com.example.aulaspdm2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activityCalculadoraSimples extends AppCompatActivity {
    Button btnVoltar;

    Button btnMais, btnMenos, btnVezes, btnDiv;
    EditText edN1, edN2, edN3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadorasimples);
        edN1 = findViewById(R.id.edN1);
        edN2 = findViewById(R.id.edN2);
        edN3 = findViewById(R.id.edN3);
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
                double n2 = Double.parseDouble(edN2.getText().toString());
                double soma = n1 + n2;
                String somaSt = String.valueOf(soma);
                edN3.setText(somaSt);
            }
        });
        btnMenos = findViewById(R.id.btnMenos);
        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(edN1.getText().toString());
                double n2 = Double.parseDouble(edN2.getText().toString());
                double sub = n1 - n2;
                String subSt = String.valueOf(sub);
                edN3.setText(subSt);
            }
        });
        btnVezes = findViewById(R.id.btnVezes);
        btnVezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(edN1.getText().toString());
                double n2 = Double.parseDouble(edN2.getText().toString());
                double mult = n1 * n2;
                String multSt = String.valueOf(mult);
                edN3.setText(multSt);
            }
        });
        btnDiv = findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(edN1.getText().toString());
                double n2 = Double.parseDouble(edN2.getText().toString());
                double div = n1 / n2;
                String divSt = String.valueOf(div);
                edN3.setText(divSt);

            }
        });





    }
}