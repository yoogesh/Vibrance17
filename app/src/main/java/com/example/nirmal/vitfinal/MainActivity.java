package com.example.nirmal.vitfinal;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
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
import android.widget.Toast;
import android.app.Fragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    android.support.v4.app.FragmentManager fmm=getSupportFragmentManager();
    Toolbar toolbar;
    FragmentManager fm ;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        main_fragment myFragment = new main_fragment();
        fm = getFragmentManager();

        ft = fm.beginTransaction();
        ft.replace(R.id.content_main,myFragment).commit();

    }
    public void setActionBarTitle(String title){
        toolbar.setTitle(title);
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } /*else {
            super.onBackPressed();
        }*/
        FragmentManager fm = getFragmentManager();
        Fragment frag = fm.findFragmentById(R.id.content_main);
        if(frag instanceof football){
            Toast.makeText(getApplicationContext(),"Pressed from Football",Toast.LENGTH_SHORT).show();
           // ft.replace(R.id.content_main,new Events_list()).commit();
            //If this code works repeat this for all the fragment names with the if statement
            // Eg : if(frag instanceof Musicclub)
            //           go to events page
            //else copy paste the below code..That will take you to the main page
        }
        //Takes you to the main page so copy paste this whenever needed
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.content_main,new main_fragment()).commit();
        (MainActivity.this).setActionBarTitle("Adaptune");
       // Toast.makeText(getApplicationContext(),"Back is pressed", Toast.LENGTH_SHORT).show();
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentTransaction ft2 = fm.beginTransaction();
        switch (id){
            case R.id.nav_eve:
                Events_list myFrag = new Events_list();
                ft2.replace(R.id.content_main,myFrag).commit();
                break;
            case R.id.nav_sche:
                android.support.v4.app.FragmentTransaction ft4=fmm.beginTransaction();
                Tabmain myFragg3 = new Tabmain();
                ft4.replace(R.id.content_main,myFragg3).commit();
                break;


            case R.id.nav_map:
                mapp myFragg = new mapp();
                ft2.replace(R.id.content_main,myFragg).commit();
                break;

            case R.id.nav_proshow:
                proshow myFrag1 = new proshow();
                ft2.replace(R.id.content_main,myFrag1).commit();
                break;




            case R.id.nav_about:
                Aboutus myFragg4 = new Aboutus();
                ft2.replace(R.id.content_main,myFragg4).commit();
                break;

            case R.id.nav_contact:
                Contact myFragg5 = new Contact();
                ft2.replace(R.id.content_main,myFragg5).commit();
                break;


        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
 }
