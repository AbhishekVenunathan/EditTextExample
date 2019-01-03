package com.abhishekvenunathan.edittextexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void logIn(View view){
        EditText username = findViewById(R.id.userText);
        EditText password = findViewById(R.id.passText);

        Log.i("Username:",username.getText().toString());
        Log.i("Password:",password.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
