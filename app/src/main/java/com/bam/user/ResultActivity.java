package com.bam.user;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class ResultActivity extends AppCompatActivity {

    private EditText name;
    private EditText account;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        name = findViewById(R.id.name);
        account = findViewById(R.id.account);
        password = findViewById(R.id.password);
        String userName = getSharedPreferences("name",MODE_PRIVATE)
                .getString("NAME","");
        name.setText(userName);
        String userAccount = getSharedPreferences("account",MODE_PRIVATE)
                .getString("ACCOUNT","");
        account.setText(userAccount);
        String userPassword = getSharedPreferences("password",MODE_PRIVATE)
                .getString("PASSWORD","");
        password.setText(userPassword);
    }
}
