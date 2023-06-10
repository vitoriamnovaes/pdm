package com.ifsc.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    
    private Button calcular;
    private Button voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcular = (Button) findViewById(R.id.bt_imc);
        EditText pesopessoa = findViewById(R.id.txtPesopessoa);
        EditText alturapessoa = findViewById(R.id.txtAlturapessoa);
        calcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Vimc.class);

                Bundle params = new Bundle();
                params.putString("peso",pesopessoa.getText().toString());
                params.putString("altura",alturapessoa.getText().toString());
                String pesoString = String.valueOf(pesopessoa);
                String alturaString = String.valueOf(alturapessoa);
                intent.putExtra("ps",pesoString);
                intent.putExtra("al",alturaString);
                startActivity(intent);
            }
        });




    }
}
