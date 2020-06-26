package com.example.mystoreissafe;

import android.content.Context;
import android.content.CursorLoader;
import android.content.Intent;
import android.database.Cursor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;

import androidx.fragment.app.FragmentManager;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CursorAdapter;
import android.widget.EditText;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class cliente extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor> {

    private EditText editText_Name;
    private EditText editText_contribuinte;
    private EditText editText_contact;
    private EditText editText_adress;
    private EditText editText_age;
    private EditText editText_temp;
    private Button button_save;
    private Button button_back;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
        /*Toolbar toolbar = findViewById((R.id.toolbar));*/
        //setSupportActionBar();
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        button_back = (Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmain();
                Toast.makeText(cliente.this,getString(R.string.canceled),Toast.LENGTH_LONG).show();
            }
        });


    }
    public void openmain(){
        Intent intent = new Intent(this,SegundoMain.class);
        startActivity(intent);
    }

    @NonNull
    @Override
    public Loader<Cursor> onCreateLoader(int id, @Nullable Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(@NonNull Loader<Cursor> loader, Cursor data) {

    }

    @Override
    public void onLoaderReset(@NonNull Loader<Cursor> loader) {

    }
}
