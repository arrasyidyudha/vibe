package com.example.vibe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //    Fungsi untuk beralih screen dengn menggunakan intent
    //    dari halaman login ke halaman register
    public void register(View view) {
        Intent intent = new Intent(MainActivity.this, Register.class);
        startActivity(intent);

    }

    //    Fungsi untuk beralih screen dengn menggunakan intent
    //    dari halaman login ke halaman Utama
    public void homepage(View view) {
        Intent intent = new Intent(MainActivity.this, Homepage.class);
        startActivity(intent);
    }
}