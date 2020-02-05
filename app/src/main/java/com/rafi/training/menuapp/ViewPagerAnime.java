package com.rafi.training.menuapp;

import android.content.Context;
import android.widget.ListView;
import android.widget.Toast;

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
    private static Context ctx;

    public  static ViewPagerAnime newInstance(FragmentManager fragmentManager, ArrayList title,ArrayList data){
        ViewPagerAnime viewPagerAnime=new ViewPagerAnime(fragmentManager);
        myTitleku= title;
        myDataku=data;
        numOfItemku=data.size();
        return viewPagerAnime;
    }

    public  static ViewPagerAnime newInstance(Context context, FragmentManager fragmentManager, ArrayList<BookMenu> data){
        ViewPagerAnime viewPagerAnime = new ViewPagerAnime(fragmentManager);
        ctx = context;
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
        Integer img = myBookMenuku.get(position).getImage();

        //fakeFragment1 = FakeFragment.newInstance( myBookMenuku.get(position).getData());
        fakeFragment1 = new FakeFragment();
        if(img != 0){
            fakeFragment1.setData(myBookMenuku.get(position).getData(),img);
        }
        else{
            fakeFragment1.setData(myBookMenuku.get(position).getData());
        }

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
