package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void acSuma(View view) {
        EditText et1 = (EditText) findViewById(R.id.txtOperando1);
        EditText et2 = (EditText) findViewById(R.id.txtOperando2);
        TextView resultado = (TextView) findViewById(R.id.lblResultado);
        double op1 = Double.parseDouble(et1.getText().toString());
        double op2 = Double.parseDouble(et2.getText().toString());
        double resul = op1 + op2;
        resultado.setText(String.valueOf(resul));
    }

    public void acResta(View view) {
        EditText et1 = (EditText) findViewById(R.id.txtOperando1);
        EditText et2 = (EditText) findViewById(R.id.txtOperando2);
        TextView resultado = (TextView) findViewById(R.id.lblResultado);
        double op1 = Double.parseDouble(et1.getText().toString());
        double op2 = Double.parseDouble(et2.getText().toString());
        double resul = op1 - op2;
        resultado.setText(String.valueOf(resul));
    }

    public void acMultiplicar(View view) {
        EditText et1 = (EditText) findViewById(R.id.txtOperando1);
        EditText et2 = (EditText) findViewById(R.id.txtOperando2);
        TextView resultado = (TextView) findViewById(R.id.lblResultado);
        double op1 = Double.parseDouble(et1.getText().toString());
        double op2 = Double.parseDouble(et2.getText().toString());
        double resul = op1 * op2;
        resultado.setText(String.valueOf(resul));
    }

    public void acDividir(View view) {
        EditText et1 = (EditText) findViewById(R.id.txtOperando1);
        EditText et2 = (EditText) findViewById(R.id.txtOperando2);
        TextView resultado = (TextView) findViewById(R.id.lblResultado);
        double op1 = Double.parseDouble(et1.getText().toString());
        double op2 = Double.parseDouble(et2.getText().toString());
        if(op2!=0) {
            double resul = op1 / op2;
            resultado.setText(String.valueOf(resul));
        } else {
            resultado.setText(String.valueOf(getString(R.string.div0)));
        }

    }

    public void acLimpiar(View view) {
        EditText et1 = (EditText) findViewById(R.id.txtOperando1);
        EditText et2 = (EditText) findViewById(R.id.txtOperando2);
        TextView resultado = (TextView) findViewById(R.id.lblResultado);

        et1.setText("");
        et2.setText("");
        resultado.setText("0");
    }
}