package com.example.fishbiteskuy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {
        private EditText usernameEditText, passwordEditText;
        private Button signUpButton;
        private DBDataSource dataSource;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_signup);

            dataSource = new DBDataSource(this);
            dataSource.open();

            usernameEditText = findViewById(R.id.username);
            passwordEditText = findViewById(R.id.password);
            signUpButton = findViewById(R.id.signupButton);

            signUpButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String username = usernameEditText.getText().toString().trim();
                    String password = passwordEditText.getText().toString().trim();

                    if (username.isEmpty() || password.isEmpty()) {
                        Toast.makeText(SignupActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                    } else {
                        boolean isRegistered = dataSource.registerUser(username, password);
                        if (isRegistered) {
                            Toast.makeText(SignupActivity.this, "Registration successful! Please login.", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                            startActivity(intent);
                            finish();
                        } else {
                            Toast.makeText(SignupActivity.this, "Registration failed. Username may already exist.", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            });

        }

        @Override
        protected void onDestroy() {
            dataSource.close();
            super.onDestroy();
        }
    }

