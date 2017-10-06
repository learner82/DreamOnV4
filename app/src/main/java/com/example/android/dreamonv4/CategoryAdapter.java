package com.example.android.dreamonv4;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

/**
 * Created by learner on 1/10/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter implements ListAdapter {

    private final Context mContext;

    CategoryAdapter (Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position){
        if (position == 0){
            return new WhoWeAreFragment();
        } else if (position ==1){
            return new PortfolioListFragmant();
        }
        return null;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getCount(){
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return mContext.getString(R.string.who_tab_name);
            case 1:
                return mContext.getString(R.string.portfolio);
        }
        return null;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }
}
