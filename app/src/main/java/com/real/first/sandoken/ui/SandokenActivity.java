package com.real.first.sandoken.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ProgressBar;

import com.real.first.sandoken.R;
import com.real.first.sandoken.api.API;
import com.real.first.sandoken.api.SharedP;
import com.real.first.sandoken.api.helpers.ResultatCallback;
import com.real.first.sandoken.helpers.FBevent;
import com.real.first.sandoken.helpers.IFBEvent;
import com.real.first.sandoken.models.Block;
import com.real.first.sandoken.models.Grille;
import com.real.first.sandoken.models.RetourUpdate;
import com.real.first.sandoken.ui.adapters.BlockAdapter;
import com.real.first.sandoken.ui.reusable.ActivityBase;
import com.real.first.sandoken.ui.reusable.AlertFragment;
import com.real.first.sandoken.ui.reusable.LogUtils;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class SandokenActivity extends ActivityBase {

    Button raz_btn;
    Button new_game_btn;
    Button help_btn;
    Button clear_box_btn;
    CheckBox mode_crayon;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;

    private ProgressBar spinner;
    private GridView gridView;
    private BlockAdapter blockAdapter;
    private Integer id_grille = 0;
    private String user_id = "JJUSER";

    private SharedP sharedP;

    private boolean win = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kenken);

        sharedP = new SharedP(this);
        this.user_id = sharedP.getUserId();

        if(sharedP.getModeEdition()==null) {
            sharedP.setModeEdition(false);
        }
        bindView();
    }

    private Grille get_grille(Integer new_grille) {
        Long tsLong = System.currentTimeMillis() / 1000;
        String ts = tsLong.toString(); //current timestamp en string
        this.user_id = UUID.randomUUID().toString() + ts;

        ArrayList<Block> blocks = new ArrayList<>();

        if (new_grille == 1) {
            if (this.id_grille == 0) {
                this.id_grille = 1;
            } else {
                this.id_grille = 0;
            }
        }

        if (this.id_grille == 1) {
            //1
            blocks.add(new Block("15x", true, true, false, true, 5));
            blocks.add(new Block("", true, false, true, false, 1));
            blocks.add(new Block("10x", true, true, true, false, 2));
            blocks.add(new Block("24x", true, true, true, false, 4));
            blocks.add(new Block("11+", true, true, false, true, 3));
            blocks.add(new Block("", true, false, true, false, 6));
            //2
            blocks.add(new Block("2/", true, true, true, false, 4));
            blocks.add(new Block("", false, true, true, true, 3));
            blocks.add(new Block("", false, true, true, true, 5));
            blocks.add(new Block("", false, true, false, true, 1));
            blocks.add(new Block("", true, false, true, true, 6));
            blocks.add(new Block("", false, true, true, true, 2));
            //3
            blocks.add(new Block("", false, true, true, true, 2));
            blocks.add(new Block("5-", true, true, false, true, 6));
            blocks.add(new Block("", true, false, true, true, 1));
            blocks.add(new Block("9+", true, true, false, true, 5));
            blocks.add(new Block("", true, false, true, true, 4));
            blocks.add(new Block("60x", true, true, true, false, 3));
            //4
            blocks.add(new Block("2/", true, true, true, false, 3));
            blocks.add(new Block("3-", true, true, true, false, 5));
            blocks.add(new Block("2-", true, true, true, false, 6));
            blocks.add(new Block("3+", true, true, false, true, 2));
            blocks.add(new Block("", true, false, true, true, 1));
            blocks.add(new Block("", false, true, true, false, 4));
            //5
            blocks.add(new Block("", false, true, true, true, 6));
            blocks.add(new Block("", false, true, true, true, 2));
            blocks.add(new Block("", false, true, true, true, 4));
            blocks.add(new Block("3-", true, true, true, false, 3));
            blocks.add(new Block("", true, true, false, true, 5));
            blocks.add(new Block("", false, false, true, true, 1));
            //6
            blocks.add(new Block("12x", true, true, false, true, 1));
            blocks.add(new Block("", true, false, false, true, 4));
            blocks.add(new Block("", true, false, true, true, 3));
            blocks.add(new Block("", false, true, true, true, 6));
            blocks.add(new Block("3-", true, true, false, true, 2));
            blocks.add(new Block("", true, false, true, true, 5));
        } else {
            //1
            blocks.add(new Block("1-", true, true, true, false, 4));
            blocks.add(new Block("150x", true, true, false, false, 6));
            blocks.add(new Block("", true, false, true, true, 5));
            blocks.add(new Block("2/", true, true, false, true, 2));
            blocks.add(new Block("", true, false, true, true, 1));
            blocks.add(new Block("2-", true, true, true, false, 3));
            //2
            blocks.add(new Block("", false, true, true, true, 3));
            blocks.add(new Block("", false, true, true, true, 5));
            blocks.add(new Block("1-", true, true, true, false, 4));
            blocks.add(new Block("3/", true, true, false, true, 6));
            blocks.add(new Block("", true, false, true, true, 2));
            blocks.add(new Block("", false, true, true, true, 1));
            //3
            blocks.add(new Block("1-", true, true, false, true, 1));
            blocks.add(new Block("", true, false, true, true, 2));
            blocks.add(new Block("", false, true, true, true, 3));
            blocks.add(new Block("4-", true, true, true, false, 5));
            blocks.add(new Block("2-", true, true, false, true, 6));
            blocks.add(new Block("", true, false, true, true, 4));
            //4
            blocks.add(new Block("10+", true, true, false, true, 5));
            blocks.add(new Block("", true, false, false, true, 3));
            blocks.add(new Block("", true, false, true, true, 2));
            blocks.add(new Block("", false, true, true, true, 1));
            blocks.add(new Block("1-", true, true, true, false, 4));
            blocks.add(new Block("6+", true, true, true, true, 6));
            //5
            blocks.add(new Block("3/", true, true, true, false, 6));
            blocks.add(new Block("3-", true, true, true, false, 4));
            blocks.add(new Block("5-", true, true, true, false, 1));
            blocks.add(new Block("36x", true, true, true, false, 3));
            blocks.add(new Block("", false, true, true, true, 5));
            blocks.add(new Block("3-", true, true, true, false, 2));
            //6
            blocks.add(new Block("", false, true, true, true, 2));
            blocks.add(new Block("", false, true, true, true, 1));
            blocks.add(new Block("", false, true, true, true, 6));
            blocks.add(new Block("", false, true, false, true, 4));
            blocks.add(new Block("", true, false, true, true, 3));
            blocks.add(new Block("", false, true, true, true, 5));
        }

        return new Grille(this.id_grille, blocks, "73");
    }

    private void load_grille(Grille grille) {
        this.sharedP.setCurrentGrille(grille);
        this.blockAdapter = new BlockAdapter(this, grille);
        this.gridView.setAdapter(this.blockAdapter);
        this.id_grille = grille.getId_grille();
    }

    private void get_grille_via_api() {
        API api = new API();
        spinner.setVisibility(View.VISIBLE);
        api.getKenkenGrille(this.user_id, new ResultatCallback<Grille>() {
            @Override
            public void onWaitingResultat(Grille grille) {
                load_grille(grille);
                spinner.setVisibility(View.GONE);
            }
        });
    }


    private void bindView() {
        this.spinner = findViewById(R.id.progressBar1);
        spinner.setVisibility(View.GONE);


        this.gridView = findViewById(R.id.gridview);

        Grille current_grille = this.sharedP.getCurrentGrille();
        if (current_grille != null /*&& current_grille.getId_grille() != 0*/) {
            //Load current Grille
            load_grille(current_grille);
        } else if (this.sharedP.getModeApi().equals("0")) {
            //Mode without API
            Grille grille = get_grille(0);
            this.sharedP.setCurrentGrille(grille);
            load_grille(grille);
        } else if (this.sharedP.getModeApi().equals("1")) {
            //Mode with API
            get_grille_via_api();
        } else {
            //Problem
            report_firebase(IFBEvent.CRASH_EVENT, IFBEvent.BIND_KENVIEW_KEY, IFBEvent.BIND_KENVIEW_KO_VALUE);
        }

        this.raz_btn = findViewById(R.id.raz_btn);
        this.raz_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                raz();
            }
        });

        this.new_game_btn = findViewById(R.id.new_game_btn);
        this.new_game_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new_game();
            }
        });

        this.help_btn = findViewById(R.id.help_btn);
        this.help_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                help();
            }
        });


        this.clear_box_btn = findViewById(R.id.clear_box_btn);
        this.clear_box_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear_box();
            }
        });

        this.mode_crayon = findViewById(R.id.mode_crayon);
        if (this.sharedP.getModeEdition().equals(getString(R.string.edition_crayon))) {
            this.mode_crayon.setChecked(true);
        }
        this.mode_crayon.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                change_edition_mode(isChecked);
            }
        });

        this.btn1 = findViewById(R.id.btn1);
        this.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_click(1);
            }
        });

        this.btn2 = findViewById(R.id.btn2);
        this.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_click(2);
            }
        });

        this.btn3 = findViewById(R.id.btn3);
        this.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_click(3);
            }
        });

        this.btn4 = findViewById(R.id.btn4);
        this.btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_click(4);
            }
        });

        this.btn5 = findViewById(R.id.btn5);
        this.btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_click(5);
            }
        });

        this.btn6 = findViewById(R.id.btn6);
        this.btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_click(6);
            }
        });
    }

    public void change_edition_mode(boolean flag) {
        this.sharedP.setModeEdition(flag);
        Grille current_grille = this.sharedP.getCurrentGrille();
        if(current_grille.getBlocks() != null) {
            if (!flag) {
                for (Block block : current_grille.getBlocks()) {
                    block.setSelected(false);
                }
            }

            load_grille(current_grille);
            this.blockAdapter.notifyDataSetChanged();
        }
        report_firebase(IFBEvent.CLIC_EVENT, IFBEvent.CHECKBOX_KEY, "mode_crayon_chkbx");
    }

    public void btn_click(int i) {
        if(sharedP.getModeEdition()!= null) {
            if(sharedP.getModeEdition().equals(getString(R.string.edition_crayon))) {
                sharedP.setLastCrayonSaisieIsNumber("1");
            }
        }
/*        if(sharedP.getLastCrayonSaisieIsNumber() != null) {
            LogUtils.log("LastCrayonSaisieIsNum", sharedP.getLastCrayonSaisieIsNumber());
        }*/

        //LogUtils.log("btn click", String.valueOf(i));
        Grille current_grille = this.sharedP.getCurrentGrille();
        int id_block = 0;
        int tmp = 0;
        for (Block block : current_grille.getBlocks()) {
            if (block.isSelected()) {
                if (sharedP.getModeEdition().equals(getString(R.string.edition_stylo))) {
                    block.setCrayon("");
                    block.setCurrent_value(i);
                    block.setStylo(String.valueOf(i));
                    id_block = tmp;
                } else if (sharedP.getModeEdition().equals(getString(R.string.edition_crayon))) {
                    block.setCurrent_value(0);
                    switch (i) {
                        case 1:
                            block.setC1_selected(!block.isC1_selected());
                            break;
                        case 2:
                            block.setC2_selected(!block.isC2_selected());
                            break;
                        case 3:
                            block.setC3_selected(!block.isC3_selected());
                            break;
                        case 4:
                            block.setC4_selected(!block.isC4_selected());
                            break;
                        case 5:
                            block.setC5_selected(!block.isC5_selected());
                            break;
                        case 6:
                            block.setC6_selected(!block.isC6_selected());
                            break;
                    }

                    block.setCrayon(crayon_formated_string(block));
                } else {
                    report_firebase(IFBEvent.CRASH_EVENT, IFBEvent.MODE_EDITION_BTN_CLICK_KEY, IFBEvent.MODE_EDITION_KO_VALUE);
                }
            }
            tmp++;
        }

        if (sharedP.getModeEdition().equals(getString(R.string.edition_stylo))) {
            tmp = 0;
            for (Block block : current_grille.getBlocks()) {
                boolean modif = false;
                if (tmp % 6 == id_block % 6 && tmp != id_block) {
                    modif = true;
                }

                if ((tmp - (tmp % 6)) == (id_block - id_block % 6) && tmp != id_block) {
                    modif = true;
                }

                if (modif) {
                    switch (i) {
                        case 1:
                            block.setC1_selected(false);
                            break;
                        case 2:
                            block.setC2_selected(false);
                            break;
                        case 3:
                            block.setC3_selected(false);
                            break;
                        case 4:
                            block.setC4_selected(false);
                            break;
                        case 5:
                            block.setC5_selected(false);
                            break;
                        case 6:
                            block.setC6_selected(false);
                            break;
                    }

                    String tmp_str = "";
                    if(block.getStylo()!=null) {
                        tmp_str = block.getStylo();
                    }
                    if( tmp_str.equals("")) {
                        block.setCrayon(crayon_formated_string(block));
                    }
                }

                tmp++;
            }
        }

        load_grille(current_grille);
        this.blockAdapter.notifyDataSetChanged();

        String value = "keyboard_btn_" + String.valueOf(i);
        report_firebase(IFBEvent.CLIC_EVENT, IFBEvent.BUTTON_KEY, value);

        check_grille();
    }

    public String crayon_formated_string(Block block) {
        String crayon = "";
        if (block.isC1_selected()) {
            crayon = crayon + "1 ";
        } else {
            crayon = crayon + "  ";
        }
        if (block.isC2_selected()) {
            crayon = crayon + "2 ";
        } else {
            crayon = crayon + "  ";
        }
        if (block.isC3_selected()) {
            crayon = crayon + "3 ";
        } else {
            crayon = crayon + "  ";
        }
        if (block.isC4_selected()) {
            crayon = crayon + "4 ";
        } else {
            crayon = crayon + "  ";
        }
        if (block.isC5_selected()) {
            crayon = crayon + "5 ";
        } else {
            crayon = crayon + "  ";
        }
        if (block.isC6_selected()) {
            crayon = crayon + "6 ";
        } else {
            crayon = crayon + "  ";
        }

        return crayon;
    }

    public void clear_box() {
        report_firebase(IFBEvent.CLIC_EVENT, IFBEvent.BUTTON_KEY, "clear_box_btn");

        Grille grille = this.sharedP.getCurrentGrille();
        for (Block block : grille.getBlocks()) {
            if(block.isSelected()) {
                block.setCurrent_value(0);
                block.setStylo("");
                block.setCrayon("");
                block.setC1_selected(false);
                block.setC2_selected(false);
                block.setC3_selected(false);
                block.setC4_selected(false);
                block.setC5_selected(false);
                block.setC6_selected(false);
            }
        }

        load_grille(grille);
        this.blockAdapter.notifyDataSetChanged();
    }

    public void help() {
        int bloc_ok = 0;
        Integer i = 0;
        boolean help_impossible = false;
        ArrayList<Integer> bloc_non_trouve = new ArrayList<>();
        Grille grille = this.sharedP.getCurrentGrille();
        for (Block block : grille.getBlocks()) {

            if (block.getCurrent_value() == block.getGood_value()) {
                bloc_ok++;
            } else {
                bloc_non_trouve.add(i);
            }
            i++;
        }
        if (bloc_ok == 36) {
            help_impossible = true;
        }

        if (!help_impossible) {
            int size_nf = bloc_non_trouve.size();
            //LogUtils.log("tab non trouve size_nf", "size_nf : " + size_nf);

            Random r = new Random();
            int id_bloc = r.nextInt(size_nf);
            //LogUtils.log("tab non trouve", "id_bloc : " + id_bloc);
            //LogUtils.log("tab non trouve", "val get : " + bloc_non_trouve.get(id_bloc));
            Block blk_to_help = grille.getBlocks().get(bloc_non_trouve.get(id_bloc));
            blk_to_help.setCurrent_value(blk_to_help.getGood_value());
            blk_to_help.setStylo(String.valueOf(blk_to_help.getGood_value()));
            blk_to_help.setCrayon("");
            blk_to_help.setSelected(false);

            load_grille(grille);
            this.blockAdapter.notifyDataSetChanged();

            report_firebase(IFBEvent.CLIC_EVENT, IFBEvent.BUTTON_KEY, "help_btn");

            check_grille();
        }
    }


    private void raz() {
        FragmentManager fm = getSupportFragmentManager();
        if(fm != null) {
            fm.beginTransaction().commit();
            AlertFragment alertFragment = AlertFragment.newInstance(getString(R.string.raz_btn_label), getString(R.string.raz_btn_desc), true, new ResultatCallback<String>() {
                @Override
                public void onWaitingResultat(String result) {
                    do_raz();
                }
            });

            alertFragment.show(fm, "dialog_fragment");
        }
    }

    private void do_raz() {
        Grille grille = this.sharedP.getCurrentGrille(); //mode virtuel
        if(grille != null) {
            if (grille.getBlocks() != null) {
                for (Block block : grille.getBlocks()) {
                    block.setCurrent_value(0);
                    block.setStylo("");
                    block.setCrayon("");
                    block.setC1_selected(false);
                    block.setC2_selected(false);
                    block.setC3_selected(false);
                    block.setC4_selected(false);
                    block.setC5_selected(false);
                    block.setC6_selected(false);
                }

                this.win = false;

                this.sharedP.setModeEdition(false);
                this.mode_crayon.setChecked(false);

                load_grille(grille);
                this.blockAdapter.notifyDataSetChanged();
            }
        }
        report_firebase(IFBEvent.CLIC_EVENT, IFBEvent.BUTTON_KEY, "raz_btn");
    }

    private void new_game() {
        FragmentManager fm = getSupportFragmentManager();
        if(fm != null) {
            fm.beginTransaction().commit();
            AlertFragment alertFragment = AlertFragment.newInstance(getString(R.string.new_game_btn_label), getString(R.string.new_game_btn_desc), true, new ResultatCallback<String>() {
                @Override
                public void onWaitingResultat(String result) {
                    do_new_game();
                }
            });

            alertFragment.show(fm, "new_game_dialog");
        }
    }

    private void do_new_game() {
        //get nouvelle grille ET sauvegarde abandon en base via api
        this.win = false;
        if (this.sharedP.getModeApi().equals("0")) {
            Grille grille = get_grille(1);
            this.blockAdapter = new BlockAdapter(this, grille);
            gridView.setAdapter(this.blockAdapter);
            this.blockAdapter.notifyDataSetChanged();
        } else if (this.sharedP.getModeApi().equals("1")) {
            get_grille_via_api();
        }

        report_firebase(IFBEvent.CLIC_EVENT, IFBEvent.BUTTON_KEY, "new_game_btn");
    }


    private void check_grille() {
        //LogUtils.log("check_grille win", String.valueOf(this.win));
        if (!this.win) {
            //Integer i = 0;
            Integer good = 0;
            Grille grille = this.sharedP.getCurrentGrille(); //mode virtuel
            for (Block block : grille.getBlocks()) {
                //i++;
                //LogUtils.log("block_current_value", i+" : "+block.getCurrent_value());
                //LogUtils.log("block_good_value", i+" : "+block.getGood_value());
                if (block.getCurrent_value() == block.getGood_value()) {
                    good++;
                }
            }
            LogUtils.log("nb bloc bon : ", String.valueOf(good));
            if (good == 36) {
                this.win = true;
                //LogUtils.log("victory", "C'est la victoire !");
                notify_victory();
                save_victory_via_api();
            }
        }
    }


    private void notify_victory() {
        FragmentManager fm = getSupportFragmentManager();
        if(fm != null) {
            fm.beginTransaction().commit();
            Grille grille = this.sharedP.getCurrentGrille();
            AlertFragment alertFragment = AlertFragment.newInstance(getString(R.string.win_message_title), getString(R.string.win_message_desc).replace("XYZ", grille.getPercent_victory()), false, new ResultatCallback<String>() {
                @Override
                public void onWaitingResultat(String result) {

                }
            });

            alertFragment.show(fm, "notify_victory_dialog");
        }
    }


    private void save_victory_via_api() {
        //sauvegarde victoire en base via api
        API api = new API();
        api.updKenGame(this.sharedP.getUserId(), this.id_grille, 1, new ResultatCallback<RetourUpdate>() {
            @Override
            public void onWaitingResultat(RetourUpdate result) {
                if (!result.getStatus().equals("OK")) {
                    report_firebase(IFBEvent.CLIC_EVENT, IFBEvent.CHECKBOX_KEY, "mode_crayon_chkbx");
                }
            }
        });
    }

    public void report_firebase(String event, String key, String value) {
        new FBevent(this, event, key, value);
    }

}
