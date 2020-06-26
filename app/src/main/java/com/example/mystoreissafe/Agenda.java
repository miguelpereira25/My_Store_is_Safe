package com.example.mystoreissafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.UnicodeSetSpanner;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Agenda extends AppCompatActivity {
    private Button button_agendar;
    private Button button_cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
        button_agendar = (Button) findViewById(R.id.button_agendar);
        button_agendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook();

            }
        });

        button_cancelar = (Button) findViewById(R.id.button_cancelar);
        button_cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmain();
                Toast.makeText(Agenda.this,getString(R.string.canceled), Toast.LENGTH_LONG).show();
            }
        });

    }
    public void openmain(){
        Intent intent = new Intent(this,SegundoMain.class);
        startActivity(intent);
    }
    public void openBook(){
        Intent intent = new Intent(this, BOOk_apointment.class);
        startActivity(intent);
    }
}
