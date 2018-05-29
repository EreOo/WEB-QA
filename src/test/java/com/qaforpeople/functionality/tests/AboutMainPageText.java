package com.qaforpeople.functionality.tests;

import com.qaforpeople.base.BaseTest;

public class AboutMainPageText extends BaseTest {
    private static final String TEXT = "This is fist test page \"MainPage\". Second test page is \"SecondPage\". This is a test page filled with common HTML elements. Feel free to practice create your auto-tests.";


    private void checkAboutMainPageText() {
        openSite()
                .checkAboutText(TEXT);
    }
}
