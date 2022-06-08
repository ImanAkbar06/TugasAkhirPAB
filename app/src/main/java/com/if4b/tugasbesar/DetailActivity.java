package com.if4b.tugasbesar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends Activity {
    private TextView tvNamaBarbershop, tvDetail;
    private ImageView ivFoto;
    private String yNama, yDetail, yFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initView();

        Intent terima = getIntent();
        yNama = terima.getStringExtra("xNama");
        yDetail = terima.getStringExtra("xDetail");
        yFoto = terima.getStringExtra("xFoto");


        tvNamaBarbershop.setText(yNama);
        tvDetail.setText(yDetail);


        Glide.with(DetailActivity.this)
                .load(yFoto)
                .into(ivFoto);


    }
    private void initView(){
        tvNamaBarbershop = findViewById(R.id.tv_nama_barbershop);
        tvDetail = findViewById(R.id.tv_Detail);
        ivFoto = findViewById(R.id.iv_foto);
    }
}
