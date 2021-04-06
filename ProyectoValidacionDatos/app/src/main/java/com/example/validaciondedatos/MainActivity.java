package com.example.validaciondedatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editNombre, editPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNombre = (EditText)findViewById(R.id.editTextTextPersonName);
        editPassword = (EditText)findViewById(R.id.editTextTextPassword);
    }
    public void Registro(View view){
        String nombre = editNombre.getText().toString();
        String password = editPassword.getText().toString();

        if(nombre.length() == 0){
            Toast.makeText(this, "Usuario vacio", Toast.LENGTH_SHORT).show();
        }
        if(password.length() == 0){
            Toast.makeText(this, "Password vacio", Toast.LENGTH_SHORT).show();
        }
        if(password.length() != 0 && nombre.length() != 0){
            Toast.makeText(this, "Registro en proceso", Toast.LENGTH_SHORT).show();
        }
    }
}