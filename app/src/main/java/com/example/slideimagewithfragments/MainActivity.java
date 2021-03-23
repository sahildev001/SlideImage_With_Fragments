package com.example.slideimagewithfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.slideimagewithfragments.Adapter.Adapter;
import com.google.android.material.tabs.TabLayout;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {
  ViewPager viewPager;

    TabLayout tabLayout;
    TextView page;
    Adapter adapter;

//satguru 30
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        tabLayout= findViewById(R.id.tabDots);

      tabLayout =  findViewById(R.id.tabDots);
        tabLayout.setupWithViewPager(viewPager, true);

        page = findViewById(R.id.PageNo);
    //   page = toolbar.findViewById(R.id.PageNo);
     //  page.setText("s");
        adapter = new Adapter((getSupportFragmentManager()));

        viewPager.setAdapter(adapter);
        page.setText(String.valueOf(1)+"/"+String.valueOf(adapter.getCount()));



        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {


            }

            @Override
            public void onPageSelected(int position) {




                page.setText(String.valueOf(position+1)+"/"+String.valueOf(adapter.getCount()));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

//
    }
}