package com.example.joaop.cardvirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ContatoActivity extends AppCompatActivity {

    private ImageView mVoltar_contato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);

        mVoltar_contato= findViewById(R.id.voltar_contatoId);

        mVoltar_contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ContatoActivity.this,MainActivity.class));
            }
        });

    }
}
