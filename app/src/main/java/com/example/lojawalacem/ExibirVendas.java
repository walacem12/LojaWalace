package com.example.lojawalacem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ExibirVendas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_vendas);
        ListView Vendas = (ListView) findViewById(R.id.listaVendas);


        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, PaginaCadastraVenda.Lista);
        Vendas.setAdapter(arrayAdapter);


    }
}
