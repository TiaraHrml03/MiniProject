package com.example.jadku;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
    }

    public void onLogin(View v) {
        String username = et1.getText().toString();
        String password = et2.getText().toString();
        if (username.equals("admin") && password.equals("admin")) {
            Intent myIntent = new Intent(this, home.class);
            startActivity(myIntent);
        }
    }
}