package com.real.first.sandoken.models;

import com.google.gson.annotations.SerializedName;

public class RetourUpdate {

    @SerializedName("status")
    private String status;

    public String getStatus() {
        return status;
    }

}
