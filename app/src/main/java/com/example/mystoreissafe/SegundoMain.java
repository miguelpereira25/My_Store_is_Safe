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
    }
    public void openClient(){
        Intent intent = new Intent(this, cliente.class);
        startActivity(intent);
    }

    public void openAgenda(){
        Intent intent = new Intent(this,Agenda.class);
        startActivity(intent);
    }
}
