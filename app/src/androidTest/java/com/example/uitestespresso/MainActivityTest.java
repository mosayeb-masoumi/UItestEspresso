package com.example.uitestespresso;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class MainActivityTest {

    // first we should launch activity by writing rule as below
    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    private String mName = "Tony";

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testUserInputScenario()
    {
        // input some text in the editTest
        Espresso.onView(withId(R.id.edt)).perform(typeText(mName));
        //close soft keyboard
        Espresso.closeSoftKeyboard();
        //perform button clicke
        Espresso.onView(withId(R.id.btn)).perform(click());
        // checking the text in the textView
        Espresso.onView(withId(R.id.txt)).check(matches(withText(mName)));

        Espresso.onView(withId(R.id.btn_next)).perform(click());

        // This view is in a different Activity, no need to tell Espresso.
        Espresso.onView(withId(R.id.txt_result)).check(matches(withText(mName)));
    }




    @After
    public void tearDown() throws Exception {
    }
}