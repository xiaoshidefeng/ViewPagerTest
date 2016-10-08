package com.example.cw.viewpagertest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {

    private ViewPager mViewPager;

    private PagerAdapter mPagerAdapter;

    //页数
    private int NUM_PAGE = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager=(ViewPager)findViewById(R.id.pager);
        mPagerAdapter= new sFragmentPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mPagerAdapter);


    }
    private class sFragmentPagerAdapter extends FragmentStatePagerAdapter{
        public sFragmentPagerAdapter(FragmentManager fm){
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return sFragment.creat(position);
        }

        @Override
        public int getCount() {
            return NUM_PAGE;
        }
    }
}
