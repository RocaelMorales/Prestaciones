package com.example.prestaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    TextView t6;
    TextView t7;
    TextView t8;
    Button rbot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);
        t7 = findViewById(R.id.t7);
        t8 = findViewById(R.id.t8);
        rbot =findViewById(R.id.ebot);

        String NOMBRE = getIntent().getExtras().getString("nombre");
        String APELLI = getIntent().getExtras().getString("apellido");
        String SUELDO = getIntent().getExtras().getString("salario");
        t1.setText("NOMBRE: "+NOMBRE);
        t2.setText("APELLIDOS: "+APELLI);
        t3.setText("SUELDO BASE= "+SUELDO);

        double liquido = Double.parseDouble(SUELDO);
        double iggs = (liquido * 4.83) / 100;
        double irtra = (liquido * 1) / 100;
        double intecap = (liquido * 1) / 100;
        double isr;
        if (liquido > 5000) {
            isr = ((liquido * 5) / 100);
        } else {
            isr = 0;

        }
        double total = (liquido - iggs - irtra - intecap - isr);


        String IGGS = String.valueOf(iggs);
        String IRTRA = String.valueOf(irtra);
        String INTECAP = String.valueOf(intecap);
        String ISR = String.valueOf(isr);
        String TOTAL = String.valueOf(total);
        t4.setText("IGGS= "+IGGS);
        t5.setText("IRTRA= "+IRTRA);
        t6.setText("INTECAP= "+INTECAP);
        t7.setText("ISR= "+ISR);
        t8.setText("LIQUIDO TOTAL= "+TOTAL);
    }

    //boton de regresar
    public void REGRESAR (View view){
        Intent i= new Intent(this,MainActivity.class);
        startActivity(i);
    }
}