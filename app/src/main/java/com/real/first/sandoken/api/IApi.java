package com.real.first.sandoken.api;

import com.real.first.sandoken.models.Grille;
import com.real.first.sandoken.models.RetourUpdate;
import com.real.first.sandoken.models.Stats;

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

    @GET("/kenjjstats")
    Call<Stats> getKenStats(
            @Query("user_id") String user_id
    );
}
