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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTestVictoire {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTestVictoire() {
        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.welcome_btn), withText("Jouer"),
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
            Thread.sleep(3582717);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction relativeLayout = onData(anything())
                .inAdapterView(allOf(withId(R.id.gridview),
                        childAtPosition(
                                withId(R.id.lin_grid),
                                0)))
                .atPosition(32);
        relativeLayout.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.btn3), withText("3"),
                        childAtPosition(
                                allOf(withId(R.id.btm_keyboard_view),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                2),
                        isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton3.perform(scrollTo(), click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton4.perform(scrollTo(), click());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton5.perform(scrollTo(), click());

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton6.perform(scrollTo(), click());

        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton7.perform(scrollTo(), click());

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton8.perform(scrollTo(), click());

        ViewInteraction appCompatButton9 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton9.perform(scrollTo(), click());

        ViewInteraction appCompatButton10 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton10.perform(scrollTo(), click());

        ViewInteraction appCompatButton11 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton11.perform(scrollTo(), click());

        ViewInteraction appCompatButton12 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton12.perform(scrollTo(), click());

        ViewInteraction appCompatButton13 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton13.perform(scrollTo(), click());

        ViewInteraction appCompatButton14 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton14.perform(scrollTo(), click());

        ViewInteraction appCompatButton15 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton15.perform(scrollTo(), click());

        ViewInteraction appCompatButton16 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton16.perform(scrollTo(), click());

        ViewInteraction appCompatButton17 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton17.perform(scrollTo(), click());

        ViewInteraction appCompatButton18 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton18.perform(scrollTo(), click());

        ViewInteraction appCompatButton19 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton19.perform(scrollTo(), click());

        ViewInteraction appCompatButton20 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton20.perform(scrollTo(), click());

        ViewInteraction appCompatButton21 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton21.perform(scrollTo(), click());

        ViewInteraction appCompatButton22 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton22.perform(scrollTo(), click());

        ViewInteraction appCompatButton23 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton23.perform(scrollTo(), click());

        ViewInteraction appCompatButton24 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton24.perform(scrollTo(), click());

        ViewInteraction appCompatButton25 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton25.perform(scrollTo(), click());

        ViewInteraction appCompatButton26 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton26.perform(scrollTo(), click());

        ViewInteraction appCompatButton27 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton27.perform(scrollTo(), click());

        ViewInteraction appCompatButton28 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton28.perform(scrollTo(), click());

        ViewInteraction appCompatButton29 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton29.perform(scrollTo(), click());

        ViewInteraction appCompatButton30 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton30.perform(scrollTo(), click());

        ViewInteraction appCompatButton31 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton31.perform(scrollTo(), click());

        ViewInteraction appCompatButton32 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton32.perform(scrollTo(), click());

        ViewInteraction appCompatButton33 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton33.perform(scrollTo(), click());

        ViewInteraction appCompatButton34 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton34.perform(scrollTo(), click());

        ViewInteraction appCompatButton35 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton35.perform(scrollTo(), click());

        ViewInteraction appCompatButton36 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton36.perform(scrollTo(), click());

        ViewInteraction appCompatButton37 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton37.perform(scrollTo(), click());

        ViewInteraction appCompatButton38 = onView(
                allOf(withId(R.id.help_btn), withText("Aide"),
                        childAtPosition(
                                allOf(withId(R.id.lin_btn_1),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                1)));
        appCompatButton38.perform(scrollTo(), click());

        ViewInteraction appCompatButton39 = onView(
                allOf(withId(android.R.id.button3), withText("OK"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                0)));
        appCompatButton39.perform(scrollTo(), click());

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
