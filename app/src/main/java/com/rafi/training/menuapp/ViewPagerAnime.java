package com.rafi.training.menuapp;

import android.widget.ListView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAnime extends FragmentStatePagerAdapter {
    private static ArrayList<String> myTitleku;
    private static ArrayList<String> myDataku;
    private static ArrayList<BookMenu> myBookMenuku;
    private static ArrayList<BookMenu.Book> bookArrayList;
    private static int numOfItemku=0;

    public  static ViewPagerAnime newInstance(FragmentManager fragmentManager, ArrayList title,ArrayList data){
        ViewPagerAnime viewPagerAnime=new ViewPagerAnime(fragmentManager);
        myTitleku= title;
        myDataku=data;
        numOfItemku=data.size();
        return viewPagerAnime;
    }

    public  static ViewPagerAnime newInstance(FragmentManager fragmentManager, ArrayList<BookMenu> data){
        ViewPagerAnime viewPagerAnime = new ViewPagerAnime(fragmentManager);
        myBookMenuku = data;
        numOfItemku=data.size();
        return viewPagerAnime;
    }
    public ViewPagerAnime(FragmentManager fragmentManager){
        super(fragmentManager);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        FakeFragment fakeFragment1 = null;
        fakeFragment1 = FakeFragment.newInstance( myBookMenuku.get(position).getData());

        return fakeFragment1;
    }

    @Override
    public int getCount() {
        return numOfItemku;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        try{
            title = myBookMenuku.get(position).getMenutitle();
        }
        catch (IndexOutOfBoundsException e){
            title = "Bacot";
        }
        return title;
    }
}
