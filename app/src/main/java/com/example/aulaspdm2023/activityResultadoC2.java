package com.example.aulaspdm2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activityResultadoC2 extends AppCompatActivity {

    Button btnEdit;
    TextView tvResultado;
    Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_c2);

        tvResultado = findViewById(R.id.tvResultado);
        in = getIntent();
        String ValorMais = in.getStringExtra("ValorMais");
        tvResultado.setText(ValorMais);
        String ValorMenos = in.getStringExtra("ValorMenos");
        tvResultado.setText(ValorMenos);
        String ValorMult = in.getStringExtra("ValorMult");
        tvResultado.setText(ValorMult);
        String ValorDiv = in.getStringExtra("ValorDiv");
        tvResultado.setText(ValorDiv);

        btnEdit = findViewById(R.id.btnEdit);
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(activityResultadoC2.this, activityCalculadora2Telas.class);
                startActivity(in);
            }
        });





    }
}