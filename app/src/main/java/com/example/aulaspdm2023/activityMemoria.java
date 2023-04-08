package com.example.aulaspdm2023;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activityMemoria extends AppCompatActivity {

    Button btnShowWord, btnComparar;
    TextView tvWord;
    EditText edChute;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogodamemoria);
        btnShowWord = findViewById(R.id.btnShowWord);
        btnComparar = findViewById(R.id.btnComparar);
        tvWord = findViewById(R.id.tvWord);
        edChute = findViewById(R.id.edChute);
        Intent in = new Intent();
        btnShowWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (tvWord.getText() == ""){
                tvWord.setText("GuinhoBonito");
                btnShowWord.setText("Esconder");
                }else{
                    tvWord.setText("");

                }


            }
        });


    }
}