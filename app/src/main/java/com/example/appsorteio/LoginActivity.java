package com.example.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        configcliques();

    }
    private void configcliques(){
        findViewById(R.id.textCadastro).setOnClickListener(view ->
                startActivity(new Intent(this, CadastroActivity.class)));
        findViewById(R.id.textEsqueceuSenha).setOnClickListener(view ->
                startActivity(new Intent(this, Recuperar_Senha_Activity.class)));
    }

}