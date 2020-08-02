package com.arifah.uas_proyek_buku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ViewActivity extends AppCompatActivity {

    private TextView tv_judul, tv_penulis, tv_penerbit;
    private String sPid, sJudul, sPenulis, sPenerbit, sImageUrl;
    private ImageView imageView_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        tv_judul = findViewById(R.id.tv_judul_show);
        tv_penulis = findViewById(R.id.tv_penulis_show);
        tv_penerbit = findViewById(R.id.tv_penerbit_show);
        imageView_show = findViewById(R.id.imageView_show);

        sPid = getIntent().getStringExtra("id");
        sJudul = getIntent().getStringExtra("judul");
        sPenulis = getIntent().getStringExtra("penulis");
        sPenerbit = getIntent().getStringExtra("penerbit");
        sImageUrl = getIntent().getStringExtra("cover_url");

        tv_judul.setText(sJudul);
        tv_penulis.setText(sPenulis);
        tv_penerbit.setText(sPenerbit);


        Picasso.with(this)
                .load(sImageUrl)
                .placeholder(R.drawable.bukutanpabg)
                .fit()
                .centerCrop()
                .into(imageView_show);
    }
}
