package com.example.nishant.edwisor_project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private EditText Username, Password;
    private SharedPreferences prefrences;
    private boolean loginstatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Username = (EditText) findViewById(R.id.username);
        Password = (EditText) findViewById(R.id.password);
        prefrences = getSharedPreferences("LoginPrefrences", MODE_PRIVATE);
        loginstatus = prefrences.getBoolean("Login", false);
        if (loginstatus) {
            Intent intent = new Intent(SecondActivity.this, View.class);
            startActivity(intent);
            finish();
        }

    }

    public void login(View view) {
        if (Username.getText().toString().contentEquals("user123@example.com") && Password.getText().toString().contentEquals("User@1234")) {
            SharedPreferences.Editor editor = prefrences.edit();
            editor.putBoolean("Login", true).commit();
            Intent intent = new Intent(SecondActivity.this, com.example.nishant.edwisor_project.View.class);
            startActivity(intent);
            Toast.makeText(this, "Congrats! Logged in", Toast.LENGTH_SHORT).show();
            finish();
        } else {
            Toast.makeText(this, "Unable to login", Toast.LENGTH_SHORT).show();
        }
    }
}
