package com.bam.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AccountActivity extends AppCompatActivity {

    private EditText edAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        edAccount = findViewById(R.id.ed_account);
    }
    public void accountClick(View view){
        String account = edAccount.getText().toString();
        Intent intent = new Intent(AccountActivity.this,PasswordActivity.class);
        SharedPreferences sName = getSharedPreferences("account",MODE_PRIVATE);
        sName.edit()
                .putString("ACCOUNT",account)
                .commit();
        startActivity(intent);
    }

}
