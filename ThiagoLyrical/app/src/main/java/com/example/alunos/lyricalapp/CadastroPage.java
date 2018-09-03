package com.example.alunos.lyricalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroPage extends AppCompatActivity {

    EditText Email,Senha,Nickname;
    Button btnCadastrar,btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_page);

        Email = (EditText)findViewById(R.id.editEmailnovo);
        Senha = (EditText) findViewById(R.id.editSenhanovo);
        Nickname = (EditText) findViewById(R.id.editNickName);
        btnCadastrar = (Button) findViewById(R.id.btnCadastro);
        btnVoltar = (Button) findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(CadastroPage.this,MainActivity.class);
                startActivity(it);
            }
        });

    }
}
