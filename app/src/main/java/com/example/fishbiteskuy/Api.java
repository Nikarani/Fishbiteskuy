package com.example.fishbiteskuy;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

// Mendefinisikan interface Api
public interface Api {

    // Mendefinisikan interface ApiService
    public interface ApiService {
        @POST("login") // Sesuaikan endpoint sesuai dengan route Laravel Anda
        Call<LoginResponse> login(@Body LoginRequest loginRequest);
    }
}
