package com.qaforpeople.functionality.tests;

import com.qaforpeople.base.BaseTest;
import org.testng.annotations.Test;


/**
 * Author Vladimir S
 */
public class NoSearchResults extends BaseTest {

    private static final String ABOUT_TEXT = "This is second test page \"SecondPage\". First test page is \"MainPage\". This is a test page filled with common HTML elements. Feel free to practice create your auto-tests.";

    @Test
    public void checkSecondPageAboutText() {
        openSite()
                .clickRedirectToSecondPageButton()
                .checkAboutText(ABOUT_TEXT);
    }
}
