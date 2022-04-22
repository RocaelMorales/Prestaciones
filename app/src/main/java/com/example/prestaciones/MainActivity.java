package com.example.prestaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1n;
    EditText et2a;
    EditText et3s;
    Button ebot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1n= findViewById(R.id.et1n);
        et2a= findViewById(R.id.et2a);
        et3s= findViewById(R.id.et3s);
        ebot= findViewById(R.id.ebot);

    }

    //boton enviar

    public void envio(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivity2.class);
        i.putExtra("nombre", et1n.getText().toString());
        i.putExtra("apellido", et2a.getText().toString());
        i.putExtra("salario", et3s.getText().toString());
        startActivity(i);
    }
}