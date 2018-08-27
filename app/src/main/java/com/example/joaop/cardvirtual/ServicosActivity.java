package com.example.joaop.cardvirtual;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ServicosActivity extends AppCompatActivity {

        private ImageView mvoltar_servicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicos);

        mvoltar_servicos = findViewById(R.id.voltar_servicosId);
        mvoltar_servicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ServicosActivity.this, MainActivity.class));
            }
        });
    }
}
