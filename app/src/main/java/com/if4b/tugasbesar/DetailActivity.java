package com.if4b.tugasbesar;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends Activity {
    private TextView tvNamaBarbershop, tvDetail,tvJam, tvTelepon;
    private ImageView ivFoto;
    private String yNama, yDetail, yFoto, yJam, yTelepon;
    private Button BtnTelepon, BtnLokasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initView();

        Intent terima = getIntent();
        yNama = terima.getStringExtra("xNama");
        yDetail = terima.getStringExtra("xDetail");
        yFoto = terima.getStringExtra("xFoto");
        yJam = terima.getStringExtra("xJam");
        yTelepon = terima.getStringExtra("xTelepon");


        tvNamaBarbershop.setText(yNama);
        tvDetail.setText(yDetail);
        tvJam.setText(yJam);
        tvTelepon.setText(yTelepon);

        Glide.with(DetailActivity.this)
                .load(yFoto)
                .into(ivFoto);

        // btn lokasi
        BtnLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Lokasi = tvNamaBarbershop.getText().toString();
                Uri uriLokasi = Uri.parse("geo:0,0?q=" + Lokasi);
                Intent bukaLokasi = new Intent(Intent.ACTION_VIEW,uriLokasi);
                startActivity(bukaLokasi);
            }
        });

        // BTN Telepon
        BtnTelepon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Telepon = tvTelepon.getText().toString();
                Intent bukaTelepon = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",Telepon, null));
                startActivity(bukaTelepon);
            }
        });


    }
    private void initView(){
        tvNamaBarbershop = findViewById(R.id.tv_Nama);
        tvDetail = findViewById(R.id.tv_Detail);
        tvJam = findViewById(R.id.tv_Jam);
        ivFoto = findViewById(R.id.iv_foto);
        tvTelepon = findViewById(R.id.tv_Telepon);
        BtnTelepon = findViewById(R.id.btn_Telepon);
        BtnLokasi = findViewById(R.id.btn_Lokasi);
    }
}
