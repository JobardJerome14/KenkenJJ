package com.example.jeroj.kenkenjj.api.helpers;

import com.example.jeroj.kenkenjj.ui.models.Block;
import java.util.ArrayList;

public interface ResultatCallback<T> {
    void onWaitingResultat(ArrayList<T> blockArrayList);
}
