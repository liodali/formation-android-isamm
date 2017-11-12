package dali.firstapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private TextView msg;
    private EditText edt;
    private Button ok ,next,exit;

    private Button call;
    private EditText numberphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        msg= (TextView) findViewById(R.id.id_txt_msg);
        ok=(Button) findViewById(R.id.id_button_ok);
        next=(Button)findViewById(R.id.id_button_next);
        exit=(Button) findViewById(R.id.id_button_exit);


        edt=(EditText) findViewById(R.id.id_edt_username);

       exit.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View v) {
               finish();
           }
       });
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=edt.getText().toString();
                if(username.isEmpty()){
                  //  msg.setText("enter your name please!");
                    Toast.makeText(MainActivity.this,"enter your name please!!",Toast.LENGTH_LONG).show();
                }else{
                    msg.setText("welcome "+username);
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);

                String nName = edt.getText().toString();
                String prenom = "ahmed";

                intent.putExtra("name",nName);
                intent.putExtra("prenom",prenom);
                startActivity(intent);
                finish();
            }
        });



        call=(Button) findViewById(R.id.id_bt_make_call);

        numberphone=(EditText) findViewById(R.id.id_edt_phone);



        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mcall=numberphone.getText().toString();
                if (ActivityCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(MainActivity.this,"Permission not granted check setting plz!", Toast.LENGTH_LONG).show();
                    return;
                }
                if(mcall.isEmpty()){
                    Toast.makeText(MainActivity.this,"Enter phone number!", Toast.LENGTH_LONG).show();
                }else{
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:"+mcall));
                    startActivity(callIntent);
                }

            }

        });

        Log.i("create ","create");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("start ","start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("resume ","resume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i("pause ","pause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i("stop ","stop");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("destroy ","destroy");
    }
}
