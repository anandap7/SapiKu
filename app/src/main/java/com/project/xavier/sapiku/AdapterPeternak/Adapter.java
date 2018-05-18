package com.project.xavier.sapiku.AdapterPeternak;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.project.xavier.sapiku.Detail;
import com.project.xavier.sapiku.R;

import java.util.List;

/**
 * Created by a_pri on 5/18/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private Context mContext;
    private List<mHistory> mMPeternak;

    public Adapter(Context mContext, List<mHistory> mMPeternak) {
        this.mContext = mContext;
        this.mMPeternak = mMPeternak;
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
        final mHistory posting = mMPeternak.get(position);

        holder.id.setText(posting.getmId());
        holder.nama.setText(posting.getmNama());
        holder.umur.setText(posting.getmUmur());
        holder.harga.setText(posting.getmHarga());
        holder.detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext.getApplicationContext(), posting.getmId(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(mContext.getApplicationContext(), Detail.class);
                mContext.startActivity(intent);
            }
        });
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
        return mMPeternak.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View mView;
        TextView id, nama,umur,harga;
        ImageView image;
        RatingBar rating;
        Button detail;

        public ViewHolder(View itemView) {
            super(itemView);

            mView = itemView;

            id = itemView.findViewById(R.id.id_sapi);
            image = itemView.findViewById(R.id.image);
            nama = itemView.findViewById(R.id.nama_peternak);
            umur= itemView.findViewById(R.id.umur_sapi);
            rating = itemView.findViewById(R.id.rating_sapi);
            harga = itemView.findViewById(R.id.harga_sapi);
            detail = itemView.findViewById(R.id.go_detail);;
        }
    }
}
