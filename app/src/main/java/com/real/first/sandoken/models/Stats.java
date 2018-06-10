package com.real.first.sandoken.models;

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

    public Integer getResolved() {
        return resolved;
    }

    public Integer getPourcentage() {
        return pourcentage;
    }

}
