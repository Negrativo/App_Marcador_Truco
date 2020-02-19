package com.example.marc_truco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class marcador_digital extends AppCompatActivity {

    // declarando os widgets da tela que serao manipulados
    private Button btpont1;
    private Button btpont2;

    private Button bt_truco;

    private EditText pontos1;
    private EditText pontos2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcador_digital);

        //mapeando eles a partir das referenciar dos componentes xml
        btpont1 = findViewById(R.id.bt_add_pont1);
        btpont2 = findViewById(R.id.bt_add_pont2);
        bt_truco = findViewById(R.id.bt_truco);
        pontos1 = findViewById(R.id.pontos1);
        pontos2 = findViewById(R.id.pontos2);

        //adicionando função ao botao de pontuação para time 1
        btpont1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pontos;
                int btpontos;
                pontos = (Integer.parseInt(pontos1.getText().toString())); //passando valor txtEdit para variavel
                btpontos = (Integer.parseInt(btpont1.getText().toString())); //passando valor do botao para variavel
                pontos = pontos+btpontos;  //acressenta pontuação a partir do valor do botao
                pontos1.setText(String.valueOf(pontos));
            }
        });

        //adicionando função ao botao de pontuação para time 2
        btpont2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pontos;
                int btpontos;
                pontos = (Integer.parseInt(pontos2.getText().toString())); //passando valor txtEdit para variavel
                btpontos = (Integer.parseInt(btpont2.getText().toString())); //passando valor do botao para variavel
                pontos = pontos+btpontos; //acressenta pontuação a partir do valor do botao
                pontos2.setText(String.valueOf(pontos));
            }
        });

        //adicionando pontuação ao botao de truco (ainda precisa ser implementado melhor)
        bt_truco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int bt1 ;
                int bt2 ;

                bt1 = (Integer.parseInt(btpont1.getText().toString()));
                bt2 = (Integer.parseInt(btpont2.getText().toString()));

                bt1 = bt1+3;

                bt2 = bt2+3;
                btpont1.setText(String.valueOf(bt1));
                btpont2.setText(String.valueOf(bt2));
            }
        });

    }

}
