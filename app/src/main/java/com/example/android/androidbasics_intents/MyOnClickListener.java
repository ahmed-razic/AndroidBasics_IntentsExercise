package com.example.android.androidbasics_intents;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MyOnClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        TextView myView = (TextView) v;
        Toast.makeText(v.getContext(), "Clicked view " + myView.getText(), Toast.LENGTH_LONG).show();
    }
}
