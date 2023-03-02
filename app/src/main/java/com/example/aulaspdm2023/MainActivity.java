package com.example.aulaspdm2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnSala;
    Button btnCozinha;
    Button btnBath;
    Button btnRoom;
    Button btnRoom2;
    Button btnOffice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSala = findViewById(R.id.btnSala);
        btnSala.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view){
                Intent in = new Intent(MainActivity.this, activitySala.class);
            }
        });

        btnBath = findViewById(R.id.btnBath);
        btnBath.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view){
                Intent in = new Intent(MainActivity.this, activityBath.class);
            }
        });
        btnCozinha = findViewById(R.id.btnCozinha);

        btnRoom = findViewById(R.id.btnRoom);
        btnRoom.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view){
                Intent in = new Intent(MainActivity.this, activityRoom.class);
            }
        });

        btnRoom2 = findViewById(R.id.btnRoom2);
        btnOffice = findViewById(R.id.btnOffice);

    }
}
