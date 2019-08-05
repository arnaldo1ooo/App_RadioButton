package com.arnaldo.app_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Inicializar
    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private RadioButton rb_sumar;
    private RadioButton rb_restar;
    private RadioButton rb_multiplicar;
    private RadioButton rb_dividir;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relacionar
        et1 = (EditText) findViewById(R.id.et_valor1);
        et2 = (EditText) findViewById(R.id.et_valor2);
        tv1 = (TextView) findViewById(R.id.tv_resultado);
        rb_sumar = (RadioButton) findViewById(R.id.rb_sumar);
        rb_restar = (RadioButton) findViewById(R.id.rb_restar);
        rb_multiplicar = (RadioButton) findViewById(R.id.rb_multiplicar);
        rb_dividir = (RadioButton) findViewById(R.id.rb_dividir);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Calcular();
            }
        });
    }


    //Metodo onclick para boton calcular
    public void Calcular() {
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();
        int valor1_Int = (Integer.parseInt(valor1_String));
        int valor2_Int = (Integer.parseInt(valor2_String));

        if (rb_sumar.isChecked() == true) { //SUMAR
            Log.d("Sumar", "Sumar");
            int suma = valor1_Int + valor2_Int;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        } else if (rb_restar.isChecked() == true) { //RESTAR
            int resta = valor1_Int - valor2_Int;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        } else if (rb_multiplicar.isChecked() == true) { //MULTIPLICAR
            int multiplicacion = valor1_Int * valor2_Int;
            String resultado = String.valueOf(multiplicacion);
            tv1.setText(resultado);
        } else if (rb_dividir.isChecked() == true) { //DIVIDIR
            if (valor1_Int == 0) {
                Toast.makeText(this, "El segundo valor no puede ser 0", Toast.LENGTH_SHORT).show();
            } else {
                int division = valor1_Int - valor2_Int;
                String resultado = String.valueOf(division);
                tv1.setText(resultado);
            }
        }
    }
}
