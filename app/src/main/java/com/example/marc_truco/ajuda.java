package com.example.marc_truco;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ajuda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajuda);

        ImageView tuto1 = findViewById(R.id.tuto1);
        ImageView tuto2 = findViewById(R.id.tuto2);

        TextView ptdig = findViewById(R.id.ponts);
        TextView adcpont = findViewById(R.id.adcpont);
        TextView ptsdig = findViewById(R.id.ptsdig);
        TextView ptfis = findViewById(R.id.pontosfis);
        TextView pttento = findViewById(R.id.tentosfis);
        TextView ajuda = findViewById(R.id.ajuda);
        TextView dimdig = findViewById(R.id.dimdig);

        Button bt_voltar= findViewById(R.id.btn_voltar);

        bt_voltar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(ajuda.this, Menu_principal.class);
                startActivity(intent);
            }
        });

    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menubar, menu);

        /*
        MenuItem cred = findViewById(R.id.creditos);
        MenuItem ajuda = findViewById(R.id.ajuda);
        MenuItem marc_dig = findViewById(R.id.marc_dig);
        MenuItem marc_fis = findViewById(R.id.marc_fis);


        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.marc_fis:
                Intent intent1 = new Intent(this, MainActivity.class);
                this.startActivity(intent1);
                break;
            case R.id.marc_dig:
                Intent intent2 = new Intent(this, marcador_digital.class);
                this.startActivity(intent2);
                break;
            case R.id.cred:
                Intent intent3 = new Intent(this, Creditos.class);
                this.startActivity(intent3);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

     */

}
