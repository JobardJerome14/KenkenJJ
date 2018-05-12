package com.example.jeroj.kenkenjj.ui.models;

public class Block {
    private String et_text = "";
    private String tw_overtext = "";

    private Boolean borderTop = true;
    private Boolean borderLeft = true;
    private Boolean borderRight = true;
    private Boolean borderBottom = true;


    public Block( String overtexte) {
        this.tw_overtext = overtexte;
    }

    public Block( String overtexte, Boolean borderTop, Boolean borderLeft, Boolean borderRight, Boolean borderBottom) {
        this.tw_overtext = overtexte;
        this.borderTop = borderTop;
        this.borderLeft = borderLeft;
        this.borderRight = borderRight;
        this.borderBottom = borderBottom;
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
}
