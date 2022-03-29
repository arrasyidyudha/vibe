package com.example.vibe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Info extends AppCompatActivity {


   TextView v_username;
    TextView v_prodi;
    TextView v_univ;
    TextView v_telp;
    TextView v_email;
    TextView v_password;
    TextView v_konfirmasi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);



        v_username =findViewById(R.id.r_username);
        v_prodi = findViewById(R.id.r_prodi);
        v_univ = findViewById(R.id.r_univ);
        v_telp = findViewById(R.id.r_telp);
        v_email = findViewById(R.id.r_email);
        v_password = findViewById(R.id.r_password);
        v_konfirmasi =findViewById(R.id.r_konfirmasi);


        Intent intent = getIntent();


        String username = intent.getStringExtra("username");
        String prodi = intent.getStringExtra("prodi");
        String univ = intent.getStringExtra("univ");
        String telp = intent.getStringExtra("telp");
        String email = intent.getStringExtra("email");
        String password = intent.getStringExtra("password");
        String konfirmasi = intent.getStringExtra("konfirmasi");


        v_username.setText(username);
        v_prodi.setText(prodi);
        v_univ.setText(univ);
        v_telp.setText(telp);
        v_email.setText(email);
        v_password.setText(password);
        v_konfirmasi.setText(konfirmasi);






    }

    public void home(View view) {
        Intent intent = new Intent(Info.this, Homepage.class);
        startActivity(intent);
    }
}