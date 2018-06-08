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
public class RemplissageFirstBlockTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);



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
