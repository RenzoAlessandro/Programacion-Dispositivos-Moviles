package com.example.micatalogo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityNike extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_nike);
    }

    public void Navegador(View view){
        Intent irWeb = new Intent(this,MainActivityNavegador.class);
        String SitioWeb = "https://www.nike.com/us/es/t/calzado-de-running-air-zoom-pegasus-37-san-francisco-49ers-bh68Jd/CZ5444-100";
        irWeb.putExtra("sitioweb",SitioWeb);
        startActivity(irWeb);
    }
    public void Anterior (View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
    public void Cerrar(View view){
        finish();
    }
}