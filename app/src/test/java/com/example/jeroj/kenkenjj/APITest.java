package com.example.jeroj.kenkenjj;

import com.example.jeroj.kenkenjj.api.IApi;
import com.example.jeroj.kenkenjj.models.Grille;
import com.example.jeroj.kenkenjj.models.RetourUpdate;
import com.example.jeroj.kenkenjj.models.Stats;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APITest {

    private IApi iApi;

    public APITest() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        // ip 10.0.2.2 special IP for localhost
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://afternoon-wave-75382.herokuapp.com/").client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        this.iApi = retrofit.create(IApi.class);
    }

    public Call<Grille> get_grille (String user_id) {
        // Create a call instance for looking up Retrofit contributors.
        return this.iApi.getKenkenGrille(user_id);
    }

    public Call<RetourUpdate> update_ken_game (String user_id, Integer id_grille, Integer etat) {
        return this.iApi.updKenGame(user_id, id_grille, etat);
    }


    public Call<Stats> get_ken_stats (String user_id) {
        return this.iApi.getKenStats(user_id);
    }

}

