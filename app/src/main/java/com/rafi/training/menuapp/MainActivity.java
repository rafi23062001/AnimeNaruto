package com.rafi.training.menuapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private ViewPager vpku;
    private ViewPagerAnime viewPagerAnime;
    private TabLayout tabfake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vpku=findViewById(R.id.vp_fake);
        viewPagerAnime=new ViewPagerAnime((getSupportFragmentManager()));
        tabfake=findViewById(R.id.tab_fake);
        vpku.setAdapter(viewPagerAnime);
        tabfake.setupWithViewPager(vpku);
    }
}
