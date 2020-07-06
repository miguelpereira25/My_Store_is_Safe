package com.example.mystoreissafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.BufferedReader;

public class BOOk_apointment extends AppCompatActivity {
    FirebaseDatabase rootNodesuper;
    DatabaseReference referencesuper;

    private Button button_save;
    private EditText editText_Customer;
    private EditText editText_Date;
    private EditText editText_Hour;
    private EditText editText_Time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_o_ok_apointment);
        button_save = (Button) findViewById(R.id.button_save);
        button_save.setOnClickListener(new View.OnClickListener() {
            @Override
            //Vamos verificar se todos os campos estão preenchidos e camar a atençao caso nao estejam
            public void onClick(View v) {
                EditText editText_Customer = findViewById(R.id.editText_Customer);
                String nomeCliente = editText_Customer.getText().toString();
                if(nomeCliente.isEmpty()){
                    editText_Customer.setError(getString(R.string.erro));
                    editText_Customer.requestFocus();
                    return;
                }
                EditText editText_Date = findViewById(R.id.editText_Date);
                String dataMarc = editText_Date.getText().toString();
                if(dataMarc.isEmpty()){
                    editText_Date.setError(getString(R.string.erro));
                    editText_Date.requestFocus();
                    return;

                }
                EditText editText_Hour = findViewById((R.id.editText_Hour));
                String hourMarc = editText_Hour.getText().toString();
                if(hourMarc.isEmpty()){
                    editText_Hour.setError(getString(R.string.erro));
                    editText_Hour.requestFocus();
                    return;
                }
                EditText editText_Time = findViewById(R.id.editText_Time);
                String timeMarc = editText_Time.getText().toString();
                if(timeMarc.isEmpty()){
                    editText_Time.setError(getString(R.string.erro));
                    editText_Time.requestFocus();
                    return;
                }

                rootNodesuper = FirebaseDatabase.getInstance();
                referencesuper = rootNodesuper.getReference("Cliente");

                clienteHelpClass helperClass = new clienteHelpClass(nomeCliente, dataMarc, hourMarc, timeMarc);

                //The database should sort the appointments by date

                referencesuper.child(dataMarc).setValue(helperClass);

                Toast.makeText(getBaseContext(), R.string.sucesso, Toast.LENGTH_LONG).show();
                finish();
                Toast.makeText(BOOk_apointment.this, getString(R.string.ToastSave),Toast.LENGTH_LONG).show();


            }
        });

    }


    /*


            finish();
            Toast.makeText(AddEventos.this,getString(R.string.ToastSave),Toast.LENGTH_LONG).show();

        }
    });*/

}