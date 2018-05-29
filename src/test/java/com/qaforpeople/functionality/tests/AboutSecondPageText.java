package com.qaforpeople.functionality.tests;

import com.qaforpeople.base.BaseTest;

public class AboutSecondPageText extends BaseTest {
    private static final String TEXT = "This is second test page \"SecondPage\". First test page is \"MainPage\". This is a test page filled with common HTML elements. Feel free to practice create your auto-tests.";


    public void checkAboutSecondPageText() {
        openSite()
                .clickRedirectToSecondButton()
                .checkAboutText(TEXT);
    }

}
