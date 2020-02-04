package com.rafi.training.menuapp;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class ListviewAnimeAdapter extends BaseAdapter {

    private Context animemanga;
    private ArrayList<BookMenu.Book> itemanime;

    public ListviewAnimeAdapter(Context animemanga, ArrayList<BookMenu.Book> itemanime){
        this.animemanga = animemanga;
        this.itemanime=itemanime;
    }

    @Override
    public int getCount() {
        return itemanime.size();
    }

    @Override
    public Object getItem(int position) {
        return itemanime.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(animemanga).inflate(R.layout.layout_list_view_book,parent,false);
        }
        BookMenu.Book currentanimemanga = (BookMenu.Book) getItem(position);
        TextView textViewnamaBuku = convertView.findViewById(R.id.tv_title);
        TextView textViewhargabuku=convertView.findViewById(R.id.tv_price);

        textViewnamaBuku.setText(currentanimemanga.getNamaBuku());
        textViewhargabuku.setText(currentanimemanga.getHargaBuku());
        return convertView;
    }
}
