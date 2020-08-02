package com.arifah.uas_proyek_buku.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.arifah.uas_proyek_buku.R;
import com.arifah.uas_proyek_buku.MainActivity;
import com.arifah.uas_proyek_buku.R;
import com.arifah.uas_proyek_buku.ViewActivity;
import com.arifah.uas_proyek_buku.model.Request;
import com.arifah.uas_proyek_buku.model.Request;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class RequestAdapterRecyclerView extends RecyclerView.Adapter<RequestAdapterRecyclerView.MyViewHolder>{
    private List<Request> bukuList;
    private Activity mActivity;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public LinearLayout rl_layout;
        public TextView tv_judul, tv_penulis;

        public MyViewHolder(View view) {
            super(view);
            rl_layout = view.findViewById(R.id.linearview_item);
            tv_judul = view.findViewById(R.id.tv_judul);
            tv_penulis = view.findViewById(R.id.tv_penulis);
        }
    }

    public RequestAdapterRecyclerView(ArrayList<Request> bukuList, Activity activity) {
        this.bukuList = bukuList;
        this.mActivity = activity;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_request, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final Request buku = bukuList.get(position);

        holder.tv_judul.setText(buku.getJudul());
        holder.tv_penulis.setText(buku.getPenulis());

        holder.rl_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent goDetail = new Intent(mActivity, ViewActivity.class);
                goDetail.putExtra("id", buku.getKey());
                goDetail.putExtra("judul", buku.getJudul());
                goDetail.putExtra("penulis", buku.getPenulis());
                goDetail.putExtra("penerbit", buku.getPenerbit());
                goDetail.putExtra("cover_url", buku.getCover_url());

                mActivity.startActivity(goDetail);
            }
        });

    }

    @Override
    public int getItemCount() {
        return bukuList.size();
    }
}
