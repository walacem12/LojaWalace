package com.example.lojawalacem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class VendaCartao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venda_cartao);

        final TextView txVtotalCar = (TextView) findViewById(R.id.txVtotalCartão);
        final String menCar = String.valueOf(PaginaCadastraVenda.total);
        txVtotalCar.setText("Valor total da compra: R$"+ menCar);


        Button confirmaCar = (Button) findViewById(R.id.btConfirma);
        confirmaCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView nCartao = (TextView) findViewById(R.id.txnCartão);
                String numeroCartao = nCartao.getText().toString();

                if(numeroCartao.equals("123")){
                    alert("Cartão cadastrado com sucesso! Finalize a compra.");

                }else {
                    alert("Número de cartão inválido!");
                }
            }
        });


        Button insereCartao = (Button) findViewById(R.id.btInsereC);
        insereCartao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert("Insira o cartão na máquina!");
            }
        });


       Button finalizaCompraCar = (Button) findViewById(R.id.btFinalizaCredito);
        finalizaCompraCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert("Compra realizada com sucesso!");
                Intent FinalizaVC11 = new Intent( VendaCartao.this, PaginaCaixa.class);
                startActivity(FinalizaVC11);

            }
        });

    }
    public void alert(String p){
        Toast.makeText(this,p,Toast.LENGTH_LONG).show();
    }
}
