package com.example.jeroj.kenkenjj.api;

import com.example.jeroj.kenkenjj.api.helpers.ResultatCallback;
import com.example.jeroj.kenkenjj.models.Grille;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class API {

    private IApi iApi;

    /**
     *
     */
    public API() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        // ip 10.0.2.2 special IP for localhost
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2:80").client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        this.iApi = retrofit.create(IApi.class);
    }

    public void getKenkenGrille(String user_id, final ResultatCallback resultatCallback) {
        Call<Grille> call = this.iApi.getKenkenGrille(user_id);

        call.enqueue(new Callback<Grille>() {
            @Override
            public void onResponse(Call<Grille> call, Response<Grille> response) {
                if(response.isSuccessful()) {
                    Grille grille = response.body();
                    resultatCallback.onWaitingResultat(grille);
                }
            }

            @Override
            public void onFailure(Call<Grille> call, Throwable t) {
                //TODO
            }
        });


    }
}
