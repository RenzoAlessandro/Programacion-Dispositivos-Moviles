package com.example.micatalogo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityPuma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_puma);
    }

    public void Navegador(View view){
        Intent irWeb = new Intent(this, MainActivityNavegador.class);
        String SitioWeb = "https://us.puma.com/en/us/pd/rs-fast-sneakers/380562.html?dwvar_380562_color=05";
        irWeb.putExtra("sitioweb",SitioWeb);
        startActivity(irWeb);
    }
    public void Anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
    public void Cerrar(View view){
        finish();
    }

}