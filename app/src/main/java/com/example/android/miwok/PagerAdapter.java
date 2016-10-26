package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by nexus on 25.10.2016.
 */
public class PagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "Tab1", "Tab2", "Tab3", "Tab4" };

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ColorsFragment();
        } else if (position == 1) {
            return new FamilyFragment();
        }
            else if (position == 2){
            return new NumbersFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

}
