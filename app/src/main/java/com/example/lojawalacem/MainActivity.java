package com.example.lojawalacem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button gerente = (Button) findViewById(R.id.btGerente);
        Button caixa = (Button) findViewById(R.id.btCaixa);


    }
    public void chamaLogG(View v){
        Intent chamaTG = new Intent(getApplicationContext(), logGerente.class);
        startActivity(chamaTG);
    }
    public void chamaLogC(View v){
        Intent chamaTC = new Intent(getApplicationContext(), logCaixa.class);
        startActivity(chamaTC);
    }
}
