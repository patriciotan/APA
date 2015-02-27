package com.cs175.apa_cs175;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends ActionBarActivity {

    EditText user, pass;
    android.support.v7.app.ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.rgb(36, 99, 46)));
        setContentView(R.layout.activity_login);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void loginClick(View v){

//        Editable username = user.getText();
//        Editable password = pass.getText();
//		Toast.makeText(this, username, Toast.LENGTH_SHORT);
//        if(username.toString().equals("asdf"))
//        {
            Intent intent = new Intent(Login.this,Home.class);
            startActivity(intent);
//        }else
//        {
//            Toast t = Toast.makeText(this, "Incorrect username/password!", Toast.LENGTH_SHORT);
//            t.show();
//        }
    }

    public void registerClick(View v){
        Intent intent = new Intent(Login.this,Register.class);
        startActivity(intent);
    }
}
