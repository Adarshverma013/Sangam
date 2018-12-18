package com.shashwat.hackfest2;

import android.app.FragmentManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.website) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kumbh.gov.in/en"));
            startActivity(browserIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fragmentManager = getFragmentManager();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (id == R.id.home) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new firstFrag()).commit();
            // Handle the camera action
        } else if (id == R.id.police_stations) {
            /*if(getSupportFragmentManager().findFragmentById(R.id.content_frame) != null) {
                getSupportFragmentManager()
                        .beginTransaction().
                        remove(getSupportFragmentManager().findFragmentById(R.id.content_frame)).commit();
            }
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, new BlankFragment())
                    .commit();*/
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/maps/search/police+stations+near+me"));
            startActivity(browserIntent);

        } else if (id == R.id.hospitals) {

            /*if(getSupportFragmentManager().findFragmentById(R.id.content_frame) != null) {
                getSupportFragmentManager()
                        .beginTransaction().
                        remove(getSupportFragmentManager().findFragmentById(R.id.content_frame)).commit();
            }
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, new BlankFragment())
                    .commit();*/
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/?api=1&query=hospitals+near+my+location"));
            startActivity(browserIntent);
        } else if (id == R.id.places) {
            Intent i=new Intent(this,places.class);
            startActivity(i);
            /*if(getSupportFragmentManager().findFragmentById(R.id.content_frame) != null) {
                getSupportFragmentManager()
                        .beginTransaction().
                        remove(getSupportFragmentManager().findFragmentById(R.id.content_frame)).commit();
            }
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, new BlankFragment())
                    .commit();*/

        } else if (id == R.id.account) {

            fragmentManager.beginTransaction().replace(R.id.content_frame, new profileFrag()).commit();
            /*Intent i=new Intent(this,Bacon.class);
            final EditText AppleInput=(EditText) findViewById(R.id.AppleInput);
            String userMessage= AppleInput.getText().toString();
            startActivity(i);*/
        }else if (id == R.id.nav_share) {

            /*if(getSupportFragmentManager().findFragmentById(R.id.content_frame) != null) {
                getSupportFragmentManager()
                        .beginTransaction().
                        remove(getSupportFragmentManager().findFragmentById(R.id.content_frame)).commit();
            }
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, new BlankFragment())
                    .commit();
            fragmentManager.beginTransaction().replace(R.id.content_frame, null).commit();*/
            Intent i = new Intent(android.content.Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(android.content.Intent.EXTRA_TEXT, "My new app https://www.youtube.com");
            startActivity(Intent.createChooser(i, "Share Via"));
        }else if(id == R.id.ChatRoom)
        {
            Intent i = new Intent(this,ChatRoom.class);
            startActivity(i);
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void launchSOS(View view)
    {
        Intent i=new Intent(this,SOSBut.class);
        startActivity(i);

    }
}
