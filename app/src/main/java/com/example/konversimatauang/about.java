package com.example.konversimatauang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
//        getSupportActionBar().getTitle("About");
    }
    public void Back(View view) {
        Intent intent = new Intent(about.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
