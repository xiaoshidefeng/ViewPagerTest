package com.example.cw.viewpagertest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by cw on 2016/10/3.
 */

public class Fragment extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ViewGroup viewGroup=(ViewGroup) inflater.inflate(R.layout.fragment_layout,container,false);
        return  viewGroup;
    }
}
