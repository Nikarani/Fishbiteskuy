package com.example.fishbiteskuy;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

// Mendefinisikan interface Api
public interface Api {

    @GET("getUserByUsernamePassword")
    Call<List<User>> getUser(@Query("username") String username, @Query("password") String password);
    }

