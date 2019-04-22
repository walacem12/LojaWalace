package com.example.lojawalacem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class logCaixa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logcaixa);


        Button telaLogCaixa = (Button) findViewById(R.id.btLogarCaixa);


        telaLogCaixa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView textoLogC = (TextView) findViewById(R.id.txLoguinCaixa);
                TextView textoSenhaC = (TextView) findViewById(R.id.txSenhaCaixa);
                String usuarioCaixa = textoLogC.getText().toString();
                String senhaCaixa = textoSenhaC.getText().toString();


                if(usuarioCaixa.equals("admin")&& senhaCaixa.equals("admin")){
                    alert("Loguin realizado com sucesso!");
                    Intent PCaixa = new Intent( logCaixa.this, PaginaCaixa.class);
                    startActivity(PCaixa);

                }else {
                    alert("Loguin ou senha incorretos!!!");
                }
            }
        });

    }

    public void alert(String p){
        Toast.makeText(this,p,Toast.LENGTH_LONG).show();
    }
}
