package dali.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private TextView name;
    private Button retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = (TextView) findViewById(R.id.textView);
        retour = (Button) findViewById(R.id.btnRetour);

        Bundle bundle = getIntent().getExtras();
        String name= bundle.getString("name");
        String prenom = bundle.getString("prenom");

        Toast.makeText(Main2Activity.this,"welcome "+name+" "+prenom,Toast.LENGTH_LONG).show();

        retour.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,MainActivity.class);

                startActivity(intent);
            }
        });

    }
}
