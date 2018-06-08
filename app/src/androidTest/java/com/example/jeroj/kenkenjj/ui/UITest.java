package com.example.jeroj.kenkenjj.ui;


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

import com.example.jeroj.kenkenjj.R;

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
import static android.support.test.espresso.action.ViewActions.scrollTo;

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

        sleep();

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.welcome_btn), withText("Play"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton.perform(click());

        sleep();

        ViewInteraction raz = onView(withId(R.id.raz_btn));
        raz.perform(click());
        sleep();

        ViewInteraction choice_ok = onView(withId(android.R.id.button1));
        choice_ok.perform(scrollTo(), click());


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

        sleep();

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.welcome_btn), withText("Play"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton.perform(click());

        sleep();

        ViewInteraction raz = onView(withId(R.id.raz_btn));
        raz.perform(click());
        sleep();

        ViewInteraction choice_ok = onView(withId(android.R.id.button1));
        choice_ok.perform(scrollTo(), click());


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

        sleep();

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

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.welcome_btn), withText("Play"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton.perform(click());

        sleep();

        ViewInteraction raz = onView(withId(R.id.raz_btn));
        raz.perform(click());
        sleep();

        ViewInteraction choice_ok = onView(withId(android.R.id.button1));
        choice_ok.perform(scrollTo(), click());


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

        int SLEEP_TIME = 1250;

        sleep();


        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.welcome_btn), withText("Play"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton.perform(click());

        sleep();


        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.new_game_btn), withText("New game"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_2),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                1)),
                                0)));
        appCompatButton2.perform(scrollTo(), click());

        sleep();


        ViewInteraction appCompatButton3 = onView(
                allOf(withId(android.R.id.button1), withText("OK"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                3)));
        appCompatButton3.perform(scrollTo(), click());

        sleep();


        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.raz_btn), withText("Clear the grid"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                0)));
        appCompatButton4.perform(scrollTo(), click());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(android.R.id.button1), withText("OK"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                3)));
        appCompatButton5.perform(scrollTo(), click());

        sleep();


        ViewInteraction appCompatButton6 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton6.perform(scrollTo(), click());

        sleep();


        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton7.perform(scrollTo(), click());

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton8.perform(scrollTo(), click());

        sleep();


        ViewInteraction appCompatButton9 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton9.perform(scrollTo(), click());

        sleep();


        ViewInteraction appCompatButton10 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton10.perform(scrollTo(), click());

        ViewInteraction appCompatButton11 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton11.perform(scrollTo(), click());

        ViewInteraction appCompatButton12 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton12.perform(scrollTo(), click());

        ViewInteraction appCompatButton13 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton13.perform(scrollTo(), click());

        sleep();


        ViewInteraction appCompatButton14 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton14.perform(scrollTo(), click());

        ViewInteraction appCompatButton15 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton15.perform(scrollTo(), click());

        ViewInteraction appCompatButton16 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton16.perform(scrollTo(), click());

        ViewInteraction appCompatButton17 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton17.perform(scrollTo(), click());

        sleep();


        ViewInteraction appCompatButton18 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton18.perform(scrollTo(), click());

        ViewInteraction appCompatButton19 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton19.perform(scrollTo(), click());

        ViewInteraction appCompatButton20 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton20.perform(scrollTo(), click());

        ViewInteraction appCompatButton21 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton21.perform(scrollTo(), click());

        ViewInteraction appCompatButton22 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton22.perform(scrollTo(), click());

        ViewInteraction appCompatButton23 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton23.perform(scrollTo(), click());

        ViewInteraction appCompatButton24 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton24.perform(scrollTo(), click());

        sleep();


        ViewInteraction appCompatButton25 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton25.perform(scrollTo(), click());

        ViewInteraction appCompatButton26 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton26.perform(scrollTo(), click());

        ViewInteraction appCompatButton27 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton27.perform(scrollTo(), click());

        ViewInteraction appCompatButton28 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton28.perform(scrollTo(), click());

        ViewInteraction appCompatButton29 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton29.perform(scrollTo(), click());

        ViewInteraction appCompatButton30 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton30.perform(scrollTo(), click());

        ViewInteraction appCompatButton31 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton31.perform(scrollTo(), click());

        sleep();


        ViewInteraction appCompatButton32 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton32.perform(scrollTo(), click());

        sleep();


        ViewInteraction appCompatButton33 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton33.perform(scrollTo(), click());

        sleep();


        ViewInteraction appCompatButton34 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton34.perform(scrollTo(), click());

        sleep();


        ViewInteraction appCompatButton35 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton35.perform(scrollTo(), click());

        sleep();


        ViewInteraction appCompatButton36 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton36.perform(scrollTo(), click());

        sleep();


        ViewInteraction appCompatButton37 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton37.perform(scrollTo(), click());

        sleep();


        ViewInteraction appCompatButton38 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton38.perform(scrollTo(), click());

        sleep();


        ViewInteraction appCompatButton39 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton39.perform(scrollTo(), click());

        sleep();


        ViewInteraction appCompatButton40 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton40.perform(scrollTo(), click());

        sleep();


        ViewInteraction appCompatButton41 = onView(
                allOf(withId(R.id.help_btn), withText("Help"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton41.perform(scrollTo(), click());

        sleep();


        ViewInteraction appCompatButton42 = onView(
                allOf(withId(android.R.id.button1), withText("OK"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                3)));
        appCompatButton42.perform(scrollTo(), click());

        pressBack();

        sleep();

    }


    @Test
    public void navigationTest() {
        sleep();


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

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.stats_btn), withText("Statistics"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton.perform(click());

        sleep();


        pressBack();

        sleep();


        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.welcome_rules_btn), withText("Rules"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton2.perform(click());

        sleep();


        pressBack();

        sleep();


        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.welcome_btn), withText("Play"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton3.perform(click());

        sleep();


        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.rules_btn), withText("Rules"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_2),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                1)),
                                1)));
        appCompatButton4.perform(scrollTo(), click());

        sleep();


        pressBack();

        sleep();


        pressBack();

    }


    @Test
    public void dialogFragmentTest() {

        sleep();

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.welcome_btn), withText("Play"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton.perform(click());

        sleep();

        ViewInteraction raz = onView(withId(R.id.raz_btn));
        raz.perform(click());
        sleep();

        ViewInteraction choice_ok = onView(withId(android.R.id.button1));
        choice_ok.perform(scrollTo(), click());


        DataInteraction gridview = onData(anything())
                .inAdapterView(withId(R.id.gridview));




        sleep();

        DataInteraction relativeLayout = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(4);
        relativeLayout.perform(click());

        sleep();


        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.btn6), withText("6"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                5),
                        isDisplayed()));
        appCompatButton3.perform(click());

        sleep();


        ViewInteraction appCompatCheckBox = onView(
                allOf(withId(R.id.mode_crayon), withText("Pencil mode"),
                        childAtPosition(
                                allOf(withId(R.id.lin_grid),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatCheckBox.perform(click());

        sleep();


        DataInteraction relativeLayout2 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(25);
        relativeLayout2.perform(click());

        sleep();

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.btn2), withText("2"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                1),
                        isDisplayed()));
        appCompatButton4.perform(click());

        sleep();


        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.raz_btn), withText("Clear the grid"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                0)));
        appCompatButton5.perform(scrollTo(), click());

        sleep();

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(android.R.id.button2), withText("Cancel"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                2)));
        appCompatButton6.perform(scrollTo(), click());

        sleep();

        //Check no clear grid
        gridview.atPosition(4).onChildView(withId(R.id.stylo)).check(matches(withText("6")));
        gridview.atPosition(25).onChildView(withId(R.id.crayon)).check(matches(withText("  2         ")));


        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.raz_btn), withText("Clear the grid"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                0)));
        appCompatButton7.perform(scrollTo(), click());

        sleep();

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(android.R.id.button1), withText("OK"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                3)));
        appCompatButton8.perform(scrollTo(), click());

        sleep();

        //Check clear grid
        gridview.atPosition(4).onChildView(withId(R.id.stylo)).check(matches(withText("")));
        gridview.atPosition(25).onChildView(withId(R.id.crayon)).check(matches(withText("")));

        ViewInteraction appCompatButton9 = onView(
                allOf(withId(R.id.new_game_btn), withText("New game"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_2),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                1)),
                                0)));
        appCompatButton9.perform(scrollTo(), click());

        sleep();

        ViewInteraction appCompatButton10 = onView(
                allOf(withId(android.R.id.button2), withText("Cancel"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                2)));
        appCompatButton10.perform(scrollTo(), click());

        sleep();

        ViewInteraction appCompatButton11 = onView(
                allOf(withId(R.id.new_game_btn), withText("New game"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_2),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                1)),
                                0)));
        appCompatButton11.perform(scrollTo(), click());

        sleep();

        ViewInteraction appCompatButton12 = onView(
                allOf(withId(android.R.id.button1), withText("OK"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                3)));
        appCompatButton12.perform(scrollTo(), click());

        sleep();


    }




    private void sleep(){
        try {
            Thread.sleep(777);
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
