package com.example.mystoreissafe;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

import org.w3c.dom.Text;

public class bdTableCliente implements BaseColumns {
    public static final String NOME_TABELA ="Clientes";
    public static final String CAMPO_NOME ="Nome";
    public static final String CAMPO_CONTRIBUINTE = "Contribuinte";
    public static final String CAMPO_CONTACT = "Contact";
    public static final String CAMPO_ADRESS = "Address";
    public static final String CAMPO_AGE = "Age";
    public static final String CAMPO_TEMP = "Temperature";

    public static final String[] TODAS_COLUNAS_CLIENTE = new String[] { NOME_TABELA + "." + _ID, CAMPO_NOME, CAMPO_CONTRIBUINTE,CAMPO_CONTACT, CAMPO_ADRESS, CAMPO_AGE, CAMPO_TEMP};


    private SQLiteDatabase db;

    public bdTableCliente (SQLiteDatabase db){
        this.db = db ;
    }

    public void cria(){
        db.execSQL(
                "CREATE TABLE" + NOME_TABELA +"(" +
                _ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"+
                CAMPO_NOME + "TEXT NOT NULL, " +
                CAMPO_CONTRIBUINTE + "INTEGER NOT NULL," +
                CAMPO_CONTACT + "INTEGER NOT NULL," +
                CAMPO_ADRESS + "TEXT NOT NULL," +
                CAMPO_AGE + "INTEGER NOT NULL," +
                CAMPO_TEMP + "INTEGER NOT NULL," +")"
         );


        public Cursor query(String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy)
        {
        }
        
        }

        

    }
}
