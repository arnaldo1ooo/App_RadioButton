package com.arnaldo.app_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Inicializar
    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private RadioButton rb1;
    private RadioButton rb2;
    private  Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relacionar
        et1 = (EditText) findViewById(R.id.et_valor1);
        et2 = (EditText) findViewById(R.id.et_valor2);
        tv1 = (TextView) findViewById(R.id.tv_resultado);
        rb1 = (RadioButton) findViewById(R.id.rb_sumar);
        rb2 = (RadioButton) findViewById(R.id.rb_restar);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Calcular(v);
            }
        });
    }




    //Metodo onclick para boton calcular
    public void Calcular(View v) {
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();
        int valor1_Int = (Integer.parseInt(valor1_String));
        int valor2_Int = (Integer.parseInt(valor2_String));

        if (rb1.isChecked() == true){
            Log.d("Sumar","Sumar");
           int suma = valor1_Int + valor2_Int;
           String resultado = String.valueOf(suma);
           tv1.setText(resultado);
        }else if (rb2.isChecked() == true){
                int resta = valor1_Int - valor2_Int;
                String resultado = String.valueOf(resta);
                tv1.setText(resultado);
            }
    }
}
