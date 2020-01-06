package com.bam.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PasswordActivity extends AppCompatActivity {

    private EditText edPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        edPassword = findViewById(R.id.ed_password);
    }

    public void passwordClick(View view){
        String password = edPassword.getText().toString();
        Intent intent = new Intent(PasswordActivity.this,ResultActivity.class);
        SharedPreferences sPassword = getSharedPreferences("password",MODE_PRIVATE);
        sPassword.edit()
                .putString("PASSWORD",password)
                .commit();
         startActivity(intent);
    }
}
