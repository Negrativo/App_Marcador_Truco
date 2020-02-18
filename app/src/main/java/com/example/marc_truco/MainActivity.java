package com.example.marc_truco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    //criando os botoes da tela
     RadioGroup groupTento1;

     RadioButton pt1_1;
     RadioButton pt1_2;
     RadioButton pt1_3;
     RadioButton pt1_4;
     RadioButton pt1_5;
     RadioButton pt1_6;
     RadioButton pt1_7;
     RadioButton pt1_8;
     RadioButton pt1_9;
     RadioButton pt1_10;
     RadioButton pt1_11;

     RadioButton pt2_1;
     RadioButton pt2_2;
     RadioButton pt2_3;
     RadioButton pt2_4;
     RadioButton pt2_5;
     RadioButton pt2_6;
     RadioButton pt2_7;
     RadioButton pt2_8;
     RadioButton pt2_9;
     RadioButton pt2_10;
     RadioButton pt2_11;

    //inicializando os elementos da tela
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.pt1_1 = findViewById(R.id.Ponto1_1);
        this.pt1_2 = findViewById(R.id.Ponto1_2);
        this.pt1_3 = findViewById(R.id.Ponto1_3);
        this.pt1_4 = findViewById(R.id.Ponto1_4);
        this.pt1_5 = findViewById(R.id.Ponto1_5);
        this.pt1_6 = findViewById(R.id.Ponto1_6);
        this.pt1_7 = findViewById(R.id.Ponto1_7);
        this.pt1_8 = findViewById(R.id.Ponto1_8);
        this.pt1_9 = findViewById(R.id.Ponto1_9);
        this.pt1_10 = findViewById(R.id.Ponto1_10);
        this.pt1_11 = findViewById(R.id.Ponto1_11);


        this.pt2_1 = findViewById(R.id.Ponto2_1);
        this.pt2_2 = findViewById(R.id.Ponto2_2);
        this.pt2_3 = findViewById(R.id.Ponto2_3);
        this.pt2_4 = findViewById(R.id.Ponto2_4);
        this.pt2_5 = findViewById(R.id.Ponto2_5);
        this.pt2_6 = findViewById(R.id.Ponto2_6);
        this.pt2_7 = findViewById(R.id.Ponto2_7);
        this.pt2_8 = findViewById(R.id.Ponto2_8);
        this.pt2_9 = findViewById(R.id.Ponto2_9);
        this.pt2_10 = findViewById(R.id.Ponto2_10);
        this.pt2_11 = findViewById(R.id.Ponto2_11);


    }




   public void ClickPontos(View v){
        pt1_1.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
           }

        });
   }

}
