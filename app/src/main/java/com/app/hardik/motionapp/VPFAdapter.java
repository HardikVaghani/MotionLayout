package com.app.hardik.motionapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class VPFAdapter extends FragmentStateAdapter {
    ArrayList<Fragment> mFragmentArrayList;


    public VPFAdapter(FragmentActivity fragmentActivity, ArrayList<Fragment> mFragmentArrayList) {
        super(fragmentActivity);
        this.mFragmentArrayList = mFragmentArrayList;
    }

    public Fragment createFragment(int position)
    {
        return mFragmentArrayList.get(position);
    }

    @Override
    public int getItemCount() {
        return mFragmentArrayList.size();
    }
}
