package com.example.birthdaycard;

import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)

public class TestMainActivity {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void init() {
        mActivityTestRule.getActivity()
                .getSupportFragmentManager().beginTransaction();
    }

    @Test
    public void testingAwesomenessSameScreen(){

        onView(withId(R.id.button_same_screen)).perform(click());

        onView(withId(R.id.awesomeness_same_screen)).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));


    }
}
