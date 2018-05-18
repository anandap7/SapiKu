package com.project.xavier.sapiku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Konfirmasi extends AppCompatActivity {

    private Button go_pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.logo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_konfirmasi);

        go_pay = (Button) findViewById(R.id.go_pay);
        go_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(Konfirmasi.this, Pembayaran.class);
                startActivity(move);
                finish();
            }
        });
    }
}
