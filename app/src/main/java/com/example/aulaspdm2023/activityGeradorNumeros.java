package com.example.aulaspdm2023;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class activityGeradorNumeros extends AppCompatActivity {

    EditText edQtndNum;
    TextView tvNumeros;
    Button btnGerar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geradornumeros);
        btnGerar = findViewById(R.id.btnGerar);
        tvNumeros = findViewById(R.id.tvNumeros);
        edQtndNum = findViewById(R.id.edQtndNum);

        btnGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stQuantidade = String.valueOf(edQtndNum);
                int quantidade = Integer.parseInt(stQuantidade);
                System.out.println(quantidade);


            }
        });

    }
}