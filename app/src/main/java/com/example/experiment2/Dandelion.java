package com.example.experiment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Dandelion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dandelion);
    }

    public void toRant(View view) {
        Intent intent = new Intent(this, Rant.class);
        startActivity(intent);
    }

}
