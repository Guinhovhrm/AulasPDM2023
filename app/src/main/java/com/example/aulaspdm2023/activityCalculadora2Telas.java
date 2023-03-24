package com.example.aulaspdm2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activityCalculadora2Telas extends AppCompatActivity {

    Button btnVoltarC2;
    Button btnMaisC2, btnMenosC2, btnVezesC2, btnDivC2;
    EditText etN1, etN2;
    String  valorFinal;

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
        btnMaisC2 = findViewById(R.id.btnMaisC2);
        btnMaisC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(etN1.getText().toString());
                double n2 = Double.parseDouble(etN2.getText().toString());
                double soma = n1 + n2;
                valorFinal = String.valueOf(soma);
                Intent in = new Intent(activityCalculadora2Telas.this, activityResultadoC2.class);
                in.putExtra("ValorMenos", valorFinal);
                in.putExtra("ValorMult", valorFinal);
                in.putExtra("ValorMais", valorFinal);
                in.putExtra("ValorDiv", valorFinal);
                startActivity(in);
            }
        });
        btnMenosC2 = findViewById(R.id.btnMenosC2);
        btnMenosC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(etN1.getText().toString());
                double n2 = Double.parseDouble(etN2.getText().toString());
                double sub = n1 - n2;
                valorFinal = String.valueOf(sub);
                Intent in = new Intent(activityCalculadora2Telas.this, activityResultadoC2.class);
                in.putExtra("ValorMenos", valorFinal);
                in.putExtra("ValorMult", valorFinal);
                in.putExtra("ValorMais", valorFinal);
                in.putExtra("ValorDiv", valorFinal);
                startActivity(in);
            }
        });
        btnVezesC2 = findViewById(R.id.btnVezesC2);
        btnVezesC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(etN1.getText().toString());
                double n2 = Double.parseDouble(etN2.getText().toString());
                double mult = n1 * n2;
                valorFinal = String.valueOf(mult);
                Intent in = new Intent(activityCalculadora2Telas.this, activityResultadoC2.class);
                in.putExtra("ValorMenos", valorFinal);
                in.putExtra("ValorMult", valorFinal);
                in.putExtra("ValorMais", valorFinal);
                in.putExtra("ValorDiv", valorFinal);
                startActivity(in);
            }
        });
        btnDivC2 = findViewById(R.id.btnDivC2);
        btnDivC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(etN1.getText().toString());
                double n2 = Double.parseDouble(etN2.getText().toString());
                double div = n1 / n2;
                valorFinal = String.valueOf(div);
                Intent in = new Intent(activityCalculadora2Telas.this, activityResultadoC2.class);
                in.putExtra("ValorMenos", valorFinal);
                in.putExtra("ValorMult", valorFinal);
                in.putExtra("ValorMais", valorFinal);
                in.putExtra("ValorDiv", valorFinal);
                startActivity(in);
            }
        });

    }
}