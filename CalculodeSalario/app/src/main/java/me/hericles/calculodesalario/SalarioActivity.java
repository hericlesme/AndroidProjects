package me.hericles.calculodesalario;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class SalarioActivity extends AppCompatActivity {

    RadioGroup rgopcoes;
    Button btcalcular;

    EditText edsalario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salario);

        rgopcoes = (RadioGroup) findViewById(R.id.rgopcoes);
        btcalcular = (Button) findViewById(R.id.btcalcular);

        edsalario = (EditText) findViewById(R.id.edsalario);

        btcalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                double salario = Double.parseDouble(edsalario.getText().toString());

                int op = rgopcoes.getCheckedRadioButtonId();

                double novo_salario = 0;

                if (op == R.id.rb40)
                    novo_salario = salario + (salario * 0.4);
                else if (op == R.id.rb45)
                    novo_salario = salario + (salario * 0.45);
                else
                    novo_salario = salario + (salario * 0.5);

                AlertDialog.Builder dialogo = new AlertDialog.Builder(SalarioActivity.this);

                dialogo.setTitle("Novo salário");
                dialogo.setMessage("Seu novo salário é : R$" + String.valueOf(novo_salario));

                dialogo.setNeutralButton("OK",null);

                dialogo.show();
            }
        });
    }
}
