package com.example.fishbiteskuy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Mendapatkan referensi untuk setiap item profil
        TextView editProfileLayout = findViewById(R.id.editprofile);
        TextView cartLayout = findViewById(R.id.card);
        TextView orderHistoryLayout = findViewById(R.id.history);
        TextView logoutLayout = findViewById(R.id.logout);

        // Menambahkan event listener untuk setiap item
        editProfileLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka aktivitas Edit Profil
                Intent intent = new Intent(ProfileActivity.this, EditProfileActivity.class);
                startActivity(intent);
            }
        });

        cartLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka aktivitas Keranjang
                Intent intent = new Intent(ProfileActivity.this, artActivity.class);
                startActivity(intent);
            }
        });

        orderHistoryLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka aktivitas Riwayat Pemesanan
                Intent intent = new Intent(ProfileActivity.this, OrderHistoryActivity.class);
                startActivity(intent);
            }
        });

        logoutLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Logika untuk logout
                Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
                startActivity(intent);
                finish(); // Menutup ProfileActivity setelah logout
            }
        });
    }
}
