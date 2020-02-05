package com.rafi.training.menuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DeskripsiActivity extends AppCompatActivity {

    TextView anime,animenaruto,animesasuke,judulanime,studionaruto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);

        animenaruto=findViewById(R.id.aa_anime_name);
        animesasuke=findViewById(R.id.aa_category);
        judulanime=findViewById(R.id.aa_rating);
        studionaruto=findViewById(R.id.aa_studio);
        anime = findViewById(R.id.aa_description);
        BookMenu.Book book = getIntent().getParcelableExtra("anime");
        String judulanimenaruto = book.getJudulanime();
        String category = book.getCategory();
        String rating = book.getRating();
        String studio = book.getStudio();
        String book1=book.getDeskripsiNaruto();
        anime.setText(book1);
        animenaruto.setText(judulanimenaruto);
        animesasuke.setText(category);
        judulanime.setText(rating);
        studionaruto.setText(studio);

    }
}
