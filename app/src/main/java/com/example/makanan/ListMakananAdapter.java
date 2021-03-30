package com.example.makanan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class ListMakananAdapter extends RecyclerView.Adapter<ListMakananAdapter.ListviewHolder> {
    private ArrayList<Makanan> listMakanan;

    public ListMakananAdapter(ArrayList<Makanan> list) {
        this.listMakanan = list;
    }
    @NonNull
    @Override
    public ListviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_makanan, parent, false);
        return new ListviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListviewHolder holder, int position) {
        Makanan makanan = listMakanan.get(position);
        Glide.with(holder.itemView.getContext())
                .load(makanan.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvNama.setText(makanan.getNama());
        holder.tvDetail.setText(makanan.getDetail());

    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    class ListviewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvDetail;

        ListviewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.img_item_makanan);
            tvNama = itemview.findViewById(R.id.tv_item_nama);
            tvDetail = itemview.findViewById(R.id.tv_detail);
        }
    }
}
