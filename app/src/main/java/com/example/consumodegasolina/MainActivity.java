package com.example.consumodegasolina;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnCalcular;
    TextView tDistancia;
    TextView tConsumo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tDistancia = findViewById(R.id.tDistancia);
        tConsumo = findViewById(R.id.tConsumo);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float distancia = Float.parseFloat( tDistancia.getText().toString() );
                float consumo = Float.parseFloat( tConsumo.getText().toString() );


                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);

                float media = distancia / consumo;


                intent.putExtra("Media",media);


                startActivity(intent);
            }
        });
    }
}
