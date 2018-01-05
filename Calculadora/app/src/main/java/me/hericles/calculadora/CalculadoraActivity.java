package me.hericles.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.app.*;

public class CalculadoraActivity extends AppCompatActivity {
    EditText ednumero1, ednumero2;
    Button btsomar, btsubtrair, btmultiplicar, btdividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        ednumero1 = (EditText) findViewById(R.id.ednumero1);
        ednumero2 = (EditText) findViewById(R.id.ednumero2);
        btsomar = (Button) findViewById(R.id.btsomar);
        btsubtrair = (Button) findViewById(R.id.btsubtrair);
        btmultiplicar = (Button) findViewById(R.id.btmultiplicar);
        btdividir = (Button) findViewById(R.id.btdividir);

        btsomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());

                double soma = num1 + num2;;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(CalculadoraActivity.this);

                dialogo.setTitle("Bom Galerinha");
                dialogo.setMessage("A Soma é " + soma);
                dialogo.setNeutralButton("FLW", null);
                dialogo.show();
            }
        });


        btsubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());

                double subtracao = num1 - num2;;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(CalculadoraActivity.this);

                dialogo.setTitle("Bom Galerinha");
                dialogo.setMessage("O resutado da Subtração é " + subtracao);
                dialogo.setNeutralButton("FLW", null);
                dialogo.show();
            }
        });

        btmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());

                double produto = num1 * num2;;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(CalculadoraActivity.this);

                dialogo.setTitle("Bom Galerinha");
                dialogo.setMessage("O produto é " + produto);
                dialogo.setNeutralButton("FLW", null);
                dialogo.show();
            }
        });

        btdividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());

                double divisao = num1 / num2;;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(CalculadoraActivity.this);

                dialogo.setTitle("Bom Galerinha");
                dialogo.setMessage("O Resultado da Divisão é " + divisao);
                dialogo.setNeutralButton("FLW", null);
                dialogo.show();
            }
        });

    }


}
