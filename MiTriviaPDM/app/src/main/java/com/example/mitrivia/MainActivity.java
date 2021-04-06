package com.example.mitrivia;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;
    private TextView textViewPuntaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);

        radioButton1 = (RadioButton)findViewById(R.id.radioButton1_1);
        radioButton2 = (RadioButton)findViewById(R.id.radioButton2_2);
        radioButton3 = (RadioButton)findViewById(R.id.radioButton3_3);
        radioButton4 = (RadioButton)findViewById(R.id.radioButton4_3);

        textViewPuntaje = (TextView)findViewById(R.id.textViewRespuesta);

    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        // La actividad est� a punto de hacerse visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad  (esta actividad est� a punto de ser "detenida").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible (ahora est� "detenida")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
        // La actividad est� a punto de ser destruida.
    }

    public void CheckOn(View view){
        int puntaje = 0;
        if (radioButton1.isChecked() == true){puntaje = puntaje +1;}
        if (radioButton2.isChecked() == true){puntaje = puntaje +1;}
        if (radioButton3.isChecked() == true){puntaje = puntaje +1;}
        if (radioButton4.isChecked() == true){puntaje = puntaje +1;}

        String result = String.valueOf(puntaje);
        textViewPuntaje.setText(result);

    }
}