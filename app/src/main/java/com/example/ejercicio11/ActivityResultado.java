package com.example.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        TextView resultado = (TextView) findViewById(R.id.txtresultado);
        //limpia la caja antes de enviar informacion
        resultado.setText("");
        //Mando a llamar el resultado
        resultado.setText(getIntent().getStringExtra("resultado").toString());
    }
}