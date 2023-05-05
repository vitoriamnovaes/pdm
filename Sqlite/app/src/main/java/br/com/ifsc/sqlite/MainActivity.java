package br.com.ifsc.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase db;
    ListView listViewPessoas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewPessoas = findViewById(R.id.listView);

        db = openOrCreateDatabase("banco", MODE_PRIVATE,null);
       String sql = ("CREATE TABLE IF NOT EXISTS pessoas(nome VARCHAR, idade INT(3))");
        db.execSQL(sql);
        sql = "INSERT INTO pessoas (nome, idade) VALUES ('Vi', 18)";
        db.execSQL((sql));
        sql = "INSERT INTO pessoas (nome, idade) VALUES ('Sofi', 20)";
        db.execSQL((sql));

    }
    public void listaPessoas(){
        String sql = "SELECT * FROM pessoas";
        Cursor cursor = db.rawQuery(sql,null);
        cursor.moveToFirst();
        ArrayList<String> arrayList = new ArrayList<String>();
        while(cursor.isAfterLast()){
            arrayList.add(cursor.getString(0));
            cursor.moveToNext();
        }
    }
}