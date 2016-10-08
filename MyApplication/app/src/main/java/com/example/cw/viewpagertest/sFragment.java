package com.example.cw.viewpagertest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by cw on 2016/10/3.
 */

class sFragment extends android.support.v4.app.Fragment {

    public static final String ARG_PAGE = "page";

    private int mPageNumber;

    public static sFragment creat(int pagenumber){
        sFragment fragment = new sFragment();
        Bundle args = new Bundle();         //Bundle 相当于一个map 来存放一个key-value
        args.putInt(ARG_PAGE,pagenumber);
        fragment.setArguments(args);

        return fragment;
    }

    public void onCreat(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        mPageNumber = getArguments().getInt(ARG_PAGE);

    }


    public sFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ViewGroup viewGroup=(ViewGroup) inflater.inflate(R.layout.fragment_layout,container,false);
        return  viewGroup;
    }
}
