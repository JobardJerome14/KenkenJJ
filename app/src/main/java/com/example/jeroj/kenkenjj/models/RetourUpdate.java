package com.example.jeroj.kenkenjj.models;

import com.google.gson.annotations.SerializedName;

public class RetourUpdate {

    @SerializedName("status")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
