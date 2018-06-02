package com.example.jeroj.kenkenjj.api;

import android.support.annotation.NonNull;

import com.example.jeroj.kenkenjj.api.helpers.ResultatCallback;
import com.example.jeroj.kenkenjj.models.Grille;
import com.example.jeroj.kenkenjj.models.RetourUpdate;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class API {

    private IApi iApi;

    private SharedP sharedP;

    /**
     *
     */
    public API() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        //String url = "https://8080-dot-3963909-dot-devshell.appspot.com/";
        //String url = "http://10.0.2.2:80";
        String url = "https://afternoon-wave-75382.herokuapp.com/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url).client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        this.iApi = retrofit.create(IApi.class);

    }

    public void getKenkenGrille(String user_id, final ResultatCallback<Grille> resultatCallback) {
        Call<Grille> call = this.iApi.getKenkenGrille(user_id);

        call.enqueue(new Callback<Grille>() {
            @Override
            public void onResponse(@NonNull Call<Grille> call, @NonNull Response<Grille> response) {
                if (response.isSuccessful()) {
                    Grille grille = response.body();
                    resultatCallback.onWaitingResultat(grille);
                } else {
                    //TODO event firebase ?
                }
            }

            @Override
            public void onFailure(@NonNull Call<Grille> call, @NonNull Throwable t) {
                //TODO event firebase ?
            }
        });

    }

    public void updKenGame(String user_id, Integer id_grille, Integer gagne, final ResultatCallback<RetourUpdate> updateCallback) {
        Call<RetourUpdate> call = this.iApi.updKenGame(user_id, id_grille, gagne);

        call.enqueue(new Callback<RetourUpdate>() {
            @Override
            public void onResponse(@NonNull Call<RetourUpdate> call, @NonNull Response<RetourUpdate> response) {
                if (response.isSuccessful()) {
                    RetourUpdate retourUpdate = response.body();
                    updateCallback.onWaitingResultat(retourUpdate);
                } else {
                    //TODO event firebase ?
                }
            }

            @Override
            public void onFailure(@NonNull Call<RetourUpdate> call, @NonNull Throwable t) {
                //TODO event firebase ?
            }
        });
    }
}
