package com.ifsc.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Vimc extends AppCompatActivity {

    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vimc);

        resultado = findViewById(R.id.txtResultado);
        Intent it=getIntent();
        String peso = it.getStringExtra("ps");
        String altura = it.getStringExtra("al");

        Double pesoPessoa = Double.valueOf(peso);
        Double alturaPessoa = Double.valueOf(altura);
        double imc = pesoPessoa/(alturaPessoa*alturaPessoa);

        if(imc>18.5 && imc < 24.99){
            resultado.setText("Abaixo do peso");
        }else if(imc >= 25 && imc <= 29.99){
            resultado.setText("Peso normal");
        }else if(imc >=25 && imc <= 34.99){
            resultado.setText("Sobrepeso");
        }else if (imc >= 30 && imc <= 34.99){
            resultado.setText("Obesidade grau 1");
        }else if (imc>= 35  && imc <= 39.99){
            resultado.setText("Obesidade grau 2");
        }else if (imc>40){
            resultado.setText("Obesidade grau 3");
        }


    }
}