package com.example.fishbiteskuy;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class IkanAirTawarActivity extends AppCompatActivity {

    private List<Product> productList;
    private LinearLayout productContainer;
    private EditText searchBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_ikan_tawar);

        productContainer = findViewById(R.id.productContainer);
        searchBar = findViewById(R.id.search_view);

        // Contoh data produk
        productList = new ArrayList<>();
        productList.add(new Product("Ikan Nila", 45000, R.drawable.ikan_nila));
        productList.add(new Product("Ikan Lele", 30000, R.drawable.ikan_lele));
        // Tambahkan produk lainnya sesuai kebutuhan

        // Tampilkan produk
        displayProducts(productList);

        // Implementasi pencarian
        searchBar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filterProducts(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) { }
        });

        // Setup edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void displayProducts(List<Product> products) {
        productContainer.removeAllViews();
        for (Product product : products) {
            View productView = getLayoutInflater().inflate(R.layout.product_item, productContainer, false);
            TextView name = productView.findViewById(R.id.productName);
            TextView price = productView.findViewById(R.id.productPrice);
            ImageButton addToCart = productView.findViewById(R.id.addToCartButton);

            name.setText(product.getName());
            price.setText("Rp " + product.getPrice());

            addToCart.setOnClickListener(v -> {
                // Logika menambahkan item ke keranjang
                addToCart(product);
            });

            productContainer.addView(productView);
        }
    }

    private void addToCart(Product product) {
        // Logika untuk menambahkan produk ke keranjang
        Toast.makeText(this, product.getName() + " berhasil ditambahkan", Toast.LENGTH_SHORT).show();
    }

    private void filterProducts(String query) {
        List<Product> filteredList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().toLowerCase().contains(query.toLowerCase())) {
                filteredList.add(product);
            }
        }
        displayProducts(filteredList);
    }
}
