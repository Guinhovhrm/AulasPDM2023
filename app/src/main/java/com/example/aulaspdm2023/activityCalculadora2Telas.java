package com.example.aulaspdm2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activityCalculadora2Telas extends AppCompatActivity {

    Button btnVoltarC2, btnMostrar;
    Button btnMaisC2;
    Button btnMenosC2;
    Button btnVezesC2;
    Button btnDivC2;
    EditText etN1, etN2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora2telas);

        etN1 = findViewById(R.id.etN1);
        etN2 = findViewById(R.id.etN2);


        btnVoltarC2 = findViewById(R.id.btnVoltarC2);
        btnVoltarC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(activityCalculadora2Telas.this, MainActivity.class);
                startActivity(in);
            }
        });
        btnMostrar = findViewById(R.id.btnMostrar);
        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(activityCalculadora2Telas.this, activityResultadoC2.class);
                startActivity(in);
            }
        });
        btnMaisC2 = findViewById(R.id.btnMaisC2);
        btnMaisC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(etN1.getText().toString());
                double n2 = Double.parseDouble(etN2.getText().toString());
                double soma = n1 + n2;
                String somaSt = String.valueOf(soma);
                Intent in = new Intent();
                in.putExtra("ValorMais", somaSt);
                //edN3.setText(somaSt);
            }
        });
        btnMenosC2 = findViewById(R.id.btnMenosC2);
        btnMenosC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(etN1.getText().toString());
                double n2 = Double.parseDouble(etN2.getText().toString());
                double sub = n1 - n2;
                String subSt = String.valueOf(sub);
                Intent in = new Intent();
                in.putExtra("ValorMenos", subSt);
                //edN3.setText(subSt);
            }
        });
        btnVezesC2 = findViewById(R.id.btnVezesC2);
        btnVezesC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(etN1.getText().toString());
                double n2 = Double.parseDouble(etN2.getText().toString());
                double mult = n1 * n2;
                String multSt = String.valueOf(mult);
                Intent in = new Intent();
                in.putExtra("ValorMult", multSt);
                //edN3.setText(multSt);
            }
        });
        btnDivC2 = findViewById(R.id.btnDivC2);
        btnDivC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(etN1.getText().toString());
                double n2 = Double.parseDouble(etN2.getText().toString());
                double div = n1 / n2;
                String divSt = String.valueOf(div);
                Intent in = new Intent();
                in.putExtra("valorDiv", divSt);
                //edN3.setText(divSt);
            }
        });

    }
}