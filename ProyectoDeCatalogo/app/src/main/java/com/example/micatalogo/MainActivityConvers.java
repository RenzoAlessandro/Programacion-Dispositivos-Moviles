package com.example.micatalogo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityConvers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_convers);
    }
    public void Navegador(View view){
        Intent irWeb = new Intent(this, MainActivityNavegador.class);
        String SitioWeb = "https://www.coliseum.com.pe/zapatillas-urbanas-converse-hombre-chuck-70-peace-hi-167912c-0/p";
        irWeb.putExtra("sitioweb",SitioWeb);
        startActivity(irWeb);
    }
    public void Anterior(View view){
        Intent anterior = new Intent(this,MainActivity.class);
        startActivity(anterior);
    }
    public void Cerrar(View view){
        finish();
    }
}