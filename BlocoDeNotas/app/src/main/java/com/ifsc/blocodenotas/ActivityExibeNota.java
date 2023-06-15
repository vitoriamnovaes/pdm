package com.ifsc.blocodenotas;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.ifsc.blocodenotas.Controll.NotaControll;
import com.ifsc.blocodenotas.Model.Nota;

public class ActivityExibeNota extends AppCompatActivity {

    private EditText titulo, conteudo;
    private Button salva;

    private NotaControll controller;
    private Nota nota;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibe_nota);

         controller = new NotaControll(this);
        titulo = findViewById(R.id.titulo);
        conteudo = findViewById(R.id.conteudo);
        salva = findViewById(R.id.salvar);


        salva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvaNota();
            }
        });

    }

    private void salvaNota(){

        String tituloTxt = titulo.getText().toString();
        String conteudoTxt = conteudo.getText().toString();

        if (nota != null) {
            nota.setTitulo(tituloTxt);
            nota.setTitulo(conteudoTxt);
            controller.updateNota(nota);
        } else {
            Nota novaNota = new Nota(tituloTxt, conteudoTxt);
            controller.cadastrarNota(novaNota);
        }

        finish();

    }
}