package com.rafi.training.menuapp;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class BookMenu {
    private String menutitle;
    private ArrayList<Book> data;
    private int image;

    public Integer getImage() {
        return image;
    }

    static class Book implements Parcelable {
        private String namaBuku;
        private String hargaBuku;
        private String judulanime;

        public String getJudulanime() {
            return judulanime;
        }

        public String getCategory() {
            return category;
        }

        public String getRating() {
            return rating;
        }

        public String getStudio() {
            return studio;
        }

        private String category;
        private String rating;
        private String studio;
        private String deskripsiNaruto;
        private Integer image;


        public Book(String namaBuku, String hargaBuku, String deskripsiNaruto, String judulanime, String category,String rating,String studio){
            this.namaBuku = namaBuku;
            this.hargaBuku = hargaBuku;
            this.deskripsiNaruto = deskripsiNaruto;
            this.judulanime=judulanime;
            this.category=category;
            this.rating=rating;
            this.studio=studio;
        }



        public String getDeskripsiNaruto() {
            return deskripsiNaruto;
        }

        public String getNamaBuku() {
            return namaBuku;
        }

        public String getHargaBuku() {
            return hargaBuku;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(namaBuku);
            dest.writeString(hargaBuku);
            dest.writeString(deskripsiNaruto);
            dest.writeString(judulanime);
            dest.writeString(category);
            dest.writeString(rating);
            dest.writeString(studio);
        }

        protected Book(Parcel in){
            this.namaBuku = in.readString();
            this.hargaBuku = in.readString();
            this.deskripsiNaruto = in.readString();
            this.judulanime=in.readString();
            this.category=in.readString();
            this.rating=in.readString();
            this.studio=in.readString();
        }

        public  static final Parcelable.Creator<Book> CREATOR = new Parcelable.Creator<Book>(){

            @Override
            public Book createFromParcel(Parcel source) {
                return new Book(source);
            }

            @Override
            public Book[] newArray(int size) {
                return new Book[size];
            }
        };
    }


    public BookMenu(String menutitle, ArrayList<Book> data){
        this.menutitle=menutitle;
        this.data= data;
    }
    public BookMenu(String menutitle, ArrayList<Book> data, int img){
        this.menutitle=menutitle;
        this.data= data;
        this.image = img;
    }

    public String getMenutitle() {
        return menutitle;
    }

    public ArrayList<Book> getData() {
        return data;
    }
}
