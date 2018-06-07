package com.example.jeroj.kenkenjj.api;

import android.support.annotation.NonNull;
import android.widget.Toast;

import com.example.jeroj.kenkenjj.R;
import com.example.jeroj.kenkenjj.api.helpers.ResultatCallback;
import com.example.jeroj.kenkenjj.helpers.FBevent;
import com.example.jeroj.kenkenjj.helpers.IFBEvent;
import com.example.jeroj.kenkenjj.models.Grille;
import com.example.jeroj.kenkenjj.models.RetourUpdate;
import com.example.jeroj.kenkenjj.models.Stats;
import com.example.jeroj.kenkenjj.ui.reusable.MyApplication;

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
                    report_firebase_API_crash(IFBEvent.API_GET_KEN_GRILLE_KEY, IFBEvent.API_ON_RESPONSE);
                }
            }

            @Override
            public void onFailure(@NonNull Call<Grille> call, @NonNull Throwable t) {
                report_firebase_API_crash(IFBEvent.API_GET_KEN_GRILLE_KEY, IFBEvent.API_ON_FAILURE);
                Toast.makeText(MyApplication.getContext(), R.string.api_new_game_impossible, Toast.LENGTH_SHORT).show();
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
                    report_firebase_API_crash(IFBEvent.API_UPD_KEN_GAME_KEY, IFBEvent.API_ON_RESPONSE);
                }
            }

            @Override
            public void onFailure(@NonNull Call<RetourUpdate> call, @NonNull Throwable t) {
                report_firebase_API_crash(IFBEvent.API_UPD_KEN_GAME_KEY, IFBEvent.API_ON_FAILURE);
            }
        });
    }


    public void getKenStats(String user_id, final ResultatCallback<Stats> resultatCallback) {
        Call<Stats> call = this.iApi.getKenStats(user_id);

        call.enqueue(new Callback<Stats>() {
            @Override
            public void onResponse(@NonNull Call<Stats> call, @NonNull Response<Stats> response) {
                if (response.isSuccessful()) {
                    Stats stats = response.body();
                    resultatCallback.onWaitingResultat(stats);
                } else {
                    report_firebase_API_crash(IFBEvent.API_GET_KEN_STATS_KEY, IFBEvent.API_ON_RESPONSE);
                }
            }

            @Override
            public void onFailure(@NonNull Call<Stats> call, @NonNull Throwable t) {
                report_firebase_API_crash(IFBEvent.API_GET_KEN_STATS_KEY, IFBEvent.API_ON_FAILURE);
                Toast.makeText(MyApplication.getContext(), R.string.api_get_stats_impossible, Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void report_firebase_API_crash(String key, String value) {
        new FBevent(MyApplication.getContext(), IFBEvent.CRASH_EVENT, key, value);
    }



}

