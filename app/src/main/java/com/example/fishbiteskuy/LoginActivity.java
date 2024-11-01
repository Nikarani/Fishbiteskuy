package com.example.fishbiteskuy;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.AuthResult; // Impor AuthResult
import com.google.firebase.auth.FirebaseAuth; // Impor FirebaseAuth
import com.google.firebase.auth.FirebaseUser; // Impor FirebaseUser
import com.google.android.gms.tasks.OnCompleteListener; // Impor OnCompleteListener
import com.google.android.gms.tasks.Task; // Impor Task


public class LoginActivity extends AppCompatActivity {

    private FirebaseAuth auth; // Deklarasi variabel FirebaseAuth
    private EditText username; // EditText untuk username
    private EditText password; // EditText untuk password
    private Button loginButton; // Button untuk login

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // Mengatur layout untuk activity ini

        // Menginisialisasi FirebaseAuth
        auth = FirebaseAuth.getInstance();

        // Mengaitkan EditText dan Button dengan ID di layout
        username = findViewById(R.id.username); // Pastikan ID sesuai dengan layout Anda
        password = findViewById(R.id.password); // Pastikan ID sesuai dengan layout Anda
        loginButton = findViewById(R.id.loginButton); // Pastikan ID sesuai dengan layout Anda

        // Mengatur klik pada tombol login
        loginButton.setOnClickListener(v -> {
            String email = username.getText().toString(); // Mendapatkan input dari EditText username
            String pass = password.getText().toString(); // Mendapatkan input dari EditText password
            login(email, pass); // Memanggil fungsi login dengan email dan password
        });
    }

    private void login(String email, String password) {
        auth.signInWithEmailAndPassword(email, password) // Menggunakan Firebase untuk autentikasi
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Login sukses
                            Toast.makeText(LoginActivity.this, "Login berhasil", Toast.LENGTH_SHORT).show();
                            FirebaseUser user = auth.getCurrentUser(); // Mendapatkan user yang sedang login
                            // Lanjutkan ke activity berikutnya jika perlu
                        } else {
                            // Login gagal
                            Toast.makeText(LoginActivity.this, "Login gagal: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}
