package com.example.experiment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Rant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rant);
    }

    public void toBlow(View view) {
        Intent intent = new Intent(this, Blow.class);
        startActivity(intent);
    }
}
