package com.example.fishbiteskuy;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        // Menggunakan Handler untuk delay sebelum pindah ke MainActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Intent untuk berpindah ke MainActivity
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish(); // Menutup SplashActivity agar tidak bisa kembali ke halaman ini
            }
        }, 2000); // Delay 2000 ms = 2 detik
    }
}
