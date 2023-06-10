package com.ifsc.meublocodenotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.ifsc.meublocodenotas.controller.NotaController;
import com.ifsc.meublocodenotas.model.Nota;

public class ActivityExibirNota extends AppCompatActivity {

    NotaController notaController;
    EditText edTitulo,editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_nota);
        notaController = new NotaController(getApplicationContext());

        edTitulo= findViewById(R.id.edTitulo);
        editText= findViewById(R.id.edTexto);
    }
    public void salvarNota(View view){

        Nota n =notaController.cadastrarNovaNota(new Nota( edTitulo.getText().toString(), editText.getText().toString()));
        Toast.makeText(this, Integer.toString(n.getId()), Toast.LENGTH_SHORT).show();
    }
}