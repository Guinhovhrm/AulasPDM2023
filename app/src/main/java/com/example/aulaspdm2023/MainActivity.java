package com.example.aulaspdm2023;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnMemoria, btnCalcSimples, btnCalc2, btnConversor, btnIMC;
    Button btnOffice;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMemoria = findViewById(R.id.btnMemoria);
        btnMemoria.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view){
                Intent in = new Intent(MainActivity.this, activityMemoria.class);
                startActivity(in);
            }
        });

        btnCalc2 = findViewById(R.id.btnCalc2);
        btnCalc2.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view){
                Intent in = new Intent(MainActivity.this, activityCalculadora2Telas.class);
                startActivity(in);
            }
        });
        btnCalcSimples = findViewById(R.id.btnCalcSimples);
        btnCalcSimples.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view){
                Intent in = new Intent(MainActivity.this, activityCalculadoraSimples.class);
                startActivity(in);
            }
        });
        btnConversor = findViewById(R.id.btnConversor);
        btnConversor.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view){
                Intent in = new Intent(MainActivity.this, activityConversor.class);
                startActivity(in);
            }
        });
        btnIMC = findViewById(R.id.btnIMC);
        btnIMC.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view){
                Intent in = new Intent(MainActivity.this, activityCalculoIMC.class);
                startActivity(in);
            }
        });
        btnOffice = findViewById(R.id.btnOffice);
        btnOffice.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view){
                Intent in = new Intent(MainActivity.this, activityOffice.class);
                startActivity(in);
            }
        });

    }
}
