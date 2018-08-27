package com.example.joaop.cardvirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ClientesActivity extends AppCompatActivity {

    private ImageView mvoltar_cliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes);

        mvoltar_cliente=findViewById(R.id.voltar_ClienteId);

        mvoltar_cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ClientesActivity.this, MainActivity.class));
            }
        });

    }
}
