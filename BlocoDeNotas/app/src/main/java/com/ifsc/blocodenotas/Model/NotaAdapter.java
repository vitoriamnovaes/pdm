package com.ifsc.blocodenotas.Model;
import android.content.Context;
import android.widget.ArrayAdapter;


import com.ifsc.blocodenotas.Controll.NotaControll;

import java.util.List;

public class NotaAdapter extends ArrayAdapter<Nota> {

    private List<Nota> itemList;
    private Context context;
    private NotaControll controller;

    public NotaAdapter(Context context, List<Nota> itemList) {
        super(context, 0, itemList);
        this.context = context;
        this.itemList = itemList;
    }

}