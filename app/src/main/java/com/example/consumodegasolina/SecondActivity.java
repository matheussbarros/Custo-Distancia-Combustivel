package com.example.consumodegasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final TextView tResposta = findViewById(R.id.tResposta);


        Bundle dados = getIntent().getExtras();
        float media = dados.getFloat("Media");


        tResposta.setText( String.valueOf("A quantidade de combustível é de "+  media +" Litros"));


    }
}
