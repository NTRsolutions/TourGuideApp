package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by anu on 5/6/17.
 */

public class SampleFragmentPageAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private Context mcontext;

    public SampleFragmentPageAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.mcontext = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AttractionFragment();
            case 1:
                return new DineFragment();
            case 2:
                return new ShoppingFragment();
            case 3:
                return new NightlifeFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        //return tabTitles[position];
        switch (position) {
            case 0:
                return mcontext.getString(R.string.Tab1);
            case 1:
                return mcontext.getString(R.string.Tab2);
            case 2:
                return mcontext.getString(R.string.Tab3);
            case 3:
                return mcontext.getString(R.string.Tab4);
            default:
                return null;
        }
    }
}

