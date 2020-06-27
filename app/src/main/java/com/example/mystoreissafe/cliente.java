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
    private static final int ID_CURSOR_LOADER_CLIENT = 0;

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
        //setSupportActionBar(toolbar);
        //getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        editText_Name = (EditText) findViewById(R.id.editText_Name);
        editText_contribuinte = (EditText) findViewById(R.id.editText_contribuinte);
        editText_contact = (EditText) findViewById(R.id.editText_contact);
        editText_adress = (EditText) findViewById(R.id.editText_adress);
        editText_age = (EditText) findViewById(R.id.editText_age);
        editText_temp = (EditText) findViewById(R.id.editText_temp);
        //getSupportLoaderManager().initLoader(ID_CURSOR_LOADER_CLIENT, null, this)

        button_back = (Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmain();
                Toast.makeText(cliente.this,getString(R.string.canceled),Toast.LENGTH_LONG).show();
            }
        });



    }
    /*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu) {
            Intent intent = new Intent(this,RegistoVizinho.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/

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
