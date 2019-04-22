package com.example.lojawalacem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class logGerente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loggerente);
        Button telaLogGerente = (Button) findViewById(R.id.btLogarGerente);


        telaLogGerente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView textoLogG = (TextView) findViewById(R.id.txLoguinGerente);

                TextView textoSenhaG = (TextView) findViewById(R.id.txSenhaGerente);

                String usuarioGerente = textoLogG.getText().toString();

                String senhaGerente = textoSenhaG.getText().toString();


                if(usuarioGerente.equals("admin")&& senhaGerente.equals("admin")){
                    alert("Loguin realizado com sucesso!");
                    Intent PGerente = new Intent(logGerente.this, PaginaGerente.class);
                    startActivity(PGerente);

                }else {
                    alert("Loguin ou senha incorretos!!!");
                }
            }
        });

    }


    public void alert(String s){
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }
}
