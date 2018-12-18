package com.shashwat.hackfest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);



    }

    public void onClickpatalpuri(View view){
        Intent i=new Intent(this,patalpuri.class);
        startActivity(i);

    }
    public void onClickswaraj(View view){
        Intent i=new Intent(this,swaraj.class);
        startActivity(i);

    }
    public void onClickmankameshwar(View view){
        Intent i=new Intent(this,mankameshwar.class);
        startActivity(i);

    }
    public void onClickminto(View view){
        Intent i=new Intent(this,minto.class);
        startActivity(i);

    }
    public void onClickshankar(View view){
        Intent i=new Intent(this,shankar.class);
        startActivity(i);
    }
    public void onClickjawahar(View view){
        Intent i=new Intent(this,jawahar.class);
        startActivity(i);
    }
    public void onClickhanuman(View view){
        Intent i=new Intent(this,hanuman.class);
        startActivity(i);
    }
    public void onClickfort(View view){
        Intent i=new Intent(this,fort.class);
        startActivity(i);
    }
    public void onClicksangam(View view){
        Intent i=new Intent(this,sangam.class);
        startActivity(i);
    }

}
