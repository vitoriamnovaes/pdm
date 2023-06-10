package com.ifsc.meublocodenotas.controller;

import android.content.Context;

import com.ifsc.meublocodenotas.model.Nota;
import com.ifsc.meublocodenotas.model.NotaDao;

import java.util.ArrayList;

public class NotaController {
    Context mContext;
    NotaDao notaDao;
    public NotaController(Context c) {
       mContext=c;
       notaDao= new NotaDao(c);
    }
    public Nota cadastrarNovaNota(Nota n){
       return notaDao.inserirNota(n);
    }
    public ArrayList<Nota> listaNotas(){
       return notaDao.getListaNotas();
    }
    public ArrayList<String> listaTituloNotas(){
        ArrayList<String> result = new ArrayList<String>();
        for (Nota nota: this.listaNotas() ){
            result.add(nota.getTitulo());
        }
        return result;
    }
}
