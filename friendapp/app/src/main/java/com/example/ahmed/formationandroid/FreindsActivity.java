package com.example.ahmed.formationandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.ahmed.formationandroid.adapter.UserAdapter;
import com.example.ahmed.formationandroid.java.User;

import java.util.ArrayList;

public class FreindsActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freinds);
        listView = (ListView) findViewById(R.id.listUsers) ;
        ArrayList<User> values = new ArrayList<>();
        values.add(new User("teraoui","Ahmed",29114000, R.drawable.ic_launcher_background));
        values.add(new User("mouhamed","ali",50225258, R.drawable.ic_launcher_background));
        values.add(new User("zaineb","zalleg",2358334, R.drawable.ic_launcher_background));
        values.add(new User("camilia","meimri",2922000,R.drawable.ic_launcher_background));
        values.add(new User("abdel","monem",22588,R.drawable.ic_launcher_background));
        values.add(new User("fourat","naffousi",50125698,R.drawable.ic_launcher_background));

        UserAdapter adapter = new UserAdapter(FreindsActivity.this, R.layout.user_item,values);
        listView.setAdapter(adapter);


        //simple listview code
/*
        listView = (ListView) findViewById(R.id.listUsers);

        ArrayList<String> users = new ArrayList<String>();

        users.add("ahmed");
        users.add("dali");
        users.add("ali");
        users.add("salah");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,users);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String aa = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this,aa,Toast.LENGTH_SHORT).show();
            }
        });*/

    }
}
