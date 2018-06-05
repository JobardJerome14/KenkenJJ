package com.example.jeroj.kenkenjj.models;

import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("played")
    private Integer played;

    @SerializedName("resolved")
    private Integer resolved;

    @SerializedName("pourcentage")
    private Integer pourcentage;



    public Integer getPlayed() {
        return played;
    }

    public void setPlayed(Integer played) {
        this.played = played;
    }

    public Integer getResolved() {
        return resolved;
    }

    public void setResolved(Integer resolved) {
        this.resolved = resolved;
    }

    public Integer getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(Integer pourcentage) {
        this.pourcentage = pourcentage;
    }

}
