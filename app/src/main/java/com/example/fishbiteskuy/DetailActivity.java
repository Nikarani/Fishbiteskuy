package com.example.fishbiteskuy;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private TextView tvDetailTitle;
    private TextView tvDetailContent;
    private ImageView imageViewDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail); // Pastikan layout ini ada di folder res/layout

        // Inisialisasi elemen UI
        tvDetailTitle = findViewById(R.id.tvDetailTitle);
        tvDetailContent = findViewById(R.id.tvDetailContent);
        imageViewDetail = findViewById(R.id.imageViewDetail);

        // Dapatkan data dari Intent
        String title = getIntent().getStringExtra("TITLE");
        String content = getIntent().getStringExtra("CONTENT");
        int imageResource = getIntent().getIntExtra("IMAGE_RESOURCE", R.drawable.default_image); // Gambar default

        // Set data ke elemen UI
        tvDetailTitle.setText(title);
        tvDetailContent.setText(content);
        imageViewDetail.setImageResource(imageResource);
    }
}
