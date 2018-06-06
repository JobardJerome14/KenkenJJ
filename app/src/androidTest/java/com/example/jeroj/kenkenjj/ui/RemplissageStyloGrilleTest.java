package com.example.jeroj.kenkenjj.ui;


import android.support.test.espresso.DataInteraction;
import android.support.test.espresso.ViewInteraction;
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
public class RemplissageStyloGrilleTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    private int SLEEP_TIME = 750;

    @Test
    public void remplissageStyloGrilleTest() {
        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.welcome_btn), withText("Play"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(0);
        relativeLayout.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.btn1), withText("1"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton2.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout2 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(30);
        relativeLayout2.perform(click());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.btn2), withText("2"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                1),
                        isDisplayed()));
        appCompatButton3.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout3 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(35);
        relativeLayout3.perform(click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.btn3), withText("3"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                2),
                        isDisplayed()));
        appCompatButton4.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout4 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(5);
        relativeLayout4.perform(click());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.btn4), withText("4"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                3),
                        isDisplayed()));
        appCompatButton5.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout5 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(18);
        relativeLayout5.perform(click());

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(R.id.btn5), withText("5"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                4),
                        isDisplayed()));
        appCompatButton6.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout6 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(33);
        relativeLayout6.perform(click());

        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.btn6), withText("6"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                5),
                        isDisplayed()));
        appCompatButton7.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout7 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(17);
        relativeLayout7.perform(click());

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(R.id.btn1), withText("1"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton8.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout8 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(2);
        relativeLayout8.perform(click());

        ViewInteraction appCompatButton9 = onView(
                allOf(withId(R.id.btn2), withText("2"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                1),
                        isDisplayed()));
        appCompatButton9.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout9 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(13);
        relativeLayout9.perform(click());

        ViewInteraction appCompatButton10 = onView(
                allOf(withId(R.id.btn3), withText("3"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                2),
                        isDisplayed()));
        appCompatButton10.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout10 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(26);
        relativeLayout10.perform(click());

        ViewInteraction appCompatButton11 = onView(
                allOf(withId(R.id.btn4), withText("4"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                3),
                        isDisplayed()));
        appCompatButton11.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout11 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(22);
        relativeLayout11.perform(click());

        ViewInteraction appCompatButton12 = onView(
                allOf(withId(R.id.btn5), withText("5"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                4),
                        isDisplayed()));
        appCompatButton12.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout12 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(9);
        relativeLayout12.perform(click());

        ViewInteraction appCompatButton13 = onView(
                allOf(withId(R.id.btn6), withText("6"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                5),
                        isDisplayed()));
        appCompatButton13.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout13 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(20);
        relativeLayout13.perform(click());

        ViewInteraction appCompatButton14 = onView(
                allOf(withId(R.id.btn1), withText("1"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton14.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout14 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(21);
        relativeLayout14.perform(click());

        ViewInteraction appCompatButton15 = onView(
                allOf(withId(R.id.btn2), withText("2"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                1),
                        isDisplayed()));
        appCompatButton15.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout15 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(15);
        relativeLayout15.perform(click());

        ViewInteraction appCompatButton16 = onView(
                allOf(withId(R.id.btn3), withText("3"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                2),
                        isDisplayed()));
        appCompatButton16.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout16 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(14);
        relativeLayout16.perform(click());

        ViewInteraction appCompatButton17 = onView(
                allOf(withId(R.id.btn4), withText("4"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                3),
                        isDisplayed()));
        appCompatButton17.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout17 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(32);
        relativeLayout17.perform(click());

        ViewInteraction appCompatButton18 = onView(
                allOf(withId(R.id.btn5), withText("5"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                4),
                        isDisplayed()));
        appCompatButton18.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout18 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(29);
        relativeLayout18.perform(click());

        ViewInteraction appCompatButton19 = onView(
                allOf(withId(R.id.btn6), withText("6"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                5),
                        isDisplayed()));
        appCompatButton19.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout19 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(4);
        relativeLayout19.perform(click());

        ViewInteraction appCompatButton20 = onView(
                allOf(withId(R.id.btn3), withText("3"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                2),
                        isDisplayed()));
        appCompatButton20.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout20 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(6);
        relativeLayout20.perform(click());

        ViewInteraction appCompatButton21 = onView(
                allOf(withId(R.id.btn4), withText("4"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                3),
                        isDisplayed()));
        appCompatButton21.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout21 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(31);
        relativeLayout21.perform(click());

        ViewInteraction appCompatButton22 = onView(
                allOf(withId(R.id.btn4), withText("4"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                3),
                        isDisplayed()));
        appCompatButton22.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout22 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(28);
        relativeLayout22.perform(click());

        ViewInteraction appCompatButton23 = onView(
                allOf(withId(R.id.btn1), withText("1"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton23.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout23 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(3);
        relativeLayout23.perform(click());

        ViewInteraction appCompatButton24 = onView(
                allOf(withId(R.id.btn5), withText("5"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                4),
                        isDisplayed()));
        appCompatButton24.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout24 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(1);
        relativeLayout24.perform(click());

        ViewInteraction appCompatButton25 = onView(
                allOf(withId(R.id.btn6), withText("6"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                5),
                        isDisplayed()));
        appCompatButton25.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout25 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(8);
        relativeLayout25.perform(click());

        ViewInteraction appCompatButton26 = onView(
                allOf(withId(R.id.btn3), withText("3"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                2),
                        isDisplayed()));
        appCompatButton26.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout26 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(27);
        relativeLayout26.perform(click());

        ViewInteraction appCompatButton27 = onView(
                allOf(withId(R.id.btn4), withText("4"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                3),
                        isDisplayed()));
        appCompatButton27.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout27 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(34);
        relativeLayout27.perform(click());

        ViewInteraction appCompatButton28 = onView(
                allOf(withId(R.id.btn2), withText("2"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                1),
                        isDisplayed()));
        appCompatButton28.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout28 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(24);
        relativeLayout28.perform(click());

        ViewInteraction appCompatButton29 = onView(
                allOf(withId(R.id.btn3), withText("3"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                2),
                        isDisplayed()));
        appCompatButton29.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout29 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(12);
        relativeLayout29.perform(click());

        ViewInteraction appCompatButton30 = onView(
                allOf(withId(R.id.btn6), withText("6"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                5),
                        isDisplayed()));
        appCompatButton30.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout30 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(25);
        relativeLayout30.perform(click());

        ViewInteraction appCompatButton31 = onView(
                allOf(withId(R.id.btn5), withText("5"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                4),
                        isDisplayed()));
        appCompatButton31.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout31 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(19);
        relativeLayout31.perform(click());

        ViewInteraction appCompatButton32 = onView(
                allOf(withId(R.id.btn2), withText("2"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                1),
                        isDisplayed()));
        appCompatButton32.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout32 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(16);
        relativeLayout32.perform(click());

        ViewInteraction appCompatButton33 = onView(
                allOf(withId(R.id.btn1), withText("1"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton33.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout33 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(10);
        relativeLayout33.perform(click());

        ViewInteraction appCompatButton34 = onView(
                allOf(withId(R.id.btn2), withText("2"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                1),
                        isDisplayed()));
        appCompatButton34.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout34 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(11);
        relativeLayout34.perform(click());

        ViewInteraction appCompatButton35 = onView(
                allOf(withId(R.id.btn5), withText("5"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                4),
                        isDisplayed()));
        appCompatButton35.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout35 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(23);
        relativeLayout35.perform(click());

        ViewInteraction appCompatButton36 = onView(
                allOf(withId(R.id.btn2), withText("2"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                1),
                        isDisplayed()));
        appCompatButton36.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout36 = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(7);
        relativeLayout36.perform(click());

        ViewInteraction appCompatButton37 = onView(
                allOf(withId(R.id.btn1), withText("1"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton37.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction textView = onView(
                allOf(withId(R.id.stylo), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        2),
                                1),
                        isDisplayed()));
        textView.check(matches(withText("1")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.stylo), withText("4"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        2),
                                1),
                        isDisplayed()));
        textView2.check(matches(withText("4")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.stylo), withText("6"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        2),
                                1),
                        isDisplayed()));
        textView3.check(matches(withText("6")));

        ViewInteraction textView4 = onView(
                allOf(withId(R.id.stylo), withText("5"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        1),
                                1),
                        isDisplayed()));
        textView4.check(matches(withText("5")));

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.stylo), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        2),
                                1),
                        isDisplayed()));
        textView5.check(matches(withText("3")));

        ViewInteraction textView6 = onView(
                allOf(withId(R.id.stylo), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        2),
                                1),
                        isDisplayed()));
        textView6.check(matches(withText("2")));

        ViewInteraction textView7 = onView(
                allOf(withId(R.id.stylo), withText("6"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        2),
                                1),
                        isDisplayed()));
        textView7.check(matches(withText("6")));

        ViewInteraction textView8 = onView(
                allOf(withId(R.id.stylo), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        0),
                                1),
                        isDisplayed()));
        textView8.check(matches(withText("1")));

        ViewInteraction textView9 = onView(
                allOf(withId(R.id.stylo), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        2),
                                1),
                        isDisplayed()));
        textView9.check(matches(withText("3")));

        ViewInteraction textView10 = onView(
                allOf(withId(R.id.stylo), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        1),
                                1),
                        isDisplayed()));
        textView10.check(matches(withText("2")));

        ViewInteraction textView11 = onView(
                allOf(withId(R.id.stylo), withText("5"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        1),
                                1),
                        isDisplayed()));
        textView11.check(matches(withText("5")));

        ViewInteraction textView12 = onView(
                allOf(withId(R.id.stylo), withText("4"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        1),
                                1),
                        isDisplayed()));
        textView12.check(matches(withText("4")));

        ViewInteraction textView13 = onView(
                allOf(withId(R.id.stylo), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        2),
                                1),
                        isDisplayed()));
        textView13.check(matches(withText("2")));

        ViewInteraction textView14 = onView(
                allOf(withId(R.id.stylo), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        2),
                                1),
                        isDisplayed()));
        textView14.check(matches(withText("3")));

        ViewInteraction textView15 = onView(
                allOf(withId(R.id.stylo), withText("4"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        1),
                                1),
                        isDisplayed()));
        textView15.check(matches(withText("4")));

        ViewInteraction textView16 = onView(
                allOf(withId(R.id.stylo), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        1),
                                1),
                        isDisplayed()));
        textView16.check(matches(withText("1")));

        ViewInteraction textView17 = onView(
                allOf(withId(R.id.stylo), withText("4"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        2),
                                1),
                        isDisplayed()));
        textView17.check(matches(withText("4")));

        ViewInteraction textView18 = onView(
                allOf(withId(R.id.stylo), withText("5"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        2),
                                1),
                        isDisplayed()));
        textView18.check(matches(withText("5")));

        ViewInteraction textView19 = onView(
                allOf(withId(R.id.stylo), withText("5"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        1),
                                1),
                        isDisplayed()));
        textView19.check(matches(withText("5")));

        ViewInteraction textView20 = onView(
                allOf(withId(R.id.stylo), withText("6"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        1),
                                1),
                        isDisplayed()));
        textView20.check(matches(withText("6")));

        ViewInteraction textView21 = onView(
                allOf(withId(R.id.stylo), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        2),
                                1),
                        isDisplayed()));
        textView21.check(matches(withText("3")));

        ViewInteraction textView22 = onView(
                allOf(withId(R.id.stylo), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        1),
                                1),
                        isDisplayed()));
        textView22.check(matches(withText("2")));

        ViewInteraction textView23 = onView(
                allOf(withId(R.id.stylo), withText("4"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        1),
                                1),
                        isDisplayed()));
        textView23.check(matches(withText("4")));

        ViewInteraction textView24 = onView(
                allOf(withId(R.id.stylo), withText("6"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        1),
                                1),
                        isDisplayed()));
        textView24.check(matches(withText("6")));

        ViewInteraction textView25 = onView(
                allOf(withId(R.id.stylo), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        2),
                                1),
                        isDisplayed()));
        textView25.check(matches(withText("3")));

        ViewInteraction textView26 = onView(
                allOf(withId(R.id.stylo), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        1),
                                1),
                        isDisplayed()));
        textView26.check(matches(withText("2")));

        ViewInteraction textView27 = onView(
                allOf(withId(R.id.stylo), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        1),
                                1),
                        isDisplayed()));
        textView27.check(matches(withText("1")));

        ViewInteraction textView28 = onView(
                allOf(withId(R.id.stylo), withText("5"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        2),
                                1),
                        isDisplayed()));
        textView28.check(matches(withText("5")));

        ViewInteraction textView29 = onView(
                allOf(withId(R.id.stylo), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        1),
                                1),
                        isDisplayed()));
        textView29.check(matches(withText("1")));

        ViewInteraction textView30 = onView(
                allOf(withId(R.id.stylo), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        2),
                                1),
                        isDisplayed()));
        textView30.check(matches(withText("2")));

        ViewInteraction textView31 = onView(
                allOf(withId(R.id.stylo), withText("4"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        2),
                                1),
                        isDisplayed()));
        textView31.check(matches(withText("4")));

        ViewInteraction textView32 = onView(
                allOf(withId(R.id.stylo), withText("5"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        1),
                                1),
                        isDisplayed()));
        textView32.check(matches(withText("5")));

        ViewInteraction textView33 = onView(
                allOf(withId(R.id.stylo), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        1),
                                1),
                        isDisplayed()));
        textView33.check(matches(withText("1")));

        ViewInteraction textView34 = onView(
                allOf(withId(R.id.stylo), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        2),
                                1),
                        isDisplayed()));
        textView34.check(matches(withText("2")));

        ViewInteraction textView35 = onView(
                allOf(withId(R.id.stylo), withText("6"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        1),
                                1),
                        isDisplayed()));
        textView35.check(matches(withText("6")));

        ViewInteraction textView36 = onView(
                allOf(withId(R.id.stylo), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.block_id),
                                        1),
                                1),
                        isDisplayed()));
        textView36.check(matches(withText("3")));

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
