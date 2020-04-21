package com.cursoandroid.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         campoNome = findViewById(R.id.editNome);
         Resultado = findViewById(R.id.textResultado);
         campoEmail = findViewById(R.id.editEmail);
    }

    public void enviar (View view) {
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        Resultado.setText("Nome:" + nome  + " " + "Email: " + email );

    }

    public void limpar (View view) {
        campoNome.setText("");
        campoEmail.setText("");

    }
}
