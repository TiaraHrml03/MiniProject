package com.example.jadku;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class home extends AppCompatActivity implements View.OnClickListener{
    ImageButton matkul, dafsen, jadkel, info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        matkul = findViewById(R.id.btn_matkul);
        dafsen = findViewById(R.id.btn_dosen);
        jadkel = findViewById(R.id.btn_kelas);
        info = findViewById(R.id.btn_ingfo);

        matkul.setOnClickListener(this);
        dafsen.setOnClickListener(this);
        jadkel.setOnClickListener(this);
        info.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_dosen:
                startActivity(new Intent(this, daftardosen.class));
                break;
            case R.id.btn_matkul:
                startActivity(new Intent(this, matakuliah.class));
                break;
            case R.id.btn_kelas:
                startActivity(new Intent(this, jadwalkelas.class));
                break;
            case R.id.btn_ingfo:
                startActivity(new Intent(this, Informasi.class));
                break;

        }
    }
}