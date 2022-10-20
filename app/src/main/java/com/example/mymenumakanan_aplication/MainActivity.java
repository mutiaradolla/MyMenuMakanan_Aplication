package com.example.mymenumakanan_aplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rec_Makanan;
    private ArrayList <Kuliner> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rec_Makanan = findViewById(R.id.rec_Makanan);
        initData();

        rec_Makanan.setAdapter(new KulinerAdapter(listMakanan));
        rec_Makanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData(){
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Kuliner("Dimsun", "Dimsum hangat dengan saus cabai", "Rp 10.000", R.drawable.dimsum));
        listMakanan.add(new Kuliner("Ayam Geprek", "Ayam crispy dengan sambal bawang", "Rp 12.000", R.drawable.ayam));
        listMakanan.add(new Kuliner("Takoyaki", "Takoyaki hangat dengan saus dan sosis", "Rp 13.000", R.drawable.takoyaki));
        listMakanan.add(new Kuliner("Soto", "Soto enak kuah hangat", "Rp 8.000", R.drawable.soto));
        listMakanan.add(new Kuliner("Steak", "Steak enak rasa bintang lima", "Rp 18.000", R.drawable.steak));
        listMakanan.add(new Kuliner("Nasi Goreng", "Nasi Goreng dengan bumbu rahasia", "Rp 13.000", R.drawable.nasigoreng));

    }
}