package com.example.fragmentrecyclerviewapp;

/*
*Created by qendev on 23/05/2019.
 */

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> lstFragent=new ArrayList<>();
    private final List<String> lstTitles= new ArrayList<>();



    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return lstFragent.get(i);
    }

    @Override
    public int getCount() {
        return lstTitles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return lstTitles.get(position);
    }


    public void AddFragment(Fragment fragment,String title){

       lstFragent.add(fragment);
       lstTitles.add(title);

    }
















}
