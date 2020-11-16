package com.example.marc_truco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu_principal extends AppCompatActivity {

    //declarando os botoes a ser manipulados
    private Button btn_marca_digit;
    private Button btn_marca_fisic;
    private Button btn_ajuda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        //Referenciando os botoes
        Button btn_marca_digit = findViewById(R.id.btn_marcador_digital);
        Button btn_marca_fisic = findViewById(R.id.btn_marcador_fisico);
        Button btn_ajuda = findViewById(R.id.btn_ajuda);
        
        
        btn_marca_digit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(Menu_principal.this, marcador_digital.class);
                startActivity(intent);
            }
        });

        btn_marca_fisic.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent2;
                intent2 = new Intent(Menu_principal.this, Marcador_fisico.class);
                startActivity(intent2);
            }
        });

        btn_ajuda.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent3;
                intent3 = new Intent(Menu_principal.this, ajuda.class);
                startActivity(intent3);
            }
        });

    }

}
