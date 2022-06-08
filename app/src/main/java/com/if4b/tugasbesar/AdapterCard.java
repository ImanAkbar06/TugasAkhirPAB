package com.if4b.tugasbesar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.nio.file.attribute.FileTime;
import java.util.ArrayList;

public class AdapterCard extends RecyclerView.Adapter<AdapterCard.CardViewHolder> {
    private ArrayList<ModelBarbershop> dataBarbershop;

    public AdapterCard(ArrayList<ModelBarbershop> dataBarbershop) {this.dataBarbershop = dataBarbershop;}
    public interface OnitemClickCallBack{
        void onItemClicked(ModelBarbershop data);
    }
    private AdapterCard.OnitemClickCallBack callBack;
    public void setOnitemClickCallBack(AdapterCard.OnitemClickCallBack callBack){
        this.callBack = callBack;
    }


    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_barbershop, parent, false);
        return new CardViewHolder((view));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCard.CardViewHolder holder, int position) {
        ModelBarbershop Barbershop = dataBarbershop.get(position);

        holder.tvNama.setText(Barbershop.getNama());
        holder.tvDetail.setText(Barbershop.getDetail());



        Glide
                .with((holder.itemView.getContext()))
                .load(Barbershop.getFoto())
                .into(holder.iv_foto);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callBack.onItemClicked(dataBarbershop.get(holder.getAdapterPosition()));
            }
        });
        

    }

    @Override
    public int getItemCount() {

        return dataBarbershop.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
         ImageView iv_foto;
         TextView tvNama, tvDetail;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_foto = itemView.findViewById(R.id.iv_foto);
            tvNama = itemView.findViewById(R.id.tv_nama_barbershop);
            tvDetail = itemView.findViewById(R.id.tv_Detail);
        }
    }
}
