package com.example.fishbiteskuy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // Inisialisasi EditText dan Button
        usernameEditText = findViewById(R.id.username);
        emailEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.password);
        signUpButton = findViewById(R.id.signupButton);

        // Menangani klik pada tombol Sign Up
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Validasi input
                if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(SignupActivity.this, "Semua field harus diisi", Toast.LENGTH_SHORT).show();
                } else {
                    // Lakukan proses sign up (misalnya menyimpan data ke database)
                    // Ini hanya contoh, sesuaikan dengan logika Anda
                    Toast.makeText(SignupActivity.this, "Akun berhasil dibuat", Toast.LENGTH_SHORT).show();

                    // Pindah ke LoginActivity
                    Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish(); // Menutup SignupActivity
                }
            }
        });
    }
}
