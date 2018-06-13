package com.real.first.sandoken.helpers;

public interface IFBEvent {

    // Events
    String CLIC_EVENT = "clic";
    String CRASH_EVENT = "crash";

    // Keys
    String BUTTON_KEY = "button";
    String CHECKBOX_KEY = "checkbox";

    String BIND_KENVIEW_KEY = "bindview_ken";
    String MODE_EDITION_BTN_CLICK_KEY = "mode_edition_btn_click";
    String MODE_EDITION_SELECTION_BLOCK_KEY = "mode_edition_selection_block";

    String API_GET_KEN_GRILLE_KEY = "getKenkenGrille";
    String API_UPD_KEN_GAME_KEY = "updKenGame";
    String API_GET_KEN_STATS_KEY = "getKenStats";


    // Values
    String API_ON_RESPONSE = "onResponse";
    String API_ON_FAILURE = "onFailure";

    String BIND_KENVIEW_KO_VALUE = "no_bind_for_ken_activity";
    String MODE_EDITION_KO_VALUE = "ni_stylo_ni_crayon";

}
