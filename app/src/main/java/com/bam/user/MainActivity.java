package com.bam.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edName = findViewById(R.id.ed_name);
    }

    public void nameClick(View view){
        String name = edName.getText().toString();
        Intent intent = new Intent(MainActivity.this,AccountActivity.class);
        SharedPreferences sName = getSharedPreferences("name",MODE_PRIVATE);
        sName.edit()
                .putString("NAME",name)
                .commit();
        startActivity(intent);
    }
}
