package com.example.slideimagewithfragments.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.slideimagewithfragments.Fone;
import com.example.slideimagewithfragments.Fthree;
import com.example.slideimagewithfragments.Ftwo;
import com.example.slideimagewithfragments.R;

public class Adapter extends FragmentPagerAdapter {

    private int [] images = {R.drawable.slide1,R.drawable.slide2, R.drawable.slide3};

    public Adapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public Adapter(@NonNull FragmentManager fm, int behavior) {

        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
               return new  Fone();
            case 1:
                return  new Ftwo();
            case 2:
                return new Fthree();
            default:
                return new Fone();
        }

    }




    @Override
    public int getCount() {
        return 3;
    }
}
