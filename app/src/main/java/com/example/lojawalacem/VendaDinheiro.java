package com.example.lojawalacem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class VendaDinheiro extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venda_dinheiro);

        final TextView txVtotal = (TextView) findViewById(R.id.txVTotal);
        final String men = String.valueOf(PaginaCadastraVenda.total);
        txVtotal.setText("Valor total da compra: R$"+ men);


        final Button geraTroco =(Button)findViewById(R.id.btVtroco);




        geraTroco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float valor = Float.valueOf(men);

               TextView DigiteOTroco = (TextView) findViewById(R.id.txVPtroco);
                String trocodigitado = DigiteOTroco.getText().toString();
                float toma =Float.valueOf(trocodigitado);



                TextView ver = (TextView) findViewById(R.id.txvTroco);

                if(toma>=valor) {
                    float soma = valor - toma;

                    String Samatorio = String.valueOf(soma);
                    ver.setText("Troco do cliente: R$" + Samatorio);
                }else{
                    alert("Valor menor que a compra! Digite novamente...");
                }

            }
        });

        Button finalizaDinheiro= (Button) findViewById(R.id.btFinalDin);

        finalizaDinheiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pprincipal = new Intent(VendaDinheiro.this, PaginaCaixa.class);
                startActivity(Pprincipal);
                alert("Venda registrada com sucesso!");
            }
        });








    }

    public void alert(String p){
        Toast.makeText(this,p,Toast.LENGTH_LONG).show();
    }

}
