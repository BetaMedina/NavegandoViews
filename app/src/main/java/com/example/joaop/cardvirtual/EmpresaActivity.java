package com.example.joaop.cardvirtual;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class EmpresaActivity extends Activity {
        private ImageView empVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresa);
        empVoltar = findViewById(R.id.emp_voltarId);
        empVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EmpresaActivity.this,MainActivity.class));
            }
        });
    }
}
