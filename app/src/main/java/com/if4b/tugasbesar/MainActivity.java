package com.if4b.tugasbesar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBarbershop;
    private ArrayList<ModelBarbershop> data = new
            ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Barbershop Palembang");
        rvBarbershop = findViewById(R.id.rv_Barbershop);
        rvBarbershop.setHasFixedSize(true);
        tampilDataCard();
    }


    private void tampilDataCard() {
        rvBarbershop.setLayoutManager(new LinearLayoutManager(this));
        AdapterCard colokanCard = new AdapterCard(data);
        rvBarbershop.setAdapter(colokanCard);

        colokanCard.setOnitemClickCallBack(new AdapterCard.OnitemClickCallBack() {
            @Override
            public void onItemClicked(ModelBarbershop data) {
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("xNama", data.getNama());
                pindah.putExtra("xDetail", data.getDetail());
                pindah.putExtra("xFoto", data.getFoto());
                startActivity(pindah);

            }
        });

    }
}
