package com.example.marc_truco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    //criando os botoes da tela
    private CheckBox pt1;

    //inicializando os elementos da tela
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.pt1 =  findViewById(R.id.Ponto1_1);

    }




   public void Onclick(View v){
        pt1.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               pt1.setVisibility(View.VISIBLE);
           }

        });
   }

}
