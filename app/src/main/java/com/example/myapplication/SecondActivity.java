package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // create the outlet for the label
        TextView t = (TextView) findViewById(R.id.helloLabel);

        Intent i = getIntent();
        String u = i.getStringExtra("username");
        String m = i.getStringExtra("message");

        Log.d("DHYANEE", u);
        Log.d("DHYANEE", m);

        // put name in the texview
        t.setText(u);
    }

    public void goBackPressed(View view)
    {
        //printing a msg that btn pressed!
        Log.d("DHYANEE","You pressed the Go Back button!!!");

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
