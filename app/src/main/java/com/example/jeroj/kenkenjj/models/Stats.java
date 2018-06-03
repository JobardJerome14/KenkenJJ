package com.example.jeroj.kenkenjj.models;

import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("played")
    private Integer played;

    @SerializedName("resolved")
    private Integer resolved;

    @SerializedName("pourcentage")
    private Integer pourcentage;

    @SerializedName("avg_time_resolved")
    private Integer avg_time_resolved;


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

    public Integer getAvg_time_resolved() {
        return avg_time_resolved;
    }

    public void setAvg_time_resolved(Integer avg_time_resolved) {
        this.avg_time_resolved = avg_time_resolved;
    }
}
