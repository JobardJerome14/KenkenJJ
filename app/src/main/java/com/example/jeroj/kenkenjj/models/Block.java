package com.example.jeroj.kenkenjj.models;

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
    private Integer good_value;

    private String stylo = "";
    private String crayon = "";
    private int current_value;

    private boolean stylo_selected = false;
    private boolean crayon_selected = false;

    private boolean isSelected = false;


    private boolean c1_selected = false;
    private boolean c2_selected = false;
    private boolean c3_selected = false;
    private boolean c4_selected = false;
    private boolean c5_selected = false;
    private boolean c6_selected = false;


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

    public Boolean getBorderTop() {
        return borderTop;
    }

    public Boolean getBorderLeft() {
        return borderLeft;
    }

    public Boolean getBorderRight() {
        return borderRight;
    }

    public Boolean getBorderBottom() {
        return borderBottom;
    }

    public int getCurrent_value() {
        return current_value;
    }

    public void setCurrent_value(int current_value) {
        this.current_value = current_value;
    }

    public Integer getGood_value() {
        return good_value;
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


    public boolean isC1_selected() {
        return c1_selected;
    }

    public void setC1_selected(boolean c1_selected) {
        this.c1_selected = c1_selected;
    }

    public boolean isC2_selected() {
        return c2_selected;
    }

    public void setC2_selected(boolean c2_selected) {
        this.c2_selected = c2_selected;
    }

    public boolean isC3_selected() {
        return c3_selected;
    }

    public void setC3_selected(boolean c3_selected) {
        this.c3_selected = c3_selected;
    }

    public boolean isC4_selected() {
        return c4_selected;
    }

    public void setC4_selected(boolean c4_selected) {
        this.c4_selected = c4_selected;
    }

    public boolean isC5_selected() {
        return c5_selected;
    }

    public void setC5_selected(boolean c5_selected) {
        this.c5_selected = c5_selected;
    }

    public boolean isC6_selected() {
        return c6_selected;
    }

    public void setC6_selected(boolean c6_selected) {
        this.c6_selected = c6_selected;
    }
}
