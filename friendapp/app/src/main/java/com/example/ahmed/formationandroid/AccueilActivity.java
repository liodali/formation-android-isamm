package com.example.ahmed.formationandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AccueilActivity extends AppCompatActivity {
    private TextView tvname;
    private Button logOut,freinds,addFreind;
    private String userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        tvname = findViewById(R.id.textView);
        logOut = findViewById(R.id.logOutBtn);
        freinds = findViewById(R.id.friendsBtn);
        addFreind = findViewById(R.id.addFreindBtn);

        //getting Intent
        Bundle extras = getIntent().getExtras();



        if (extras != null) {
            userName = extras.getString("userName");
            tvname.setText("Welcome "+userName);;
        }
        //  log Out button listener
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AccueilActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        //  freinds button listener
        freinds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AccueilActivity.this,"freinds clicked",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AccueilActivity.this, FreindsActivity.class);
                startActivity(intent);
            }
        });
        // Add freind button listener
        addFreind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AccueilActivity.this,"Add freinds clicked",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
