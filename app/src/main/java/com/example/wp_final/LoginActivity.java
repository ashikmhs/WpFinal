package com.example.wp_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText studentIdET,passwordET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        studentIdET = findViewById(R.id.studentIdET);
        passwordET = findViewById(R.id.passwordET);

    }

    public void login(View view) {

        String studentID = studentIdET.getText().toString().trim();
        String password = passwordET.getText().toString().trim();

       char[] ch = password.toCharArray();

       if (ch[4]=='s'){
           Intent intent = new Intent(LoginActivity.this,NextActivity.class);
           intent.putExtra("studentId",studentID);
           startActivity(intent);
       }else {
           Toast.makeText(this, "Login failed! Enter your password again!", Toast.LENGTH_SHORT).show();
       }
    }
}