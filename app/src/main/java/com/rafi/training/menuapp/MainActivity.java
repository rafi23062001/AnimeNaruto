package com.rafi.training.menuapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager vpku;
    private ViewPagerAnime viewPagerAnime;
    private TabLayout tabfake;
    private ArrayList<String> titleme, datame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vpku=findViewById(R.id.vp_fake);
        titleme=new ArrayList<>();
        datame=new ArrayList<>();
        genereteData();
        genereteTitle();
        viewPagerAnime=ViewPagerAnime.newInstance(getSupportFragmentManager(),titleme,datame);
        tabfake=findViewById(R.id.tab_fake);
        vpku.setAdapter(viewPagerAnime);
        tabfake.setupWithViewPager(vpku);
    }

    private void genereteData(){
        datame.add("Data 1");
        datame.add("Data 2");
        datame.add("Data 3");
        datame.add("Data 4");
        datame.add("Data 5");
    }

    private void genereteTitle(){
        titleme.add("Home");
        titleme.add("Favorite");
        titleme.add("Genre");
        titleme.add("episode");
        titleme.add("anime");
    }
}
