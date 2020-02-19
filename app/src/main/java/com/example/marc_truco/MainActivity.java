package com.example.marc_truco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;


public class MainActivity extends AppCompatActivity {

    //criando os botoes da tela


    //inicializando os elementos da tela
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menubar, menu);
        return true;
    }



}
