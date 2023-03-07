package com.ifsc.n6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int cont = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttao = (Button) findViewById(R.id.buttao);
        buttao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView contadorbuttao = (TextView) findViewById(R.id.contadorbuttao);
                cont++;
                contadorbuttao.setText(String.valueOf(cont));
            }
        });
    }
}