package com.example.jeroj.kenkenjj.models;

import com.google.gson.annotations.SerializedName;

import com.example.jeroj.kenkenjj.ui.models.Block;
import java.util.ArrayList;

public class Grille {

    @SerializedName("id_grille")
    private Integer id_grille;

    @SerializedName("tab")
    private ArrayList<Block> blocks;


    public Grille(Integer id_grille, ArrayList<Block> blockArrayList) {
        this.id_grille = id_grille;
        this.blocks = blockArrayList;
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
}
