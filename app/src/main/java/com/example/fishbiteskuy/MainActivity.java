package com.example.fishbiteskuy;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

public class MainActivity extends AppCompatActivity {

    // Deklarasi variabel untuk elemen UI
    private TextView tvHelloCasie, tvWelcomeCasie;
    private EditText searchBar;
    private Button lihatSelengkapnya1, lihatSelengkapnya2;
    private ImageView iconCart, iconProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Pastikan ini sesuai dengan nama file XML Anda

        // Inisialisasi elemen UI
        tvHelloCasie = findViewById(R.id.tvHelloCasie);
        tvWelcomeCasie = findViewById(R.id.tvWelcomeCasie);
        searchBar = findViewById(R.id.searchBar);
        lihatSelengkapnya1 = findViewById(R.id.lihatSelengkapnya1);
        lihatSelengkapnya2 = findViewById(R.id.lihatSelengkapnya2);
        iconCart = findViewById(R.id.iconCart);
        iconProfile = findViewById(R.id.iconProfile);

        // Set event listener untuk tombol "Lihat Selengkapnya"
        lihatSelengkapnya1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi ketika tombol "Lihat selengkapnya" pertama ditekan
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });

        lihatSelengkapnya2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi ketika tombol "Lihat selengkapnya" kedua ditekan
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });

        // Set event listener untuk ikon keranjang
        iconCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi ketika ikon keranjang ditekan
                Intent intent = new Intent(MainActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });

        // Set event listener untuk ikon profil
        iconProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi ketika ikon profil ditekan
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        // Anda dapat menambahkan lebih banyak fungsionalitas sesuai kebutuhan
    }
}
