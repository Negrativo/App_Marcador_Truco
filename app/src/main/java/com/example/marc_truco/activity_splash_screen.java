package com.example.marc_truco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class activity_splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override public void run() {
                MenuTruco();
            }
        }, 2000);




    }

    private void MenuTruco() {
        Intent intent = new Intent(activity_splash_screen.this, Menu_principal.class);
        startActivity(intent);
        finish();
    }

}
