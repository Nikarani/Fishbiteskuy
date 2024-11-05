
package com.example.fishbiteskuy;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EditProfile extends AppCompatActivity {

    private EditText editUsername, editEmail, editAddress, editPhone;
    private ImageButton saveButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        editUsername = findViewById(R.id.editText);
        editEmail = findViewById(R.id.editText2);
        editAddress = findViewById(R.id.editText3);
        editPhone = findViewById(R.id.editText4);
        saveButton = findViewById(R.id.imageButton);

        saveButton.setOnClickListener(v -> {
            if (isFormFilled()) {
                // Tampilkan pesan "berhasil"
                Toast.makeText(EditProfile.this, "Berhasil", Toast.LENGTH_SHORT).show();
            } else {
                // Tampilkan pesan jika ada kolom yang kosong
                Toast.makeText(EditProfile.this, "Harap isi semua kolom", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private boolean isFormFilled() {
        return !editUsername.getText().toString().trim().isEmpty() &&
                !editEmail.getText().toString().trim().isEmpty() &&
                !editAddress.getText().toString().trim().isEmpty() &&
                !editPhone.getText().toString().trim().isEmpty();
    }
}