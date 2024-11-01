package com.example.fishbiteskuy;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private TextView titleTextView; // Tambahkan TextView untuk judul berita
    private ImageView imageView; // ImageView untuk menampilkan gambar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail); // Pastikan layout ini sesuai

        TextView titleTextView = null; // Deklarasi untuk TextView judul
        ImageView imageView = null; // Deklarasi untuk ImageView

        // Ambil data dari Intent
        int newsId = getIntent().getIntExtra("newsId", -1); // Ambil ID berita
        int imageResource = getIntent().getIntExtra("IMAGE_RESOURCE", R.drawable.katalog); // Gambar default

        // Set gambar di ImageView
        imageView.setImageResource(imageResource);

        // Anda dapat menambahkan logika lain berdasarkan ID berita
        if (newsId == 1) {
            titleTextView.setText("Judul Berita Pertama");
            // Set konten berita pertama
        } else if (newsId == 2) {
            titleTextView.setText("Judul Berita Kedua");
            // Set konten berita kedua
        }
    }
}
