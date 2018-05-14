package com.example.jeroj.kenkenjj.api;

import com.example.jeroj.kenkenjj.api.helpers.ResultatCallback;
import com.example.jeroj.kenkenjj.ui.models.Block;

import java.io.IOException;
import java.util.ArrayList;

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

    public void getKenkenGrille(final ResultatCallback resultatCallback) {
        Call<ArrayList<Block>> call = this.iApi.getKenkenGrille();

        call.enqueue(new Callback<ArrayList<Block>>() {
            @Override
            public void onResponse(Call<ArrayList<Block>> call, Response<ArrayList<Block>> response) {
                if(response.isSuccessful()) {
                    ArrayList<Block> blockArrayList = response.body();
                    resultatCallback.onWaitingResultat(blockArrayList);
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Block>> call, Throwable t) {
                //TODO
            }
        });


    }
}
