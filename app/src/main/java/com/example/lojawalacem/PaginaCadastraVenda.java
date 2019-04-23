package com.example.lojawalacem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class PaginaCadastraVenda extends AppCompatActivity {

    public static float total=0;
    public int contCPU=5, contMonitor=5, contMouse=5, contTeclado=5;
    public static ArrayList<String> Lista;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_cadastra_venda);
        Lista=new ArrayList<>();
        PaginaCadastraVenda.Lista.add("Walace");



        Button vendaDinheiro = (Button) findViewById(R.id.btVendaDinheiro);
        final TextView TotaldaVenda = (TextView) findViewById(R.id.txTotaldaVenda);

        final TextView unCPU = (TextView) findViewById(R.id.unCPU);
        final TextView unMonitor = (TextView) findViewById(R.id.unMonitor);
        final TextView unMouse = (TextView) findViewById(R.id.unMouse);
        final TextView unTeclado = (TextView) findViewById(R.id.unTeclado);


        Button teclado = (Button) findViewById(R.id.btTeclado);
        teclado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contTeclado--;
                unTeclado.setText(contTeclado+" - Un. de Teclado disponíveis.");
                total+=100;
                TotaldaVenda.setText("Total da venda: "+total);
            }
        });

        Button monitor = (Button) findViewById(R.id.btMonitor);
        monitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contMonitor--;
                unMonitor.setText(contMonitor+" - Un. de Monitor disponíveis.");
                total+=550;
                TotaldaVenda.setText("Total da venda: "+total);
            }
        });

        Button mouse = (Button) findViewById(R.id.btMouse);
        mouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contMouse--;
                unMouse.setText(contMouse+" - Un. de Mouse disponíveis.");
                total+=30;
                TotaldaVenda.setText("Total da venda: "+total);
            }
        });

        Button cpu = (Button) findViewById(R.id.btCPU);
        cpu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contCPU--;
                unCPU.setText(contCPU+" - Un. de CPU disponíveis.");
                total+=1000;
                TotaldaVenda.setText("Total da venda: "+total);
            }
        });

        vendaDinheiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vendaD = new Intent( PaginaCadastraVenda.this, VendaDinheiro.class);
                startActivity(vendaD);
            }
        });

        Button btvendaCartao = (Button) findViewById(R.id.btVendaCartão);
        btvendaCartao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vendaC = new Intent( PaginaCadastraVenda.this, VendaCartao.class);
                startActivity(vendaC);
            }
        });
        Button btvendaCheque = (Button) findViewById(R.id.btVendaCheque);
        btvendaCheque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vendaCh = new Intent( PaginaCadastraVenda.this, VendaCheque.class);
                startActivity(vendaCh);
            }
        });



    }

}
