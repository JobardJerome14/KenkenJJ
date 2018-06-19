package com.real.first.sandoken.ui;


import android.support.test.espresso.DataInteraction;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import com.real.first.sandoken.R;
import com.real.first.sandoken.ui.MainActivity;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;


@LargeTest
@RunWith(AndroidJUnit4.class)
public class UITest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void remplissageStyloGrilleTest() {

        ViewInteraction appCompatButton = onView(withId(R.id.welcome_btn));
        appCompatButton.perform(click());

        sleep_ws();

        ViewInteraction raz = onView(withId(R.id.raz_btn));
        raz.perform(click());
        sleep();

        ViewInteraction choice_ok = onView(withId(android.R.id.button1));
        choice_ok.perform(click());


        DataInteraction gridview = onData(anything())
                .inAdapterView(withId(R.id.gridview));

        ViewInteraction btn1 = onView(withId(R.id.btn1));
        ViewInteraction btn2 = onView(withId(R.id.btn2));
        ViewInteraction btn3 = onView(withId(R.id.btn3));
        ViewInteraction btn4 = onView(withId(R.id.btn4));
        ViewInteraction btn5 = onView(withId(R.id.btn5));
        ViewInteraction btn6 = onView(withId(R.id.btn6));

        //1ere ligne
        gridview.atPosition(0).perform(click());
        btn1.perform(click());
        sleep();

        gridview.atPosition(1).perform(click());
        btn2.perform(click());
        sleep();

        gridview.atPosition(2).perform(click());
        btn3.perform(click());
        sleep();

        gridview.atPosition(3).perform(click());
        btn4.perform(click());
        sleep();

        gridview.atPosition(4).perform(click());
        btn5.perform(click());
        sleep();

        gridview.atPosition(5).perform(click());
        btn6.perform(click());
        sleep();

        //2eme ligne
        gridview.atPosition(6).perform(click());
        btn2.perform(click());
        sleep();

        gridview.atPosition(7).perform(click());
        btn3.perform(click());
        sleep();

        gridview.atPosition(8).perform(click());
        btn4.perform(click());
        sleep();

        gridview.atPosition(9).perform(click());
        btn5.perform(click());
        sleep();

        gridview.atPosition(10).perform(click());
        btn6.perform(click());
        sleep();

        gridview.atPosition(11).perform(click());
        btn1.perform(click());
        sleep();

        //3eme ligne
        gridview.atPosition(12).perform(click());
        btn3.perform(click());
        sleep();

        gridview.atPosition(13).perform(click());
        btn4.perform(click());
        sleep();

        gridview.atPosition(14).perform(click());
        btn5.perform(click());
        sleep();

        gridview.atPosition(15).perform(click());
        btn6.perform(click());
        sleep();

        gridview.atPosition(16).perform(click());
        btn1.perform(click());
        sleep();

        gridview.atPosition(17).perform(click());
        btn2.perform(click());
        sleep();

        //4eme ligne
        gridview.atPosition(18).perform(click());
        btn4.perform(click());
        sleep();

        gridview.atPosition(19).perform(click());
        btn5.perform(click());
        sleep();

        gridview.atPosition(20).perform(click());
        btn6.perform(click());
        sleep();

        gridview.atPosition(21).perform(click());
        btn1.perform(click());
        sleep();

        gridview.atPosition(22).perform(click());
        btn2.perform(click());
        sleep();

        gridview.atPosition(23).perform(click());
        btn3.perform(click());
        sleep();

        //5eme ligne
        gridview.atPosition(24).perform(click());
        btn5.perform(click());
        sleep();

        gridview.atPosition(25).perform(click());
        btn6.perform(click());
        sleep();

        gridview.atPosition(26).perform(click());
        btn1.perform(click());
        sleep();

        gridview.atPosition(27).perform(click());
        btn2.perform(click());
        sleep();

        gridview.atPosition(28).perform(click());
        btn3.perform(click());
        sleep();

        gridview.atPosition(29).perform(click());
        btn4.perform(click());
        sleep();

        //6eme ligne
        gridview.atPosition(30).perform(click());
        btn6.perform(click());
        sleep();

        gridview.atPosition(31).perform(click());
        btn1.perform(click());
        sleep();

        gridview.atPosition(32).perform(click());
        btn2.perform(click());
        sleep();

        gridview.atPosition(33).perform(click());
        btn3.perform(click());
        sleep();

        gridview.atPosition(34).perform(click());
        btn4.perform(click());
        sleep();

        gridview.atPosition(35).perform(click());
        btn5.perform(click());
        sleep();


        gridview.atPosition(0).onChildView(withId(R.id.stylo)).check(matches(withText("1")));
        gridview.atPosition(1).onChildView(withId(R.id.stylo)).check(matches(withText("2")));
        gridview.atPosition(2).onChildView(withId(R.id.stylo)).check(matches(withText("3")));
        gridview.atPosition(3).onChildView(withId(R.id.stylo)).check(matches(withText("4")));
        gridview.atPosition(4).onChildView(withId(R.id.stylo)).check(matches(withText("5")));
        gridview.atPosition(5).onChildView(withId(R.id.stylo)).check(matches(withText("6")));

        gridview.atPosition(6).onChildView(withId(R.id.stylo)).check(matches(withText("2")));
        gridview.atPosition(7).onChildView(withId(R.id.stylo)).check(matches(withText("3")));
        gridview.atPosition(8).onChildView(withId(R.id.stylo)).check(matches(withText("4")));
        gridview.atPosition(9).onChildView(withId(R.id.stylo)).check(matches(withText("5")));
        gridview.atPosition(10).onChildView(withId(R.id.stylo)).check(matches(withText("6")));
        gridview.atPosition(11).onChildView(withId(R.id.stylo)).check(matches(withText("1")));

        gridview.atPosition(12).onChildView(withId(R.id.stylo)).check(matches(withText("3")));
        gridview.atPosition(13).onChildView(withId(R.id.stylo)).check(matches(withText("4")));
        gridview.atPosition(14).onChildView(withId(R.id.stylo)).check(matches(withText("5")));
        gridview.atPosition(15).onChildView(withId(R.id.stylo)).check(matches(withText("6")));
        gridview.atPosition(16).onChildView(withId(R.id.stylo)).check(matches(withText("1")));
        gridview.atPosition(17).onChildView(withId(R.id.stylo)).check(matches(withText("2")));

        gridview.atPosition(18).onChildView(withId(R.id.stylo)).check(matches(withText("4")));
        gridview.atPosition(19).onChildView(withId(R.id.stylo)).check(matches(withText("5")));
        gridview.atPosition(20).onChildView(withId(R.id.stylo)).check(matches(withText("6")));
        gridview.atPosition(21).onChildView(withId(R.id.stylo)).check(matches(withText("1")));
        gridview.atPosition(22).onChildView(withId(R.id.stylo)).check(matches(withText("2")));
        gridview.atPosition(23).onChildView(withId(R.id.stylo)).check(matches(withText("3")));

        gridview.atPosition(24).onChildView(withId(R.id.stylo)).check(matches(withText("5")));
        gridview.atPosition(25).onChildView(withId(R.id.stylo)).check(matches(withText("6")));
        gridview.atPosition(26).onChildView(withId(R.id.stylo)).check(matches(withText("1")));
        gridview.atPosition(27).onChildView(withId(R.id.stylo)).check(matches(withText("2")));
        gridview.atPosition(28).onChildView(withId(R.id.stylo)).check(matches(withText("3")));
        gridview.atPosition(29).onChildView(withId(R.id.stylo)).check(matches(withText("4")));

        gridview.atPosition(30).onChildView(withId(R.id.stylo)).check(matches(withText("6")));
        gridview.atPosition(31).onChildView(withId(R.id.stylo)).check(matches(withText("1")));
        gridview.atPosition(32).onChildView(withId(R.id.stylo)).check(matches(withText("2")));
        gridview.atPosition(33).onChildView(withId(R.id.stylo)).check(matches(withText("3")));
        gridview.atPosition(34).onChildView(withId(R.id.stylo)).check(matches(withText("4")));
        gridview.atPosition(35).onChildView(withId(R.id.stylo)).check(matches(withText("5")));
    }


    @Test
    public void remplissageFirstBlockTest() {

        ViewInteraction appCompatButton = onView(withId(R.id.welcome_btn));
        appCompatButton.perform(click());

        sleep_ws();

        ViewInteraction raz = onView(withId(R.id.raz_btn));
        raz.perform(click());
        sleep();

        ViewInteraction choice_ok = onView(withId(android.R.id.button1));
        choice_ok.perform(click());


        DataInteraction gridview = onData(anything())
                .inAdapterView(withId(R.id.gridview));
        gridview.atPosition(0).perform(click());

        ViewInteraction btn1 = onView(withId(R.id.btn1));
        ViewInteraction btn2 = onView(withId(R.id.btn2));
        ViewInteraction btn3 = onView(withId(R.id.btn3));
        ViewInteraction btn4 = onView(withId(R.id.btn4));
        ViewInteraction btn5 = onView(withId(R.id.btn5));
        ViewInteraction btn6 = onView(withId(R.id.btn6));

        btn1.perform(click());
        sleep();
        btn2.perform(click());
        sleep();
        btn3.perform(click());
        sleep();
        btn4.perform(click());
        sleep();
        btn5.perform(click());
        sleep();
        btn6.perform(click());
        sleep();

        DataInteraction tv2 = gridview.atPosition(0).onChildView(withId(R.id.stylo));
        tv2.check(matches(withText("6")));
    }


    @Test
    public void show_game() {
        sleep();

        ViewInteraction appCompatButton = onView(withId(R.id.welcome_btn));
        appCompatButton.perform(click());

        sleep_ws();

        Espresso.pressBack();
    }


    @Test
    public void show_rules() {
        sleep();

        ViewInteraction appCompatButton = onView(withId(R.id.welcome_rules_btn));
        appCompatButton.perform(click());

        sleep();

        Espresso.pressBack();
    }


    @Test
    public void pencilModeTest() {
        sleep();

        ViewInteraction appCompatButton = onView(withId(R.id.welcome_btn));
        appCompatButton.perform(click());

        sleep_ws();

        ViewInteraction raz = onView(withId(R.id.raz_btn));
        raz.perform(click());
        sleep();

        ViewInteraction choice_ok = onView(withId(android.R.id.button1));
        choice_ok.perform(click());


        DataInteraction gridview = onData(anything())
                .inAdapterView(withId(R.id.gridview));

        ViewInteraction btn1 = onView(withId(R.id.btn1));
        ViewInteraction btn2 = onView(withId(R.id.btn2));
        ViewInteraction btn3 = onView(withId(R.id.btn3));
        ViewInteraction btn4 = onView(withId(R.id.btn4));
        ViewInteraction btn5 = onView(withId(R.id.btn5));
        ViewInteraction btn6 = onView(withId(R.id.btn6));



        ViewInteraction pencil_mode = onView(withId(R.id.mode_crayon)).check(matches(ViewMatchers.isNotChecked()));
        pencil_mode.perform(click());

        sleep();

        gridview.atPosition(0).perform(click());
        sleep();

        gridview.atPosition(35).perform(click());
        sleep();

        btn1.perform(click());
        sleep();
        btn2.perform(click());
        sleep();
        btn3.perform(click());
        sleep();
        btn4.perform(click());
        sleep();
        btn5.perform(click());
        sleep();
        btn6.perform(click());
        sleep();

        pencil_mode.perform(click());
        sleep();

        gridview.atPosition(5).perform(click());
        sleep();
        btn4.perform(click());
        sleep();


        gridview.atPosition(30).perform(click());
        sleep();
        btn2.perform(click());
        sleep();


        gridview.atPosition(5).onChildView(withId(R.id.stylo)).check(matches(withText("4")));
        gridview.atPosition(30).onChildView(withId(R.id.stylo)).check(matches(withText("2")));

        gridview.atPosition(0).onChildView(withId(R.id.crayon)).check(matches(withText("1   3   5 6 ")));
        gridview.atPosition(35).onChildView(withId(R.id.crayon)).check(matches(withText("1   3   5 6 ")));

    }


    @Test
    public void winTest() {

        sleep();

        ViewInteraction appCompatButton = onView(withId(R.id.welcome_btn));
        appCompatButton.perform(click());

        sleep_ws();

        ViewInteraction appCompatButton2 = onView(withId(R.id.new_game_btn));
        appCompatButton2.perform(click());

        sleep();

        ViewInteraction appCompatButton3 = onView(withId(android.R.id.button1));
        appCompatButton3.perform(click());

        sleep_ws();

        ViewInteraction appCompatButton4 = onView(withId(R.id.raz_btn));
        appCompatButton4.perform(click());

        sleep();

        ViewInteraction appCompatButton5 = onView(withId(android.R.id.button1));
        appCompatButton5.perform(click());

        sleep();

        ViewInteraction appCompatButton6 = onView(withId(R.id.help_btn));
        appCompatButton6.perform(click());
        sleep();

        ViewInteraction appCompatButton7 = onView(withId(R.id.help_btn));
        appCompatButton7.perform(click());
        sleep();

        ViewInteraction appCompatButton8 = onView(withId(R.id.help_btn));
        appCompatButton8.perform(click());
        sleep();

        ViewInteraction appCompatButton9 = onView(withId(R.id.help_btn));
        appCompatButton9.perform(click());
        sleep();

        ViewInteraction appCompatButton10 = onView(withId(R.id.help_btn));
        appCompatButton10.perform(click());
        sleep();

        ViewInteraction appCompatButton11 = onView(withId(R.id.help_btn));
        appCompatButton11.perform(click());
        sleep();

        ViewInteraction appCompatButton12 = onView(withId(R.id.help_btn));
        appCompatButton12.perform(click());
        sleep();

        ViewInteraction appCompatButton13 = onView(withId(R.id.help_btn));
        appCompatButton13.perform(click());
        sleep();

        ViewInteraction appCompatButton14 = onView(withId(R.id.help_btn));
        appCompatButton14.perform(click());
        sleep();

        ViewInteraction appCompatButton15 = onView(withId(R.id.help_btn));
        appCompatButton15.perform(click());
        sleep();

        ViewInteraction appCompatButton16 = onView(withId(R.id.help_btn));
        appCompatButton16.perform(click());
        sleep();

        ViewInteraction appCompatButton17 = onView(withId(R.id.help_btn));
        appCompatButton17.perform(click());
        sleep();

        ViewInteraction appCompatButton18 = onView(withId(R.id.help_btn));
        appCompatButton18.perform(click());
        sleep();

        ViewInteraction appCompatButton19 = onView(withId(R.id.help_btn));
        appCompatButton19.perform(click());
        sleep();

        ViewInteraction appCompatButton20 = onView(withId(R.id.help_btn));
        appCompatButton20.perform(click());
        sleep();

        ViewInteraction appCompatButton21 = onView(withId(R.id.help_btn));
        appCompatButton21.perform(click());
        sleep();

        ViewInteraction appCompatButton22 = onView(withId(R.id.help_btn));
        appCompatButton22.perform(click());
        sleep();

        ViewInteraction appCompatButton23 = onView(withId(R.id.help_btn));
        appCompatButton23.perform(click());
        sleep();

        ViewInteraction appCompatButton24 = onView(withId(R.id.help_btn));
        appCompatButton24.perform(click());
        sleep();

        ViewInteraction appCompatButton25 = onView(withId(R.id.help_btn));
        appCompatButton25.perform(click());
        sleep();

        ViewInteraction appCompatButton26 = onView(withId(R.id.help_btn));
        appCompatButton26.perform(click());
        sleep();

        ViewInteraction appCompatButton27 = onView(withId(R.id.help_btn));
        appCompatButton27.perform(click());
        sleep();

        ViewInteraction appCompatButton28 = onView(withId(R.id.help_btn));
        appCompatButton28.perform(click());
        sleep();

        ViewInteraction appCompatButton29 = onView(withId(R.id.help_btn));
        appCompatButton29.perform(click());
        sleep();

        ViewInteraction appCompatButton30 = onView(withId(R.id.help_btn));
        appCompatButton30.perform(click());
        sleep();

        ViewInteraction appCompatButton31 = onView(withId(R.id.help_btn));
        appCompatButton31.perform(click());
        sleep();

        ViewInteraction appCompatButton32 = onView(withId(R.id.help_btn));
        appCompatButton32.perform(click());
        sleep();

        ViewInteraction appCompatButton33 = onView(withId(R.id.help_btn));
        appCompatButton33.perform(click());
        sleep();

        ViewInteraction appCompatButton34 = onView(withId(R.id.help_btn));
        appCompatButton34.perform(click());
        sleep();

        ViewInteraction appCompatButton35 = onView(withId(R.id.help_btn));
        appCompatButton35.perform(click());
        sleep();

        ViewInteraction appCompatButton36 = onView(withId(R.id.help_btn));
        appCompatButton36.perform(click());
        sleep();

        ViewInteraction appCompatButton37 = onView(withId(R.id.help_btn));
        appCompatButton37.perform(click());
        sleep();

        ViewInteraction appCompatButton38 = onView(withId(R.id.help_btn));
        appCompatButton38.perform(click());
        sleep();

        ViewInteraction appCompatButton39 = onView(withId(R.id.help_btn));
        appCompatButton39.perform(click());
        sleep();

        ViewInteraction appCompatButton40 = onView(withId(R.id.help_btn));
        appCompatButton40.perform(click());
        sleep();

        ViewInteraction appCompatButton41 = onView(withId(R.id.help_btn));
        appCompatButton41.perform(click());
        sleep();

        ViewInteraction appCompatButton42 = onView(withId(android.R.id.button1));
        appCompatButton42.perform(click());
        sleep();

        pressBack();

        sleep();
    }


    @Test
    public void navigationTest() {
        ViewInteraction button = onView(
                allOf(withId(R.id.welcome_btn),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        button.check(matches(isDisplayed()));

        ViewInteraction button2 = onView(
                allOf(withId(R.id.welcome_rules_btn),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        button2.check(matches(isDisplayed()));

        ViewInteraction button3 = onView(
                allOf(withId(R.id.stats_btn),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        button3.check(matches(isDisplayed()));

        ViewInteraction button4 = onView(
                allOf(withId(R.id.welcome_btn),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        button4.check(matches(isDisplayed()));



        ViewInteraction appCompatButton = onView(withId(R.id.stats_btn));
        appCompatButton.perform(click());

        sleep();

        pressBack();

        sleep();

        ViewInteraction appCompatButton2 = onView(withId(R.id.welcome_rules_btn));
        appCompatButton2.perform(click());

        sleep();

        pressBack();

        sleep();

        ViewInteraction appCompatButton3 = onView(withId(R.id.welcome_btn));
        appCompatButton3.perform(click());

        sleep_ws();

        pressBack();

    }


    @Test
    public void dialogFragmentTest() {

        ViewInteraction appCompatButton = onView(withId(R.id.welcome_btn));
        appCompatButton.perform(click());

        sleep_ws();

        ViewInteraction raz = onView(withId(R.id.raz_btn));
        raz.perform(click());

        sleep();

        ViewInteraction choice_ok = onView(withId(android.R.id.button1));
        choice_ok.perform(click());

        sleep();

        DataInteraction gridview = onData(anything())
                .inAdapterView(withId(R.id.gridview));

        sleep();

        gridview.atPosition(4).perform(click());

        ViewInteraction btn2 = onView(withId(R.id.btn2));
        ViewInteraction btn6 = onView(withId(R.id.btn6));


        btn6.perform(click());
        sleep();

        ViewInteraction appCompatCheckBox = onView(withId(R.id.mode_crayon));
        appCompatCheckBox.perform(click());
        sleep();

        gridview.atPosition(25).perform(click());
        sleep();

        btn2.perform(click());
        sleep();

        sleep();

        ViewInteraction appCompatButton5 = onView(withId(R.id.raz_btn));
        appCompatButton5.perform(click());

        sleep();

        ViewInteraction appCompatButton6 = onView(withId(android.R.id.button2));
        appCompatButton6.perform(click());

        sleep();

        //Check no clear grid
        gridview.atPosition(4).onChildView(withId(R.id.stylo)).check(matches(withText("6")));
        gridview.atPosition(25).onChildView(withId(R.id.crayon)).check(matches(withText("  2         ")));

        ViewInteraction appCompatButton7 = onView(withId(R.id.raz_btn));
        appCompatButton7.perform(click());

        sleep();

        ViewInteraction appCompatButton8 = onView(withId(android.R.id.button1));
        appCompatButton8.perform(click());

        sleep();

        //Check clear grid
        gridview.atPosition(4).onChildView(withId(R.id.stylo)).check(matches(withText("")));
        gridview.atPosition(25).onChildView(withId(R.id.crayon)).check(matches(withText("")));

        ViewInteraction appCompatButton9 = onView(withId(R.id.new_game_btn));
        appCompatButton9.perform(click());

        sleep();

        ViewInteraction appCompatButton10 = onView(withId(android.R.id.button2));
        appCompatButton10.perform(click());

        sleep();

        ViewInteraction appCompatButton11 = onView(withId(R.id.new_game_btn));
        appCompatButton11.perform(click());

        sleep();

        ViewInteraction appCompatButton12 = onView(withId(android.R.id.button1));
        appCompatButton12.perform(click());
        sleep_ws();
    }


    @Test
    public void clearBoxTest() {
        sleep();

        ViewInteraction appCompatButton = onView(withId(R.id.welcome_btn));
        appCompatButton.perform(click());

        sleep_ws();

        ViewInteraction raz = onView(withId(R.id.raz_btn));
        raz.perform(click());
        sleep();

        ViewInteraction choice_ok = onView(withId(android.R.id.button1));
        choice_ok.perform(click());


        DataInteraction gridview = onData(anything())
                .inAdapterView(withId(R.id.gridview));

        ViewInteraction btn1 = onView(withId(R.id.btn1));
        ViewInteraction btn2 = onView(withId(R.id.btn2));
        ViewInteraction btn3 = onView(withId(R.id.btn3));
        ViewInteraction btn4 = onView(withId(R.id.btn4));
        ViewInteraction btn5 = onView(withId(R.id.btn5));
        ViewInteraction btn6 = onView(withId(R.id.btn6));



        ViewInteraction pencil_mode = onView(withId(R.id.mode_crayon)).check(matches(ViewMatchers.isNotChecked()));
        pencil_mode.perform(click());

        sleep();

        gridview.atPosition(17).perform(click());
        sleep();

        btn1.perform(click());
        sleep();
        btn2.perform(click());
        sleep();
        btn3.perform(click());
        sleep();
        btn4.perform(click());
        sleep();
        btn5.perform(click());
        sleep();
        btn6.perform(click());
        sleep();

        pencil_mode.perform(click());
        sleep();

        gridview.atPosition(9).perform(click());
        sleep();
        btn6.perform(click());
        sleep();

        gridview.atPosition(9).onChildView(withId(R.id.stylo)).check(matches(withText("6")));
        gridview.atPosition(17).onChildView(withId(R.id.crayon)).check(matches(withText("1 2 3 4 5 6 ")));

        gridview.atPosition(25).perform(click());
        sleep();

        ViewInteraction clearboxBtn = onView(withId(R.id.clear_box_btn));
        clearboxBtn.perform(click());
        sleep();

        //Nothing cleared
        gridview.atPosition(9).onChildView(withId(R.id.stylo)).check(matches(withText("6")));
        gridview.atPosition(17).onChildView(withId(R.id.crayon)).check(matches(withText("1 2 3 4 5 6 ")));

        gridview.atPosition(9).perform(click());
        sleep();

        clearboxBtn.perform(click());
        sleep();

        //9 cleared , 17 still written
        gridview.atPosition(9).onChildView(withId(R.id.stylo)).check(matches(withText("")));
        gridview.atPosition(17).onChildView(withId(R.id.crayon)).check(matches(withText("1 2 3 4 5 6 ")));

        gridview.atPosition(17).perform(click());
        sleep();

        clearboxBtn.perform(click());
        sleep();

        //15 cleared , 17 still written
        gridview.atPosition(9).onChildView(withId(R.id.stylo)).check(matches(withText("")));
        gridview.atPosition(17).onChildView(withId(R.id.crayon)).check(matches(withText("")));
    }


    private void sleep(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private void sleep_ws(){
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
