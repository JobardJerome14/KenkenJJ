package com.example.jeroj.kenkenjj.ui.models;

import com.google.gson.annotations.SerializedName;

public class Block {
    @SerializedName("overtexte")
    private String tw_overtext;

    @SerializedName("vtop")
    private Boolean borderTop;

    @SerializedName("vleft")
    private Boolean borderLeft;

    @SerializedName("vright")
    private Boolean borderRight;

    @SerializedName("vbottom")
    private Boolean borderBottom;


    @SerializedName("texte")
    private Integer good_value = 0;

    private String et_text = "";
    private int current_value = 0;


    public Block( String overtexte, Boolean borderTop, Boolean borderLeft, Boolean borderRight, Boolean borderBottom, Integer good_value) {
        this.tw_overtext = overtexte;
        this.borderTop = borderTop;
        this.borderLeft = borderLeft;
        this.borderRight = borderRight;
        this.borderBottom = borderBottom;
        this.current_value = 0;
        this.good_value = good_value;
    }


    public String getEt_text() {
        return et_text;
    }

    public void setEt_text(String et_text) {
        this.et_text = et_text;
    }


    public String getTw_overtext() {
        return tw_overtext;
    }

    public void setTw_overtext(String tw_overtext) {
        this.tw_overtext = tw_overtext;
    }

    public Boolean getBorderTop() {
        return borderTop;
    }

    public void setBorderTop(Boolean borderTop) {
        this.borderTop = borderTop;
    }

    public Boolean getBorderLeft() {
        return borderLeft;
    }

    public void setBorderLeft(Boolean borderLeft) {
        this.borderLeft = borderLeft;
    }

    public Boolean getBorderRight() {
        return borderRight;
    }

    public void setBorderRight(Boolean borderRight) {
        this.borderRight = borderRight;
    }

    public Boolean getBorderBottom() {
        return borderBottom;
    }

    public void setBorderBottom(Boolean borderBottom) {
        this.borderBottom = borderBottom;
    }

    public int getCurrent_value() {
        return current_value;
    }

    public void setCurrent_value(int current_value) {
        this.current_value = current_value;
    }

    void setCurrent_value(Integer current_value) {
        this.current_value = current_value;
    }

    public Integer getGood_value() {
        return good_value;
    }

    public void setGood_value(Integer good_value) {
        this.good_value = good_value;
    }
}
