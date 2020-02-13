package com.example.marc_truco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




   public void Onclick(View v){
       final CheckBox box1 =  findViewById(R.id.Ponto1_1);
       box1.setOnClickListener(new View.OnClickListener(){

           @Override
           public void onClick(View v) {
               box1.setVisibility(View.VISIBLE);
           }

       });
   }

}
