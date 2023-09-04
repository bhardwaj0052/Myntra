package com.example.myntra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.lang.UCharacter;
import android.os.Bundle;
import android.os.Handler;

public class ss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(ss.this, MainActivity.class);
                startActivity(i);
                finish();

            }
        },3000);
    }
}