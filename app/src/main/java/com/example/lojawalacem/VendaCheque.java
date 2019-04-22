package com.example.lojawalacem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class VendaCheque extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venda_cheque);

        Button btFinalizaC = (Button) findViewById(R.id.btFinalizaVC);
        final TextView txVtotalC = (TextView) findViewById(R.id.txValorCH);
        final String menC = String.valueOf(PaginaCadastraVenda.total);
        txVtotalC.setText("Valor total da compra: R$"+ menC);


        btFinalizaC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView txIdentidade = (TextView) findViewById(R.id.txIdentidade);
                String Identidade = txIdentidade.getText().toString();

                if(Identidade.equals("123")){
                    alert("Venda finalizada com sucesso!");
                    Intent FinalizaVCh = new Intent( VendaCheque.this, MainActivity.class);
                    startActivity(FinalizaVCh);

                }else {
                    alert("Número de Identidade inválido!");
                }
            }
        });
    }

    public void alert(String p){
        Toast.makeText(this,p,Toast.LENGTH_LONG).show();
    }



}

