package com.girish.androidui.adpters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.girish.androidui.fragments.Tab1Fragment;

public class MyAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public MyAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Tab1Fragment homeFragment = new Tab1Fragment();
                return homeFragment;
            case 1:
                Tab1Fragment sportFragment = new Tab1Fragment();
                return sportFragment;
            case 2:
                Tab1Fragment movieFragment = new Tab1Fragment();
                return movieFragment;
            case 3:
                Tab1Fragment sportFragment1 = new Tab1Fragment();
                return sportFragment1;
            case 4:
                Tab1Fragment sportFragment2 = new Tab1Fragment();
                return sportFragment2;
            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}