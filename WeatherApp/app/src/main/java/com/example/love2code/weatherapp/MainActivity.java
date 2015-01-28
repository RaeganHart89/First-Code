package com.example.love2code.weatherapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = (Button) findViewById(R.id.btnOne);


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello Sunshine", Toast.LENGTH_SHORT).show();
            }
        });


        btnTwo = (Button) findViewById(R.id.btnTwo);


        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello Storm", Toast.LENGTH_SHORT).show();
            }
        });


        btnThree = (Button) findViewById(R.id.btnThree);


        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello Rain", Toast.LENGTH_SHORT).show();
            }
        });
    } //end oncreate

    @Override
    protected void onDestroy() {
        super.onDestroy();
    } //end on destroy




}//end activity

