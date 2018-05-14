package com.example.jeroj.kenkenjj.api;

import com.example.jeroj.kenkenjj.ui.models.Block;


import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IApi {

    @GET("/kenkenjj/get-grille.php")
    Call<ArrayList<Block>> getKenkenGrille(
    );
}
