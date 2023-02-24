package com.example.campusconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {
    TextView btn_to_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btn_to_login= findViewById(R.id.btn_to_login);


        btn_to_login.setOnClickListener(view -> startActivity(new Intent(SignupActivity.this, LoginActivity.class)));
    }
}