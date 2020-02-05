package com.rafi.training.menuapp;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FakeFragment extends Fragment {

    private ListView listView;
    private ListviewAnimeAdapter adapter;
    public ArrayList<BookMenu.Book> bookMenuArrayList;
    private ImageView img;
    private Integer imageData = 0;

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

    public void lvClick(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), DeskripsiActivity.class);
                intent.putExtra("anime", adapter.getItem(position));
                startActivity(intent);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview=inflater.inflate(R.layout.fragment_fake, container, false);
        img = rootview.findViewById(R.id.iv_img);
        if(imageData != 0){
            img.setImageResource(imageData);
        }else{
            img.setImageResource(R.drawable.ns);
        }
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),String.valueOf(imageData),Toast.LENGTH_SHORT).show();
            }
        });
        adapter =new ListviewAnimeAdapter(getContext(),bookMenuArrayList);
        listView=rootview.findViewById(R.id.lv_rumah);
        listView.setAdapter(adapter);
        lvClick();
        return rootview;
    }

    public static FakeFragment newInstance(ArrayList<BookMenu.Book> bukuanimeku){
        FakeFragment fakeFragment = new FakeFragment();
        //bookMenuArrayList = bukuanimeku;
        return fakeFragment;
    }

    public void setData(ArrayList<BookMenu.Book> data){
        bookMenuArrayList = data;
    }
    public void setData(ArrayList<BookMenu.Book> data, Integer img){
        bookMenuArrayList = data;
        imageData = img;
    }
}
