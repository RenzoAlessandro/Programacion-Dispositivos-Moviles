package com.example.proyectoimagen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void foca(View view)
    {
        Toast.makeText(this, "foca", Toast.LENGTH_LONG).show();
    }
    public void tigre(View view)
    {
        Toast.makeText(this, "tigre", Toast.LENGTH_LONG).show();
    }
    public void perro(View view)
    {
        Toast.makeText(this, "perrito", Toast.LENGTH_LONG).show();
    }
    public void gato(View view)
    {
        Toast.makeText(this, "gatito", Toast.LENGTH_LONG).show();
    }
}