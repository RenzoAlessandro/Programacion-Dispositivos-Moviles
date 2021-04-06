package com.example.micatalogo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivitySkechers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_skechers);
    }
    public void Navegador(View view){
        Intent irWeb = new Intent(this, MainActivityNavegador.class);
        String SitioWeb = "http://www.pe.skechers.com/es-pe/modelo/51490/skech-air-extreme/nvbk";
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