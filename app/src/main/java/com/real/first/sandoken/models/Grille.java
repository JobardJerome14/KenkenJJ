package com.real.first.sandoken.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Grille {

    @SerializedName("id_grille")
    private Integer id_grille;

    @SerializedName("tab")
    private ArrayList<Block> blocks;

    @SerializedName("percent_victory")
    private String percent_victory;


    @SerializedName("nb_victory")
    private String nb_victory;


    public Grille(Integer id_grille, ArrayList<Block> blockArrayList, String percent_victory, String nb_victory) {
        this.id_grille = id_grille;
        this.blocks = blockArrayList;
        this.percent_victory = percent_victory;
        this.nb_victory = nb_victory;
    }

    public Integer getId_grille() {
        return id_grille;
    }

    public ArrayList<Block> getBlocks() {
        return blocks;
    }


    public String getPercent_victory() {
        return percent_victory;
    }


    public String getNb_victory() {
        return nb_victory;
    }

}
