package com.example.ci_test;

import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void shape ()
    {
        Espresso.onView(ViewMatchers.withId(R.id.shape)).perform(typeText("square"));
        Espresso.onView(ViewMatchers.withId(R.id.a)).perform(typeText("10"),closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withId(R.id.shapebutton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.area)).check(ViewAssertions.matches(ViewMatchers.withText("100.0")));
        Espresso.onView(ViewMatchers.withId(R.id.peri)).check(ViewAssertions.matches(ViewMatchers.withText("40.0")));
    }
}
