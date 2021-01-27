package com.example.android.androidbasics_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        Intent intent = getIntent();

        String value1 = intent.getStringExtra("value1");
        String value2 = intent.getStringExtra("value2");

        TextView text1 = findViewById(R.id.textView1);
        TextView text2 = findViewById(R.id.textView2);

        text1.setText(value1);
        text2.setText(value2);
    }
}