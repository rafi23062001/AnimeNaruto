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
        viewPagerAnime=ViewPagerAnime.newInstance(this,getSupportFragmentManager(), kumpulanbookmenus);
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
        MenuAnime.add(new BookMenu.Book("Naruto Shippuden","20000","deskripsi Naruto Shippuden\n\nNaruto Shippuden adalah sebuah seri anime yang diadaptasi dari bagian II manga Naruto. Serial ini disutradarai oleh Hayato Date dan diproduksi oleh Studio Pierrot dan TV Tokyo. Pada bagian ini, pergerakan organisasi Akatsuki semakin terlihat. Naruto Shippuden juga telah dibuat versi movie-nya dengan judul Naruto Shippuden The Movie yang dirilis di Jepang pada Agustus 2007. Film ini menceritakan tentang usaha ninja jahat dalam membangkitkan Mouryou, roh jahat yang telah dikalahkan 20 tahun yang lalu. Setelah Naruto Shippuden The Movie dirilis, hadir pula Naruto Shippuden The Movie 2: Bond. Film ini menceritakan serangan kelompok ninja dari Negara Langit kepada Konoha. Kemudian Naruto Shippūden The Movie 3: Inheritors of the Will of Fire. Di sini diceritakan Konoha dituduh sebagai dalang penyebabnya para ninja dengan Kekkei Genkai menghilang dari Sunagakure, Kirigakure, Kumogakure dan Iwagakure. Di Indonesia, Naruto Shippuden sempat ditayangkan di Indosiar dan juga sempat ditayangkan di GTV. Naruto Shippuden adalah sebuah seri anime yang diadaptasi dari bagian II manga Naruto. Serial ini disutradarai oleh Hayato Date dan diproduksi oleh Studio Pierrot dan TV Tokyo. Pada bagian ini, pergerakan organisasi Akatsuki semakin terlihat. Naruto Shippuden juga telah dibuat versi movie-nya dengan judul Naruto Shippuden The Movie yang dirilis di Jepang pada Agustus 2007. Film ini menceritakan tentang usaha ninja jahat dalam membangkitkan Mouryou, roh jahat yang telah dikalahkan 20 tahun yang lalu. Setelah Naruto Shippuden The Movie dirilis, hadir pula Naruto Shippuden The Movie 2: Bond. Film ini menceritakan serangan kelompok ninja dari Negara Langit kepada Konoha. Kemudian Naruto Shippūden The Movie 3: Inheritors of the Will of Fire. Di sini diceritakan Konoha dituduh sebagai dalang penyebabnya para ninja dengan Kekkei Genkai menghilang dari Sunagakure, Kirigakure, Kumogakure dan Iwagakure. Di Indonesia, Naruto Shippuden sempat ditayangkan di Indosiar dan juga sempat ditayangkan di GTV.","judul anime","Adventure,aksi, and fantansi","0.0","Global TV"));
        MenuAnime.add(new BookMenu.Book("Black Clover","20000","deskripsi Black Clover","judulanime","Category","rating","Global TV"));
        MenuAnime.add(new BookMenu.Book("One Piece","20000","deskripsi One Piece","judulanime","Category","rating","Global TV"));

        ArrayList<BookMenu.Book> NarutoShippuden = new ArrayList<>();
        NarutoShippuden.add(new BookMenu.Book("chapter 1","25000","Sinopsis Naruto Shippuden eps 1\n\nSetelah Naruto kembali ke desa Konoha, ia disambut oleh Sakura, Hinata, Shikamaru, Chouji dan teman-teman lainnya semasa menjadi Genin, dan ternyata mereka telah menjadi Chuunin, kecuali Shikamaru yang sudah melebihi yang lainnya dengan menjadi Jounin. Kemudian Kakashi kembali menguji Naruto dan Sakura untuk mengetahui bagaimana perkembangan mereka saat ini. Ujiannya hampir sama dengan ujian ketika mereka baru saja menjadi Genin. Hanya saja kali ini Kakashi serius dan bahkan menggunakan Sharingan. Awalnya, Naruto dan Sakura kewalahan menghadapi Kakashi yang sangat kuat dan cepat, dan ditambah lagi Kakashi memakai Sharingan. Namun keadaan itu berakhir ketika Naruto berhasil melakukan sesuatu pada Kakashi dan akhirnya membuat mereka berdua lulus pada ujian itu sekali lagi","judulanime","Category","rating","Global TV"));
        NarutoShippuden.add(new BookMenu.Book("chapter 2","25000","Sinopsis Naruto Shippuden eps 2","judulanime","Category","rating","Global TV"));
        NarutoShippuden.add(new BookMenu.Book("chapter 3","25000","Sinopsis Naruto Shippuden eps 3","judulanime","Category","rating","Global TV"));

        ArrayList<BookMenu.Book> BlackClover = new ArrayList<>();
        BlackClover.add(new BookMenu.Book("chapter 1","23000","Sinopsis Black Clover eps 1","judulanime","Category","rating","Global TV"));
        BlackClover.add(new BookMenu.Book("chapter 2","23000","Sinopsis Black Clover eps 2","judulanime","Category","rating","Global TV"));
        BlackClover.add(new BookMenu.Book("chapter 3","23000","Sinopsis Black Clover eps 3","judulanime","Category","rating","Global TV"));

        ArrayList<BookMenu.Book> OnePiece = new ArrayList<>();
        OnePiece.add(new BookMenu.Book("chapter 1","25000","Sinopsis One Piece eps 1","judulanime","Category","rating","Global TV"));
        OnePiece.add(new BookMenu.Book("chapter 2","25000","Sinopsis One Piece eps 2","judulanime","Category","rating","Global TV"));
        OnePiece.add(new BookMenu.Book("chapter 3","25000","Sinopsis One Piece eps 3","judulanime","Category","rating","Global TV"));

        kumpulanbookmenus.add(new BookMenu("Anime",MenuAnime));
        kumpulanbookmenus.add(new BookMenu("ChapterAnime",NarutoShippuden,R.drawable.naruto));
        kumpulanbookmenus.add(new BookMenu("localAnime",BlackClover));
        kumpulanbookmenus.add(new BookMenu("AdvetureAnime",OnePiece));
    }
}
