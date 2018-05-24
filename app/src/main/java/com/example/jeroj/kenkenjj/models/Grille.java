package com.example.jeroj.kenkenjj.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Grille {

    @SerializedName("id_grille")
    private Integer id_grille;

    @SerializedName("tab")
    private ArrayList<Block> blocks;

    @SerializedName("percent_victory")
    private String percent_victory;


    public Grille(Integer id_grille, ArrayList<Block> blockArrayList, String percent_victory) {
        this.id_grille = id_grille;
        this.blocks = blockArrayList;
        this.percent_victory = percent_victory;
    }

    public Integer getId_grille() {
        return id_grille;
    }

    public void setId_grille(Integer id_grille) {
        this.id_grille = id_grille;
    }

    public ArrayList<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(ArrayList<Block> blocks) {
        this.blocks = blocks;
    }


    public String getPercent_victory() {
        return percent_victory;
    }

    public void setPercent_victory(String percent_victory) {
        this.percent_victory = percent_victory;
    }
}
