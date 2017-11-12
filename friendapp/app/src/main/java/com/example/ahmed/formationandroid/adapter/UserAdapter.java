package com.example.ahmed.formationandroid.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ahmed.formationandroid.R;
import com.example.ahmed.formationandroid.java.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmed on 10/11/2017.
 */

public class UserAdapter extends ArrayAdapter<User> {

    Context context;
    int resource ;
    public UserAdapter(@NonNull Context context, int resource, @NonNull ArrayList<User> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
    }

    @Override
    public  View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        convertView = LayoutInflater.from(context).inflate(resource, parent, false); // false 5ater mehouch mawjoud fel lit view men 9bal .a7na bech nasen3ouh

        TextView tvName = (TextView) convertView.findViewById(R.id.TvName);
        TextView tvInfo = (TextView) convertView.findViewById(R.id.tvInfo);
        TextView textView = (TextView) convertView.findViewById(R.id.TvName);
        ImageView image = (ImageView) convertView.findViewById(R.id.UserImg);
        User user = getItem(position);

        //n7ot kol chay fi blastou

        tvName.setText(user.getName()+" "+user.getLastName());
        tvInfo.setText(""+user.getPhoneNumber());
        image.setImageResource(user.getImage());
        //nraj3 el convert view eli 3abitou :)
        return convertView;
    }
}
