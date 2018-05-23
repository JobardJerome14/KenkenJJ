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

    private String stylo = "";
    private String crayon = "";
    private int current_value = 0;

    private boolean stylo_selected = false;
    private boolean crayon_selected = false;

    private boolean isSelected = false;



    public Block(String overtexte, Boolean borderTop, Boolean borderLeft, Boolean borderRight, Boolean borderBottom, Integer good_value) {
        this.tw_overtext = overtexte;
        this.borderTop = borderTop;
        this.borderLeft = borderLeft;
        this.borderRight = borderRight;
        this.borderBottom = borderBottom;
        this.current_value = 0;
        this.good_value = good_value;
    }


    public String getStylo() {
        return stylo;
    }

    public void setStylo(String stylo) {
        this.stylo = stylo;
    }

    public String getCrayon() {
        return crayon;
    }

    public void setCrayon(String crayon) {
        this.crayon = crayon;
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

    void setCurrent_value(Integer current_value) {
        this.current_value = current_value;
    }

    public void setCurrent_value(int current_value) {
        this.current_value = current_value;
    }

    public Integer getGood_value() {
        return good_value;
    }

    public void setGood_value(Integer good_value) {
        this.good_value = good_value;
    }


    public boolean isStylo_selected() {
        return stylo_selected;
    }

    public void setStylo_selected(boolean stylo_selected) {
        this.stylo_selected = stylo_selected;
    }

    public boolean isCrayon_selected() {
        return crayon_selected;
    }

    public void setCrayon_selected(boolean crayon_selected) {
        this.crayon_selected = crayon_selected;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
