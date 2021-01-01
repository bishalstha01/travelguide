package com.example.smarttravelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SigningPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signing_page);
        final EditText ed1 = (EditText)findViewById(R.id.name);
        final EditText ed2 = (EditText)findViewById(R.id.email);
        final EditText ed3 = (EditText)findViewById(R.id.username);
        final EditText ed4 = (EditText)findViewById(R.id.password1);
        final EditText ed5 = (EditText)findViewById(R.id.password2);
        final Button btn_reg = (Button)findViewById(R.id.register);

        String name = ed1.getText().toString();
        String email = ed2.getText().toString();
        String username = ed3.getText().toString();
        String password1 = ed4.getText().toString();
        String password2 = ed5.getText().toString();

        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}