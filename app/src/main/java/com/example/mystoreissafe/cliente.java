package com.example.mystoreissafe;

import android.content.Context;
import android.content.CursorLoader;
import android.database.Cursor;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;

import androidx.fragment.app.FragmentManager;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import android.os.Bundle;
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
    




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
        /*Toolbar toolbar = findViewById((R.id.toolbar));*/
        setSupportActionBar();
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);


    }
}
