package com.example.lojawalacem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaginaCaixa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_caixa);


        Button Cadastra = (Button) findViewById(R.id.cadastraVenda);
        Cadastra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent PCadastraVenda = new Intent(PaginaCaixa.this, PaginaCadastraVenda.class);
                startActivity(PCadastraVenda);
            }
        });


    }



}
