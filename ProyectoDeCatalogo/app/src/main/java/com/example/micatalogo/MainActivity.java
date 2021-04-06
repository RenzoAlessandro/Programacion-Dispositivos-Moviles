package com.example.micatalogo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SiguienteAdidas(View view){
        Intent siguienteadidas = new Intent(this,MainActivityAdidas.class);
        startActivity(siguienteadidas);
    }
    public void SiguienteConvers(View view){
        Intent siguienteconvers = new Intent(this,MainActivityConvers.class);
        startActivity(siguienteconvers);
    }
    public void SiguienteNike(View view){
        Intent siguientenike = new Intent(this,MainActivityNike.class);
        startActivity(siguientenike);
    }
    public void SiguientePuma(View view){
        Intent siguientepuma = new Intent(this,MainActivityPuma.class);
        startActivity(siguientepuma);
    }
    public void SiguienteReebok(View view){
        Intent siguientereebok = new Intent(this,MainActivityReebok.class);
        startActivity(siguientereebok);
    }
    public void SiguienteSkechers(View view){
        Intent siguienteskechers = new Intent(this,MainActivitySkechers.class);
        startActivity(siguienteskechers);
    }
    public void SiguienteSpeedo(View view){
        Intent siguientespeedo = new Intent(this,MainActivitySpeedo.class);
        startActivity(siguientespeedo);
    }
}