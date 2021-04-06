package com.example.proyectobasedatos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    private EditText ed1;
    private EditText edml1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.editTextTextPersonName);
        edml1 = (EditText) findViewById(R.id.editTextTextMultiLine);
    }

    // ----------------  Guardar - Contactos -------------------------->>

    public void guardar(View view) {
        String nombre = ed1.getText().toString();
        String datos = edml1.getText().toString();
        SharedPreferences pref1 = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        SharedPreferences.Editor objEditor = pref1.edit();
        objEditor.putString(nombre, datos);
        objEditor.commit();
        Toast.makeText(this, "Datos guardados", Toast.LENGTH_SHORT).show();
    }

    public void buscar(View view) {
        String nombre = ed1.getText().toString();
        SharedPreferences preferencias = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        String datos = preferencias.getString(nombre, "");
        if (datos.length() == 0) {
            Toast.makeText(this, "No se encontro ningun registro", Toast.LENGTH_SHORT).show();
        } else
            edml1.setText(datos);
    }


    // ----------------  Guardar en la SSD - Archivos ------------------->>

    public void guardar_Archivo(View view) {
        String nombre = ed1.getText().toString();
        String datos = edml1.getText().toString();
        try {
            File tarjeta_sd = Environment.getExternalStorageDirectory();
            Toast.makeText(this, tarjeta_sd.getPath(), Toast.LENGTH_SHORT).show();
            File ruta_archivo = new File(tarjeta_sd.getPath(), nombre);
            OutputStreamWriter crear_archivo = new OutputStreamWriter(openFileOutput(nombre, Activity.MODE_PRIVATE));
            crear_archivo.write(datos);
            crear_archivo.flush();
            crear_archivo.close();
            Toast.makeText(this, "Guardado correctamente", Toast.LENGTH_SHORT).show();
            ed1.setText("");
            edml1.setText("");
        } catch (IOException e) {
            Toast.makeText(this, "No se puede guardar", Toast.LENGTH_SHORT).show();
            ;
        }
    }

    public void Buscar_Archivos(View view) {
        String nombre = ed1.getText().toString();
        try {
            File tarjeta_sd = Environment.getExternalStorageDirectory();
            File ruta_archivo = new File(tarjeta_sd.getPath(), nombre);
            InputStreamReader abrir_archivo = new InputStreamReader(openFileInput(nombre));
            BufferedReader leer_archivo = new BufferedReader(abrir_archivo);
            String linea = leer_archivo.readLine();
            String contenido_completo = "";
            while (linea != null) {
                contenido_completo = contenido_completo + linea + "\n";
                linea = leer_archivo.readLine();
            }
            leer_archivo.close();
            abrir_archivo.close();
            edml1.setText(contenido_completo);
        } catch (IOException e) {
            Toast.makeText(this, "Error de lectura", Toast.LENGTH_SHORT).show();
        }
    }
}