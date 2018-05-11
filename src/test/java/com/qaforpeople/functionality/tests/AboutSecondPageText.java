package com.qaforpeople.functionality.tests;

import com.qaforpeople.base.BaseTest;
import org.testng.annotations.Test;

public class AboutSecondPageText extends BaseTest {
    private static final String TEXT = "This is second test page \"SecondPage\". First test page is \"MainPage\". This is a test page filled with common HTML elements. Feel free to practice create your auto-tests.";

    @Test
    public void checkAboutSecondPageText() {
        openSite()
                .clickRedirectToSecondButton()
                .checkAboutText(TEXT);
        System.out.println("!!!!!!!!!!____________TEST 2 END __________!!!!!!!!!!!!!!");
    }

}
