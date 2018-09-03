package com.example.alunos.lyricalapp;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button nomeParaOBotao = (Button) findViewById(R.id.btnCadastrar);

        EditText email = (EditText) findViewById(R.id.editEmail);
        EditText senha = (EditText) findViewById(R.id.editSenha);
        Button btnLogar = (Button) findViewById(R.id.btnLogar);
        Button btnCadastar = (Button) findViewById(R.id.btnCadastrar);

        btnCadastar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abreCadastro = new Intent(MainActivity.this, CadastroPage.class);
                startActivity(abreCadastro);
            }
        });

    }

}
