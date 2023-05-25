package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void acSumarContador(View view) {
        TextView tvContador = (TextView) findViewById(R.id.lblContadorClicks);
        int contador = Integer.parseInt(tvContador.getText().toString());
        contador++;
        tvContador.setText(String.valueOf(contador));
    }
}