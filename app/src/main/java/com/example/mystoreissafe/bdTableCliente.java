package com.example.mystoreissafe;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

import org.w3c.dom.Text;

public class bdTableCliente implements BaseColumns {
    public static final String NOME_TABELA ="Clientes";
    public static final String CAMPO_NOME ="Nome";
    public static  final String CAMPO_ID_COMPLETO = NOME_TABELA +"." +_ID;}
/*
    NAME
            Contribuinte
    Contact
            Adress
    Age
            Temp


    private bdTableCliente db;

    public bdTableCliente (SQLiteDatabase db){
        this.db =db;
    }

    public void cria(){
        db.execSQL("CREATE TABLE" + NOME_TABELA+"(" +
                _ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"+
                CAMPO_NOME + "TEXT NOT NULL, " +)

    }
}
*/