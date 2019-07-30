package com.girish.androidui;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    private long backPressedTime;  // for Back Key

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("My App");

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new FragmentOne()).commit();
            navigationView.setCheckedItem(R.id.nav_admin);
            getSupportActionBar().setTitle("Admin");
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        NavigationView nv= (NavigationView) findViewById(R.id.nav_view);
        Menu m=nv.getMenu();
        switch (item.getItemId()) {
            case R.id.nav_admin:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FragmentOne()).commit();
                getSupportActionBar().setTitle("Admin");

                break;
            case R.id.nav_teacher:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FragmentOne()).commit();
                getSupportActionBar().setTitle("Teacher");

                break;
            case R.id.nav_child:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FragmentOne()).commit();
                getSupportActionBar().setTitle("Child");

                break;

            case R.id.nav_assesment:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FragmentOne()).commit();
                getSupportActionBar().setTitle("Assesment");

                break;
            case R.id.nav_batch:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FragmentOne()).commit();
                getSupportActionBar().setTitle("Batch");

                break;
            case R.id.nav_hire_teachers:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FragmentOne()).commit();
                getSupportActionBar().setTitle("Hire Teacher");

                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;

    }


    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {

        }

        if (backPressedTime + 2000> System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }else {
            Toast.makeText(MainActivity.this,"Press Again To Exit ",Toast.LENGTH_SHORT).show();
        }
        backPressedTime = System.currentTimeMillis();
    }

}

