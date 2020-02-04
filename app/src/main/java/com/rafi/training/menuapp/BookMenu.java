package com.rafi.training.menuapp;

import java.util.ArrayList;

public class BookMenu {
    private String menutitle;
    private ArrayList<Book> data;

    static class Book{
        private String namaBuku;
        private String hargaBuku;

        public Book(String namaBuku, String hargaBuku){
            this.namaBuku = namaBuku;
            this.hargaBuku = hargaBuku;
        }

        public String getNamaBuku() {
            return namaBuku;
        }

        public String getHargaBuku() {
            return hargaBuku;
        }
    }


    public BookMenu(String menutitle, ArrayList<Book> data){
        this.menutitle=menutitle;
        this.data= data;
    }

    public String getMenutitle() {
        return menutitle;
    }

    public ArrayList<Book> getData() {
        return data;
    }
}
