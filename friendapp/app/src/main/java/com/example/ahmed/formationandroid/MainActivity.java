package com.example.ahmed.formationandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView error;
    private EditText userName, password;
    private Button login;
    private String name, pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        error = findViewById(R.id.tvError);
        userName = findViewById(R.id.name);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = userName.getText().toString();
                pwd = password.getText().toString();
                Intent intent = new Intent(MainActivity.this, AccueilActivity.class);
                intent.putExtra("userName", name);
                if (name.equals(pwd) && name.equals("admin")) {
                    startActivity(intent);
                    finish();
                } else {
                    error.setText("error");
                }

            }
        });

    }
}
