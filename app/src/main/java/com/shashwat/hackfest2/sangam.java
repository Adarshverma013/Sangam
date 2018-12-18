package com.shashwat.hackfest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class sangam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sangam);
        TextView ew = (TextView)findViewById(R.id.textView2);
        ew.setText(Html.fromHtml(getString(R.string.sangam)));
    }
}
