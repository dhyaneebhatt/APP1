package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPressed(View view)
    {
        //printing a msg that btn pressed!
        Log.d("DHYANEE","You pressed the button!!!");

//        // Get person's name
//        EditText e = (EditText)findViewById(R.id.nameTextBox);
//        String n = e.getText().toString();
//

    }
}
