package com.cs175.apa_cs175;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SubjectView extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_view);
        int[] image = {R.drawable.it_sub,R.drawable.m_sub,R.drawable.pe_sub};
        TextView titles = (TextView) findViewById(R.id.subjTitle);
        TextView descs = (TextView) findViewById(R.id.subjDesc);
        ImageView imgs = (ImageView) findViewById(R.id.subjImage);

        Bundle extras = getIntent().getExtras();
        Intent i = getIntent();

        String title = i.getStringExtra("title");
        String desc = i.getStringExtra("desc");
        int pos = i.getIntExtra("image", 0);


        titles.setText(title);
        descs.setText(desc);
        imgs.setImageResource(image[pos]);

    }

    public void gradingClick(View v){
        Intent intent = new Intent(this,GradingSystem.class);
        startActivity(intent);
    }

    public void itemsClick(View v){
        Intent intent = new Intent(this,SubjectItems.class);
        startActivity(intent);
    }
}
