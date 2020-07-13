package com.example.mystoreissafe;

import android.content.Intent;
import android.database.Cursor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;

import androidx.loader.content.Loader;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class cliente extends AppCompatActivity {
    FirebaseDatabase rootNode;
    DatabaseReference reference;



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
        button_save = (Button) findViewById(R.id.button_save);
        button_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText_Name = (EditText) findViewById(R.id.editText_Name);
                final String nameCust = editText_Name.getText().toString();
                if (nameCust.isEmpty()) {
                    editText_Name.setError(getString(R.string.erro));
                    editText_Name.requestFocus();
                    return;
                }
                //o cliente nao é obrigado a dar informações como o conbtribuinte
                editText_contribuinte = (EditText) findViewById(R.id.editText_contribuinte);
                final String contribuinte = editText_contribuinte.getText().toString();

                editText_contact = (EditText) findViewById(R.id.editText_contact);
                final String contact = editText_contact.getText().toString();
                if (contact.isEmpty()) {
                    editText_contact.setError(getString(R.string.erro));
                    editText_contact.requestFocus();
                    return;
                }

                editText_adress = (EditText) findViewById(R.id.editText_adress);
                final String custAddress = editText_adress.getText().toString();
                if (custAddress.isEmpty()) {
                    editText_adress.setError(getString(R.string.erro));
                    editText_adress.requestFocus();
                    return;
                }

                editText_age = (EditText) findViewById(R.id.editText_age);
                final String custAge = editText_age.getText().toString();
                if (custAge.isEmpty()) {
                    editText_age.setError(getString(R.string.erro));
                    editText_age.requestFocus();
                    return;
                }
                //ainda nao tenho certeza sobre este campo
                editText_temp = (EditText) findViewById(R.id.editText_temp);
                final String temp = editText_temp.getText().toString();

                        rootNode = FirebaseDatabase.getInstance();
                        reference = rootNode.getReference("Clientes");

                        clienteHelpClass helperClass = new clienteHelpClass(nameCust, contribuinte, contact, custAddress, custAge, temp);

                        reference.child(nameCust).setValue(helperClass);

                        Toast.makeText(getBaseContext(), R.string.sucesso, Toast.LENGTH_LONG).show();
                        finish();
                        //openlistCust();

                    }
                });

                Button button_back = (Button) findViewById(R.id.button_back);
                button_back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openMain();
                        Toast.makeText(cliente.this, getString(R.string.canceled), Toast.LENGTH_LONG).show();
                    }
                });


            }
            /*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
   public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menucliente, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.Ver_cliente) {
            Intent intent = new Intent(this,ListaClientes.class);
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
    private void openMain() {
        Intent intent = new Intent(this, SegundoMain.class);
        startActivity(intent);
    }
}










