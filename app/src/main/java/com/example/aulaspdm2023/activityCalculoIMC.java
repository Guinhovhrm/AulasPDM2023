package com.example.aulaspdm2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class activityCalculoIMC extends AppCompatActivity {

    Button btnCalcular;
    EditText edPeso, edAltura;
    TextView tvResultadoIMC, tvGrau;

    DecimalFormat df = new DecimalFormat("0.0");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculoimc);
        //declarando as variaveis
        btnCalcular = findViewById(R.id.btnCalcular);
        edPeso = findViewById(R.id.edPeso);
        edAltura = findViewById(R.id.edAltura);
        tvResultadoIMC = findViewById(R.id.tvResultadoIMC);
        tvGrau = findViewById(R.id.tvGrau);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double peso = Double.parseDouble(edPeso.getText().toString());
                double altura = Double.parseDouble(edAltura.getText().toString());
                double imc = peso / ((altura/100) * (altura/100));
                System.out.println(imc);
                String tvIMC = String.valueOf(df.format(imc));
                System.out.println(tvIMC);
                tvResultadoIMC.setText("IMC: " + tvIMC);

                if (imc < 18.5){
                    tvGrau.setText("Magreza");
                } else if (imc >= 18.5 && imc < 25) {
                    tvGrau.setText("Normal");
                } else if (imc >= 25 && imc < 30 ) {
                    tvGrau.setText("Sobrepeso");
                } else if (imc >= 30 && imc < 40) {
                    tvGrau.setText("Obesidade");
                }else{
                    tvGrau.setText("Obesidade Grave");
                }

            }
        });

    }
}