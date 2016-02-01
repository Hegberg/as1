package com.hello.hegberg.hegberg_fueltrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize buttons
        Button logEntries = (Button) findViewById(R.id.LogEntries);
        Button addEntry = (Button) findViewById(R.id.AddEntry);

        //when view/edit entries clicked go to choose entry
        logEntries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ChooseEntry.class));
            }
        });

        //when add entry clicked go to add entry
        addEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AddEntry.class));
            }
        });
    }
}