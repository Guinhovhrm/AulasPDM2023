package com.example.aulaspdm2023;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnMemoria;
    Button btnCalcSimples;
    Button btnBath;
    Button btnRoom;
    Button btnRoom2;
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
            }
        });

        btnBath = findViewById(R.id.btnBath);
        btnBath.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view){
                Intent in = new Intent(MainActivity.this, activityBath.class);
            }
        });
        btnCalcSimples = findViewById(R.id.btnCalcSimples);
        btnCalcSimples.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view){
                Intent in = new Intent(MainActivity.this, activityCalculadoraSimples.class);
            }
        });
        btnRoom = findViewById(R.id.btnRoom);
        btnRoom.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view){
                Intent in = new Intent(MainActivity.this, activityRoom.class);
            }
        });
        btnRoom2 = findViewById(R.id.btnRoom2);
        btnRoom2.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view){
                Intent in = new Intent(MainActivity.this, activityRoom2.class);
            }
        });
        btnOffice = findViewById(R.id.btnOffice);
        btnOffice.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view){
                Intent in = new Intent(MainActivity.this, activityOffice.class);
            }
        });

    }
}
