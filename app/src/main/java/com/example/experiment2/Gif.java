package com.example.experiment2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Gif extends AppCompatActivity {

    public void toEnd() {
        Intent intent = new Intent(this, End.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            public void run() {
                toEnd();
            }

        }, 2500);
    }
}
