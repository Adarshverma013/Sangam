package com.shashwat.hackfest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class jawahar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawahar);
        TextView ew = (TextView)findViewById(R.id.textView4);
        ew.setText(Html.fromHtml(getString(R.string.jawahar)));
    }
}
