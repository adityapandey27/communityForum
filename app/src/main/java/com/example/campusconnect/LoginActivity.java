package com.example.campusconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView btn_to_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_to_signup= findViewById(R.id.btn_to_signup);

        btn_to_signup.setOnClickListener(view -> startActivity(new Intent(LoginActivity.this, SignupActivity.class)));
    }
}