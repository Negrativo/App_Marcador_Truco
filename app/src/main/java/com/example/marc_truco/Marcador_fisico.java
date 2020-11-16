package com.example.marc_truco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Marcador_fisico extends AppCompatActivity {





    //inicializando os elementos da tela
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcador_fisico);

        //criando os botoes da tela
        Button bt_voltar = findViewById(R.id.btn_voltar);

        bt_voltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {  //para implementar os itens no codigo para manipular
        getMenuInflater().inflate(R.menu.menubar, menu);

         /*
        MenuItem trocaM;
        trocaM.setOnMenuItemClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, marcador_digital.class);
                startActivity(intent);
            }
        });


        return true;


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.marc_dig:
                Intent intent2 = new Intent(this, marcador_digital.class);
                this.startActivity(intent2);
                break;
            case R.id.cred:
                Intent intent3 = new Intent(this, Creditos.class);
                this.startActivity(intent3);
                break;
            case R.id.help:
                Intent intent4 = new Intent(this, ajuda.class);
                this.startActivity(intent4);
                break;
        }


        return super.onOptionsItemSelected(item);
    }
*/
}
