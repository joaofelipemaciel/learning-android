package com.cursoandroid.joaofelipemaciel.primeiroprojeto;

import android.support.v7.app.AppCompatActivity;
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

    public void sortearNumero(View view){

        TextView textoResultado = findViewById(R.id.textoResultado);

        int numero = new Random().nextInt(11);

        textoResultado.setText("O número selecionado é: " + numero);

    }

//    public void alterarTexto(View view) {
//
//        TextView texto = (TextView) findViewById(R.id.textoExibicao);
//        texto.setText("Texto alterado");
//
//    }


}
