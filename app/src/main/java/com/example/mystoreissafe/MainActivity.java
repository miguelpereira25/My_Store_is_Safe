package com.example.mystoreissafe;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
//import androix.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button button_cliente;
    private Button button_agenda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar =findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        button_cliente = (Button) findViewById(R.id.button_cliente);
        button_cliente.setOnClickListener(new View.onClickListener(){
            @Override
            public void onClick(View v){
                openClient();
            }
        });




    }
}
