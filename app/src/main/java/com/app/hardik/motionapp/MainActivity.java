package com.app.hardik.motionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.graphics.Color;
import android.os.Bundle;

import com.app.hardik.motionapp.databinding.ActivityMainBinding;
import com.zhpan.indicator.IndicatorView;
import com.zhpan.indicator.enums.IndicatorSlideMode;
import com.zhpan.indicator.enums.IndicatorStyle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<Fragment> mFragmentArrayList = new ArrayList<>();
        mFragmentArrayList.add(new RedFragment());
        mFragmentArrayList.add(new GreenFragment());
        mFragmentArrayList.add(new BlueFragment());

        VPFAdapter vpfAdapter = new VPFAdapter(this,mFragmentArrayList);

        binding.viewPager.setAdapter(vpfAdapter);

        //======= indicator at below in side of viewpager2
        binding.indicatorView
                .setSliderColor(Color.BLACK,Color.WHITE)
                .setSliderWidth(getResources().getDimension(R.dimen.dimen_15dp))
                .setSliderHeight(getResources().getDimension(R.dimen.dimen_5dp))
                .setSlideMode(IndicatorSlideMode.WORM)
                .setIndicatorStyle(IndicatorStyle.CIRCLE)
                .setupWithViewPager(binding.viewPager);
    }
}