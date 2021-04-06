package com.example.examenpdm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView1;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private Spinner spinner1;

    private TextView textViewpuntaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView)findViewById(R.id.txt_respuesta11);
        checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        radioButton1 = (RadioButton)findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton)findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton)findViewById(R.id.radioButton3);
        spinner1 = (Spinner)findViewById(R.id.spinner);
        String[] opciones = {"10", "6", "34", "23"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opciones);
        spinner1.setAdapter(adapter);

        textViewpuntaje = (TextView)findViewById(R.id.textView5);
    }

    public void CheckOn(View view){
        int puntaje = 0;
        String seleccion = spinner1.getSelectedItem().toString();
        String valor1_string = textView1.getText().toString();

        if (valor1_string.equals("8")){puntaje = puntaje + 5;}
        if (checkBox1.isChecked() == true){ puntaje = puntaje + 5;}
        if (radioButton1.isChecked() == true){puntaje = puntaje + 5;}
        if (seleccion.equals("10")){puntaje = puntaje + 5;}

        String result = String.valueOf(puntaje);
        textViewpuntaje.setText(result);

    }
}