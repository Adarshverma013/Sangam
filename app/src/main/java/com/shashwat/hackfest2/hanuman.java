package com.shashwat.hackfest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class hanuman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hanuman);
        TextView ew = (TextView)findViewById(R.id.textView5);
        ew.setText(Html.fromHtml(getString(R.string.hanuman)));
    }
}
