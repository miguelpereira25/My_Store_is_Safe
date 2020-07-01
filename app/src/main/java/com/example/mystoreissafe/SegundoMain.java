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

import android.os.Bundle;

public class SegundoMain extends AppCompatActivity {
    private Button button_cliente;
    private Button button_agenda;
    private Button button_book;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_main);
        button_cliente = (Button) findViewById(R.id.button_cliente);
        button_cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClient();
            }
        });

        button_agenda = (Button) findViewById(R.id.button_agenda);
        button_agenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAgenda();

            }
        });

        button_book = (Button) findViewById((R.id.button_book));
        button_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook();
            }
        });


    }
    public void openClient(){
        Intent intent = new Intent(this, cliente.class);
        startActivity(intent);
    }

    public void openAgenda(){
        Intent intent = new Intent(this,Agenda.class);
        startActivity(intent);
    }
    public void openBook(){
        Intent intent = new Intent(this, BOOk_apointment.class);
        startActivity(intent);
    }



    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu_cliente) {
            Intent intent = new Intent(this,cliente.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.Info){
            Intent intent = new Intent(this,App_Info.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

