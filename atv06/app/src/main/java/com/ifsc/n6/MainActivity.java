package com.ifsc.n6;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tese.R;

public class MainActivity extends AppCompatActivity {
    private Button cont;
    private TextView results;
    private int total = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cont = (Button) findViewById(R.id.BtnCLicks);
        results = (TextView) findViewById(R.id.results);

        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total = total+1;
                String numero = String.valueOf(total);
                results.setText("Cliks contados"+numero);
            }


        });

    }
}