package com.cursoandroid.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView Resultado;

    private CheckBox checkVerde;
    private CheckBox checkBranco;
    private CheckBox checkVermelho;

    private RadioButton sexoMasculino, sexoFeminino;
    private RadioGroup opcaoSexo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         campoNome = findViewById(R.id.editNome);
         Resultado = findViewById(R.id.textResultado);
         campoEmail = findViewById(R.id.editEmail);

         checkVerde = findViewById(R.id.checkVerde);
         checkBranco = findViewById(R.id.checkBranco);
         checkVermelho = findViewById(R.id.checkVermelho);

         sexoMasculino = findViewById(R.id.radioButtonMasculino);
         sexoFeminino = findViewById(R.id.radioButtonFeminino);
         opcaoSexo = findViewById(R.id.radioGroupSexo);

         radioButton();

    }

    public void checkbox(){
    String texto = "";

    if (checkVerde.isChecked()){
        //String corSelecionada = checkVerde.getText().toString();

        texto = "Verde selecionado ";
    }
        if (checkBranco.isChecked()){
            texto = texto + "Branco selecionado -";
        }
        if (checkVermelho.isChecked()){
            texto = texto + "Vermelho selecionado -";
        }

    Resultado.setText(texto);
    }

    public void radioButton(){

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButtonMasculino){
                    Resultado.setText("Masculino");
                }else if (checkedId == R.id.radioButtonFeminino) {
                    Resultado.setText("Feminino");
                }
            }
        });

        /*
        if (sexoMasculino.isChecked()){
                Resultado.setText("Masculino");
        }else if (sexoFeminino.isChecked()){
            Resultado.setText("Feminino");
        }
        */

    }


    public void enviar (View view) {

        radioButton();
        //checkbox();
        /*
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        Resultado.setText("Nome:" + nome  + " " + "Email: " + email );
*/
    }

    public void limpar (View view) {
        campoNome.setText("");
        campoEmail.setText("");

    }
}
