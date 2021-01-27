package com.example.android.androidbasics_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivity2(View v) {
        Intent i = new Intent(this, Activity2.class);
        i.putExtra("value1", "Value for Text1");
        i.putExtra("value2", "Value for text2");

        startActivity(i);
    }
}