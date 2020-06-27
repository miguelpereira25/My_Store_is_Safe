package com.example.mystoreissafe;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BdStoreOpenHelper extends SQLiteOpenHelper {
    public static final String NOME_BASE_DADOS = "storeSafe.db";
    private static final int VERSAO_BASE_DADOS =1;
    private static final boolean DESENVOLVIMENTO = true;
    /**
     * Create a helper object to create, open, and/or manage a database.
     * This method always returns very quickly.  The database is not actually
     * created or opened until one of {@link #getWritableDatabase} or
     * {@link #getReadableDatabase} is called.
     *
     * @param context to use for locating paths to the the database
     */

    public BdStoreOpenHelper(@Nullable Context context) {
        super(context,NOME_BASE_DADOS , null, VERSAO_BASE_DADOS);
    }
    /**
     * Called when the database is created for the first time. This is where the
     * creation of tables and the initial population of the tables should happen.
     *
     * @param db The database.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
       new BdTableMarcacao(db).cria();

       new bdTableCliente(db).cria();

        if (DESENVOLVIMENTO){
            seedData(db);
        }

    }




    private void seedData(SQLiteDatabase db){

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}