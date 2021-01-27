package com.example.android.androidbasics_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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

    public void startWeb(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.vogella.com/"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void startMap(View v) {

        String geoLocation = "geo:47.6,-122.3?z=11";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(geoLocation));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
