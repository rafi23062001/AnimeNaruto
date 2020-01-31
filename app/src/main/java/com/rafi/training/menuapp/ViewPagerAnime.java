package com.rafi.training.menuapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAnime extends FragmentStatePagerAdapter {
    public ViewPagerAnime(FragmentManager fragmentManager){
        super(fragmentManager,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        FakeFragment fakeFragment= new FakeFragment();
        NarutoFragment narutoFragment = new NarutoFragment();

        Fragment itemku = null;
        switch (position){
            case 0:
                itemku = fakeFragment;
                break;
            case 1:
                itemku = fakeFragment;
                break;
                default:
                    itemku=narutoFragment;
                    break;
        }
        return itemku;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        switch (position){
            case 0:
                title="Anime";
                break;
            case 1:
                title="Episode";
                break;
            case 2:
                title= "Sinopsis";
                break;
             default:
                 title=null;
                 break;
        }
        return title;
    }
}
