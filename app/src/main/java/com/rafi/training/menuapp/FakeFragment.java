package com.rafi.training.menuapp;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FakeFragment extends Fragment {

    private ListView listView;
    private ListviewAnimeAdapter adapter;
    public static ArrayList<BookMenu.Book> bookMenuArrayList;

    public static FakeFragment newInstance(int pos,String Text){
        FakeFragment fakeFragment = new FakeFragment();
        Bundle args = new Bundle();
        args.putInt("position", pos);
        args.putString("Text", Text);
        fakeFragment.setArguments(args);
        return fakeFragment;
    }

    public FakeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview=inflater.inflate(R.layout.fragment_fake, container, false);
        adapter =new ListviewAnimeAdapter(getContext(),bookMenuArrayList);
        listView=rootview.findViewById(R.id.lv_rumah);
        listView.setAdapter(adapter);
        return rootview;
    }

    public static FakeFragment newInstance(ArrayList<BookMenu.Book> bukuanimeku){
        FakeFragment fakeFragment = new FakeFragment();
        bookMenuArrayList = bukuanimeku;
        return fakeFragment;
    }
}
