package com.example.jadku;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class jadwalkelas extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwalkelas);
        Button sen = (Button) findViewById(R.id.btn_senin);
        Button sel = (Button) findViewById(R.id.btn_selasa);
        Button rab = (Button) findViewById(R.id.btn_rabu);
        Button kam = (Button) findViewById(R.id.btn_kamis);
        Button jum = (Button) findViewById(R.id.btn_jumat);

        sen.setOnClickListener((view -> {
            Intent i = new Intent(getApplicationContext(), senin.class);
            startActivity(i);
        }));
        sel.setOnClickListener((view -> {
            Intent i = new Intent(getApplicationContext(), selasa.class);
            startActivity(i);
        }));
        rab.setOnClickListener((view -> {
            Intent i = new Intent(getApplicationContext(), rabu.class);
            startActivity(i);
        }));
        kam.setOnClickListener((view -> {
            Intent i = new Intent(getApplicationContext(), kamis.class);
            startActivity(i);
        }));
        jum.setOnClickListener((view -> {
            Intent i = new Intent(getApplicationContext(), jumat.class);
            startActivity(i);
        }));
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_senin:
                startActivity(new Intent(this, senin.class));
                break;
            case R.id.btn_selasa:
                startActivity(new Intent(this, selasa.class));
                break;
            case R.id.btn_rabu:
                startActivity(new Intent(this, rabu.class));
                break;
            case R.id.btn_kamis:
                startActivity(new Intent(this, kamis.class));
                break;
            case R.id.btn_jumat:
                startActivity(new Intent(this, jumat.class));
                break;
        }
    }
}