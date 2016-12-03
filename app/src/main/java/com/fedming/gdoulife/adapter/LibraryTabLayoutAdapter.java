package com.fedming.gdoulife.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.fedming.gdoulife.fragment.LibraryItemHomeFragment;
import com.fedming.gdoulife.fragment.LibraryItemSearchFragment;

import java.util.List;

/**
 * LibraryTabLayoutAdapter
 * Created by Android-3 on 2016/9/11.
 */
public class LibraryTabLayoutAdapter extends FragmentPagerAdapter {

    private List<String> list;
    private LibraryItemSearchFragment libraryItemSearchFragment;
    private LibraryItemHomeFragment libraryItemHomeFragment;

    public LibraryTabLayoutAdapter(FragmentManager fragmentManager, List<String> list) {

        super(fragmentManager);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:

                if (libraryItemSearchFragment == null) {
                    libraryItemSearchFragment = LibraryItemSearchFragment.newInstance(position);
                }
                return libraryItemSearchFragment;

            case 1:

                if (libraryItemHomeFragment == null) {
                    libraryItemHomeFragment= LibraryItemHomeFragment.newInstance(position);
                }
                return libraryItemHomeFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position);
    }
}
