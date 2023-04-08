package com.example.aulaspdm2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class activityConversor extends AppCompatActivity {

    Button btnReal, btnDolar;
    EditText edValor, edValorConv;
    Intent in = new Intent();

    DecimalFormat df = new DecimalFormat("#.##");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);

        btnDolar = findViewById(R.id.btnDolar);
        btnReal = findViewById(R.id.btnReal);
        edValor = findViewById(R.id.edValor);
        edValorConv = findViewById(R.id.edValorConv);

        btnDolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num = Double.parseDouble(edValor.getText().toString());
                double dolar = num / 5;
                String convertido = String.valueOf(dolar);
                edValorConv.setText(convertido);

            }
        });
        btnReal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num = Double.parseDouble(edValor.getText().toString());
                double real = num * 5;
                String convertido = String.valueOf(real);
                edValorConv.setText(convertido);

            }
        });

    }
}