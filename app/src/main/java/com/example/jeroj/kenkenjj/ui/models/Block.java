package com.example.jeroj.kenkenjj.ui.models;

import android.graphics.Color;
import android.widget.RelativeLayout;

public class Block {
    private String et_text = "";
    private String tw_overtext = "";
    private String marginBottom = "0dp";
    private String marginLeft = "0dp";
    private String marginRight = "0dp";
    private String marginTop = "0dp";

    public Block( String overtexte) {
        this.tw_overtext = overtexte;
    }

    public Block( String overtexte, String marginBottom, String marginLeft, String marginRight, String marginTop) {
        this.tw_overtext = overtexte;
        this.marginBottom = marginBottom;
        this.marginLeft = marginLeft;
        this.marginRight = marginRight;
        this.marginTop = marginTop;
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

    public String getMarginBottom() {
        return marginBottom;
    }

    public void setMarginBottom(String marginBottom) {
        this.marginBottom = marginBottom;
    }

    public String getMarginLeft() {
        return marginLeft;
    }

    public void setMarginLeft(String marginLeft) {
        this.marginLeft = marginLeft;
    }

    public String getMarginRight() {
        return marginRight;
    }

    public void setMarginRight(String marginRight) {
        this.marginRight = marginRight;
    }

    public String getMarginTop() {
        return marginTop;
    }

    public void setMarginTop(String marginTop) {
        this.marginTop = marginTop;
    }
}
