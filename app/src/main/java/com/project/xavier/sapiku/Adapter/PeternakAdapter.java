package com.project.xavier.sapiku.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.project.xavier.sapiku.R;

import java.util.List;

/**
 * Created by a_pri on 5/18/2018.
 */

public class PeternakAdapter extends RecyclerView.Adapter<PeternakAdapter.ViewHolder> {
    private Context mContext;
    private List<Peternak> mPeternak;

    public PeternakAdapter(Context mContext, List<Peternak> mPeternak) {
        this.mContext = mContext;
        this.mPeternak = mPeternak;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v  = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.peternak_view, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Peternak posting = mPeternak.get(position);

        holder.nama.setText(posting.getmNama());
        holder.umur.setText(posting.getmUmur());
        holder.harga.setText(posting.getmHarga());
//        Picasso.with(mContext)
//                .load(posting.getmImageProfile())
//                .fit()
//                .centerCrop()
//                .into(holder.photoProfile);
//        Picasso.with(mContext)
//                .load(posting.getmImageCover())
//                .fit()
//                .centerCrop()
//                .into(holder.imageCover);

    }

    @Override
    public int getItemCount() {
        return mPeternak.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View mView;
        TextView nama,umur,harga;
        ImageView image;
        RatingBar rating;
        Button detail;

        public ViewHolder(View itemView) {
            super(itemView);

            mView = itemView;

            image = itemView.findViewById(R.id.image);
            nama = itemView.findViewById(R.id.nama_peternak);
            umur= itemView.findViewById(R.id.umur_sapi);
            rating = itemView.findViewById(R.id.rating_sapi);
            harga = itemView.findViewById(R.id.harga_sapi);
            detail = itemView.findViewById(R.id.detail_button);
        }
    }
}
