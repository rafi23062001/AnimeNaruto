package com.rafi.training.menuapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager vpku;
    private ViewPagerAnime viewPagerAnime;
    private TabLayout tabfake;
    private ArrayList<String> titleme, datame;

    ArrayList<BookMenu> kumpulanbookmenus =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vpku=findViewById(R.id.vp_fake);
        titleme=new ArrayList<>();
        datame=new ArrayList<>();
        generateMenu();
        genereteData();
        genereteTitle();
        viewPagerAnime=ViewPagerAnime.newInstance(getSupportFragmentManager(), kumpulanbookmenus);
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

    private void generateMenu(){
        ArrayList<BookMenu.Book> MenuAnime = new ArrayList<>();
        MenuAnime.add(new BookMenu.Book("Naruto Shippuden","20000"));
        MenuAnime.add(new BookMenu.Book("Black Clover","20000"));
        MenuAnime.add(new BookMenu.Book("One Piece","20000"));

        ArrayList<BookMenu.Book> NarutoShippuden = new ArrayList<>();
        NarutoShippuden.add(new BookMenu.Book("chapter 1","25000"));
        NarutoShippuden.add(new BookMenu.Book("chapter 2","25000"));
        NarutoShippuden.add(new BookMenu.Book("chapter 3","25000"));

        ArrayList<BookMenu.Book> BlackClover = new ArrayList<>();
        BlackClover.add(new BookMenu.Book("chapter 1","23000"));
        BlackClover.add(new BookMenu.Book("chapter 2","23000"));
        BlackClover.add(new BookMenu.Book("chapter 3","23000"));

        ArrayList<BookMenu.Book> OnePiece = new ArrayList<>();
        OnePiece.add(new BookMenu.Book("chapter 1","25000"));
        OnePiece.add(new BookMenu.Book("chapter 2","25000"));
        OnePiece.add(new BookMenu.Book("chapter 3","25000"));

        kumpulanbookmenus.add(new BookMenu("Anime",MenuAnime));
        kumpulanbookmenus.add(new BookMenu("ChapterAnime",NarutoShippuden));
        kumpulanbookmenus.add(new BookMenu("localAnime",BlackClover));
        kumpulanbookmenus.add(new BookMenu("AdventureAnime",OnePiece));
    }
}
