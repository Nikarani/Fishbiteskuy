package com.example.fishbiteskuy;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UlasanActivity extends AppCompatActivity {

    private EditText editTextUlasan;
    private Button buttonKirim;
    private ImageButton buttonBack;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulasan); // Ganti dengan nama file layout yang sesuai

        editTextUlasan = findViewById(R.id.editTextUlasan); // Pastikan ID sesuai
        buttonKirim = findViewById(R.id.button2);
        buttonBack = findViewById(R.id.imageButton4);

        // Mengatur tindakan untuk tombol kirim ulasan
        buttonKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kirimUlasan();
            }
        });

        // Mengatur tindakan untuk tombol kembali
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Kembali ke aktivitas sebelumnya
            }
        });
    }

    private void kirimUlasan() {
        String ulasan = editTextUlasan.getText().toString().trim();

        if (ulasan.isEmpty()) {
            Toast.makeText(this, "Harap berikan ulasan sebelum mengirim.", Toast.LENGTH_SHORT).show();
            return;
        }

        // Simpan ulasan ke database atau kirim ke server
        // Contoh: saveUlasanToDatabase(ulasan);

        // Tampilkan pesan sukses
        Toast.makeText(this, "Ulasan Anda telah dikirim.", Toast.LENGTH_SHORT).show();

        // Kosongkan field setelah pengiriman
        editTextUlasan.setText("");
    }
}
