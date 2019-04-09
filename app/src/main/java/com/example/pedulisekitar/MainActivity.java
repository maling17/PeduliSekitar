package com.example.pedulisekitar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setIcon(R.drawable.search);
        TextView toolbarText = (TextView) findViewById(R.id.toolbar_text);

        if (toolbarText != null && toolbar != null) {
            toolbarText.setText(getTitle());
            setSupportActionBar(toolbar);
        }
    }


}
