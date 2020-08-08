package com.example.uitestespresso

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed

import androidx.test.rule.ActivityTestRule
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

//
//@RunWith(AndroidJUnit4::class)
class LoginActivityTest {

    // first we should launch activity by writing rule as below
    @get:Rule
//   val mainActivityTestRule = ActivityTestRule(MainActivity::class.java)
    var mActivityRule:ActivityTestRule<LoginActivity> = ActivityTestRule(LoginActivity::class.java)

    var name ="ali"
    var password = "1234567"

    @Before
    fun setUp() {
    }

    @Test
    fun testSuccessLogin(){
        onView(withId(R.id.edt_name)).perform(typeText(name))
        onView(withId(R.id.edt_password)).perform(typeText(password))
        closeSoftKeyboard()
        onView(withId(R.id.btn_login)).perform(click())
        onView(withId(R.id.txt_loginSuccess)).check(matches(isDisplayed()))
    }

    @Test
    fun testFailureLogin(){
        onView(withId(R.id.edt_name)).perform(typeText(""))
        onView(withId(R.id.edt_password)).perform(typeText("1234567"))
        closeSoftKeyboard()
        onView(withId(R.id.btn_login)).perform(click())
        onView(withId(R.id.txt_loginFailure)).check(matches(isDisplayed()))
    }


    @After
    fun tearDown() {
    }
}