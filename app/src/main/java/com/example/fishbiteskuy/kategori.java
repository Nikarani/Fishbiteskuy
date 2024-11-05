package com.example.fishbiteskuy;


import android.annotation.SuppressLint;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

class KategoriActivity extends AppCompatActivity {

    private List<String> cartItems = new ArrayList<>();
    private EditText searchBar;
    private LinearLayout productContainer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchBar = findViewById(R.id.search_view);
        productContainer = findViewById(R.id.product_container);

        setupSearchFunction();
        setupProductButtons();
    }

    private void setupSearchFunction() {
        searchBar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filterProducts(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }

    private void filterProducts(String query) {
        for (int i = 0; i < productContainer.getChildCount(); i++) {
            View productView = productContainer.getChildAt(i);
            TextView productName = productView.findViewById(R.id.textView_name);
            productView.setVisibility(productName.getText().toString().toLowerCase().contains(query.toLowerCase()) ? View.VISIBLE : View.GONE);
        }
    }

    private void setupProductButtons() {
        // Contoh untuk produk 1
        ImageButton product1Button = findViewById(R.id.imageButton1);
        product1Button.setOnClickListener(view -> addToCart("Ikan Emas"));

        // Contoh untuk produk 2
        ImageButton product2Button = findViewById(R.id.imageButton2);
        product2Button.setOnClickListener(view -> addToCart("Ikan Tuna"));

        // Contoh untuk produk 2
        ImageButton product3Button = findViewById(R.id.imageButton2);
        product2Button.setOnClickListener(view -> addToCart("Ikan Tuna"));

        // Contoh untuk produk 2
        ImageButton product4Button = findViewById(R.id.imageButton2);
        product2Button.setOnClickListener(view -> addToCart("Ikan Tuna"));

        // Contoh untuk produk 2
        ImageButton product5Button = findViewById(R.id.imageButton2);
        product2Button.setOnClickListener(view -> addToCart("Ikan Tuna"));

        // Contoh untuk produk 2
        ImageButton product6Button = findViewById(R.id.imageButton2);
        product2Button.setOnClickListener(view -> addToCart("Ikan Tuna"));

    }

    private void addToCart(String itemName) {
        cartItems.add(itemName);
        // Tampilkan pesan atau update UI untuk menunjukkan bahwa item telah ditambahkan ke keranjang
    }
}

public class kategori extends AppCompatActivity {
    @GET("produk")
    @Override
//    Call<List<Produk>> getProduk();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kategori);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


}

