package com.example.tiagocardoso.advinha;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {

    private Button botaoJogar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        botaoJogar = (Button) findViewById(R.id.botaoJogarId); //sempre precisa do cast
        //busca o id resultadoId para carregar na variavel
        textoResultado = (TextView) findViewById(R.id.resutadoId); //sempre precisa do cast
        // altera a variavel para o texto entre pareteses
        //textoResultado.setText("Texto Alterado");

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int numeroRandom = random.nextInt(10);

                textoResultado.setText("Texto Alterado: "+ numeroRandom);
            }
        });
    }


}
