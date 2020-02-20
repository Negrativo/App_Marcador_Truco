package com.example.marc_truco;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Creditos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menubar, menu);

        /*
        MenuItem cred = findViewById(R.id.creditos);
        MenuItem ajuda = findViewById(R.id.ajuda);
        MenuItem marc_dig = findViewById(R.id.marc_dig);
        MenuItem marc_fis = findViewById(R.id.marc_fis);

         */
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
            case R.id.help:
                Intent intent4 = new Intent(this, ajuda.class);
                this.startActivity(intent4);
                break;
        }


        return super.onOptionsItemSelected(item);
    }



}
