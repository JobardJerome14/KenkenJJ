package com.example.jeroj.kenkenjj.api;

import com.example.jeroj.kenkenjj.models.Grille;
import com.example.jeroj.kenkenjj.models.RetourUpdate;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IApi {

    //@GET("/src/gcpkenjj/php_gae_quickstart-2018-05-29-23-25/get-grille.php")
    @GET("/kenjjget")
    Call<Grille> getKenkenGrille(
            @Query("user_id") String user_id
    );


    //@GET("/src/gcpkenjj/php_gae_quickstart-2018-05-29-23-25/upd-game.php")
    @GET("/kenjjupd")
    Call<RetourUpdate> updKenGame(
            @Query("user_id") String user_id,
            @Query("id_grille") Integer id_grille,
            @Query("etat") Integer etat
    );
}
