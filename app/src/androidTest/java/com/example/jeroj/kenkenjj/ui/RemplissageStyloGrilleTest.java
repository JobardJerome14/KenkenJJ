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
public class RemplissageStyloGrilleTest {

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

    private void sleep(){
        try {
            Thread.sleep(1500);
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
