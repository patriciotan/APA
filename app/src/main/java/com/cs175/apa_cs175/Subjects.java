package com.cs175.apa_cs175;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;
import android.view.*;
import android.widget.ListView;


public class Subjects extends ListActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Resources res = getResources();
        int[] image = {R.drawable.it_sub,R.drawable.m_sub,R.drawable.pe_sub};
        String[] name = res.getStringArray(R.array.name);
        String[] desc = res.getStringArray(R.array.desc);

        SubjectAdapter adapter = new SubjectAdapter(this,name,image,desc);
        setListAdapter(adapter);

        ListView list = getListView();
        list.setOnItemClickListener(new OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


                TextView title = (TextView) view.findViewById(R.id.name);
                TextView desc = (TextView) view.findViewById(R.id.desc);
                ImageView img = (ImageView) view.findViewById(R.id.image);

                String s = title.getText().toString();
                String d = desc.getText().toString();





                Intent intent = new Intent(getApplicationContext(), SubjectView.class);

                intent.putExtra("title",s);
                intent.putExtra("desc",d);
                intent.putExtra("image",position);
                startActivity(intent);

            }
        });
    }

}


