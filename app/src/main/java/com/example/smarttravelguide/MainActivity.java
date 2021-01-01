package com.example.smarttravelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText user = (EditText)findViewById(R.id.username);
        final EditText pass = (EditText)findViewById(R.id.password);
        final Button login = (Button)findViewById(R.id.login);
        final Button register = (Button)findViewById(R.id.register);

        String username = user.getText().toString();
        String password = pass.getText().toString();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SigningPage.class);
                startActivity(intent);
            }
        });
    }
}
