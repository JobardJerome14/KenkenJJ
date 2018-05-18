package com.example.jeroj.kenkenjj.api;

import com.example.jeroj.kenkenjj.models.Grille;
import com.example.jeroj.kenkenjj.ui.models.Block;


import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IApi {

    @GET("/kenkenjj/get-grille.php")
    Call<Grille> getKenkenGrille(
            @Query("user_id") String user_id
    );
}
