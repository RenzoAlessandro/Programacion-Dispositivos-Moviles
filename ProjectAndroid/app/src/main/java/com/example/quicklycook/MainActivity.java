package com.example.quicklycook;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        tv1 = (TextView)findViewById(R.id.txt_resultado);
    }


    public void Sumar(View view)
    {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int nume1 = Integer.parseInt(valor1);
        int nume2 = Integer.parseInt(valor2);

        int suma = nume1 + nume2;

        String result = String.valueOf(suma);
        tv1.setText(result);
    }

    public void Restar(View view)
    {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int nume1 = Integer.parseInt(valor1);
        int nume2 = Integer.parseInt(valor2);

        int suma = nume1 - nume2;

        String result = String.valueOf(suma);
        tv1.setText(result);
    }

}