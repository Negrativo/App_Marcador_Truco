package com.example.marc_truco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class marcador_digital extends AppCompatActivity {

    // declarando os widgets da tela que serao manipulados
    private Button btpont1;
    private Button btpont2;

    private Button btmenos1;
    private Button btmenos2;

    private Button bt_truco;

    private EditText pontos1;
    private EditText pontos2;

    private int total1;
    private int total2;

    //------------------------------------------------------------//
    //Barra de Menu




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcador_digital);

        //mapeando eles a partir das referencias dos componentes xml
        btpont1 = findViewById(R.id.bt_add_pont1);
        btpont2 = findViewById(R.id.bt_add_pont2);
        btmenos1 = findViewById(R.id.bt_menos1);
        btmenos2 = findViewById(R.id.bt_menos2);
        bt_truco = findViewById(R.id.bt_truco);
        pontos1 = findViewById(R.id.pontos1);
        pontos2 = findViewById(R.id.pontos2);

        //referenciando itens de menu




        //adicionando função ao botao de pontuação para time 1
        btpont1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pontos;
                int btpontos;
                pontos = (Integer.parseInt(pontos1.getText().toString())); //passando valor txtEdit para variavel
                btpontos = (Integer.parseInt(btpont1.getText().toString())); //passando valor do botao para variavel
                if (pontos >= 12){
                    pontos = 1;
                }else
                    if(pontos <= 11) {
                    pontos = pontos + btpontos;  //acressenta pontuação a partir do valor do botao
                    }

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
                if (pontos >= 12){
                    pontos = 1;
                }else
                    if(pontos <= 11) {
                    pontos = pontos + btpontos; //acressenta pontuação a partir do valor do botao
                    }

                pontos2.setText(String.valueOf(pontos));
            }
        });

        //adicionando pontuação ao botao de truco (ainda precisa ser implementado melhor)
        bt_truco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int bt1;
                int bt2;

                bt1 = (Integer.parseInt(btpont1.getText().toString()));//recebendo valor do botao
                bt2 = (Integer.parseInt(btpont2.getText().toString()));

                if (bt1 == 1) { //se o valor for 1 no botao, adiciona apenas +2
                    bt1 = bt1 + 2;
                } else if (bt1 < 10) {//ultimo funcionamento ate valor 9 do botao, pois adiciona apenas mais uma vez +3
                    bt1 = bt1 + 3;
                } else
                    bt1 = 1;//apos chegar no valor maximo de truco(12) ele retorna para 1;
                if (bt2 == 1) {
                    bt2 = bt2 + 2;
                } else if (bt2 < 10) {
                    bt2 = bt2 + 3;
                } else
                    bt2 = 1;

                btpont1.setText(String.valueOf(bt1));//passando valor para botao
                btpont2.setText(String.valueOf(bt2));
            }
        });

        btmenos1.setOnClickListener(new View.OnClickListener() {//botao para subitrair pontuação do time1
            @Override
            public void onClick(View v) {
                int val;
                val = (Integer.parseInt(pontos1.getText().toString()));//recebendo valor do edtText

                if (val > 0) {
                    val = val - 1;//subitraindo valor da pontuação
                }
                pontos1.setText(String.valueOf(val));
            }
        });

        btmenos2.setOnClickListener(new View.OnClickListener() {//botao para subitrair pontuação do time2
            @Override
            public void onClick(View v) {
                int val;
                val = (Integer.parseInt(pontos2.getText().toString()));//recebendo valor do edtText

                if (val > 0) {
                    val = val - 1;
                }
                pontos2.setText(String.valueOf(val));
            }
        });



        /*
        total1 = (Integer.parseInt(pontos1.getText().toString()));
        total2 = (Integer.parseInt(pontos2.getText().toString()));

        if (total1 >= 12){//se pontuação do time 1 for maior que 12 zerar placar
            total1 = 1;
            pontos1.setText(String.valueOf(total1));
        }
        if (total2 >= 12){//se pontuação do time 2 for maior que 12 zerar placar
            total2 = 1;
            pontos2.setText(String.valueOf(total2));
        }

         */

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menubar, menu);

        MenuItem cred = findViewById(R.id.creditos);
        MenuItem ajuda = findViewById(R.id.ajuda);
        MenuItem marc_dig = findViewById(R.id.marc_dig);
        MenuItem marc_fis = findViewById(R.id.marc_fis);

        /*
        MenuItem cred = menu.add(0,0,0,"Creditos");
        MenuItem ajuda = menu.add(0,1,1,"Ajuda");
        MenuItem marc_dig = menu.add(0,2,2,"Digital");
        MenuItem marc_fis = menu.add(0,3,3,"Fisico");
         */


        return true;
    }



}
