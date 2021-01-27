package com.example.android.androidbasics_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyOnClickListener myListener = new MyOnClickListener();

        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);

        button4.setOnClickListener(myListener);
        button5.setOnClickListener(myListener);
    }

    public void openActivity2(View v) {
        Intent i = new Intent(this, Activity2.class);
        i.putExtra("value1", "Value for Text1");
        i.putExtra("value2", "Value for text2");

        startActivity(i);
    }

    public void startWeb(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.vogella.com/"));
        startActivity(intent);
    }

    public void startMap(View v) {
        String geoLocation = "geo:47.6,-122.3?z=11";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(geoLocation));
        startActivity(intent);
    }
}
