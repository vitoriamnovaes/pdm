package com.ifsc.aula10_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // editText = findViewById(R.id.editTextTextPersonName);
        Log.d("metodocallback","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("metodocallback","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("metodocallback","onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("metodocallback","onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("metodocallback","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("metodocallback","onDestroy");
    }
    public void iniciaActivity(View view){
        Intent i = new Intent(getApplicationContext(), imc.class);
       // String mensagem = editText.getText().toString();
        //i.putExtra("msg",mensagem);
        startActivity(i);

    }

}