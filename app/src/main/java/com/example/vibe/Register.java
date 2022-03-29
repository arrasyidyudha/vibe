package com.example.vibe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Register extends AppCompatActivity {

    EditText p_username;
    EditText p_prodi;
    EditText p_univ;
    EditText p_telp;
    EditText p_email;
    EditText p_password;
    EditText p_konfirmasi;
    Button btn_register;

    boolean isAllFieldsChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        p_username = findViewById(R.id.username);
        p_prodi = findViewById(R.id.prodi);
        p_univ = findViewById(R.id.univ);
        p_telp =  findViewById(R.id.telp);
        p_email = findViewById(R.id.email);
        p_password = findViewById(R.id.password);
        p_konfirmasi = findViewById(R.id.konfirmasi);
        btn_register = findViewById(R.id.button_register);

        btn_register.setOnClickListener(view -> {

             //cek validasi
                isAllFieldsChecked = CheckAllFields();


            String username = p_username.getText().toString();
            String prodi = p_prodi.getText().toString();
            String univ = p_univ.getText().toString();
            String telp = p_telp.getText().toString();
            String email = p_email.getText().toString();
            String password = p_password.getText().toString();
            String konfirmasi = p_konfirmasi.getText().toString();



            if (isAllFieldsChecked) {
                Intent intent = new Intent(Register.this, Info.class);
                intent.putExtra("username", username);
                intent.putExtra("prodi", prodi);
                intent.putExtra("univ", univ);
                intent.putExtra("telp", telp);
                intent.putExtra("email", email);
                intent.putExtra("password", password);
                intent.putExtra("konfirmasi", konfirmasi);
                startActivity(intent);
            }


        });

    }

    public void login(View view) {
        Intent intent = new Intent(Register.this, MainActivity.class);
        startActivity(intent);
    }

    //fungsi validasi form
    private boolean CheckAllFields() {
        if (p_username.length() == 0) {
            p_username.setError("This field is required");
            return false;
        }

        if (p_prodi.length() == 0) {
            p_prodi.setError("This field is required");
            return false;
        }

        if (p_email.length() == 0) {
            p_email.setError("Email is required");
            return false;
        }

        if (p_password.length() == 0) {
            p_password.setError("Password is required");
            return false;
        } else if (p_password.length() < 8) {
            p_password.setError("Password must be minimum 8 characters");
            return false;

            //validasi password masih eror
//        } else if (p_password.equals(p_konfirmasi)) {
//            p_konfirmasi.setError(null);
//            return true;
//        } else if (!p_konfirmasi.equals(p_password)) {
//            p_konfirmasi.setError("Password is not match");
//            return false;
        }
        return true;

    }


    }




