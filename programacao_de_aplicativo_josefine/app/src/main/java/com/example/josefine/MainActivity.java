package com.example.josefine;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nome;
    EditText id;
    AlertDialog.Builder alerta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome = (EditText) findViewById(R.id.nome);
        id = (EditText) findViewById(R.id.cod);
        alerta = new AlertDialog.Builder(this);
    }
    public void cadastra(View view){
        if(nome.getText().equals(null) || id.getText().equals(null)){
            alerta.setTitle("Pendência!");
            alerta.setMessage("Você não preencheu todos os campos!");
            alerta.show();

        }
        else {
            String n = nome.getText().toString();
            int i = Integer.parseInt(id.getText().toString());
            Usuario u = new Usuario(n,1);
            Banco.salvar(u);

        }
    }
}