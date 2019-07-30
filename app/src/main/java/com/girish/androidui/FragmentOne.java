package com.girish.androidui;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.girish.androidui.fragments.Tab1Fragment;
import com.girish.androidui.fragments.Tab2Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment  implements BottomNavigationView.OnNavigationItemSelectedListener {

    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_fragment_one, container, false);


        BottomNavigationView navigationView = view.findViewById(R.id.bottomNavigation);
        navigationView.setOnNavigationItemSelectedListener(this);

        displayFragment(new Tab1Fragment());

        return view;
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        Fragment fragment = null;

        switch (menuItem.getItemId()){
            case R.id.home_nav:
                fragment= new Tab1Fragment();
                break;
            case R.id.user_nav:
                fragment= new Tab2Fragment();
                break;
            case R.id.setting_nav:
                fragment= new Tab1Fragment();
                break;

        }
        if (fragment!= null){
            displayFragment(fragment);
        }
        return false;
    }

    private void displayFragment(Fragment fragment){

        getActivity().getSupportFragmentManager()
                .beginTransaction().replace(R.id.main_container,fragment)
                .commit();
    }
}