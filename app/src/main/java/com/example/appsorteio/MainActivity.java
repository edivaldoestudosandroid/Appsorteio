package com.example.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


  @SuppressLint("SetTextI18n")
  public void sortearNumero(View view){
      TextView  texto = findViewById(R.id.nmSelecionado);
      int nM = new Random().nextInt(26);
      texto.setText("Número: " + nM);


  }

}