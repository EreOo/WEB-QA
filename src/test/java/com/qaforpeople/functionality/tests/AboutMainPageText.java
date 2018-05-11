package com.qaforpeople.functionality.tests;

import com.qaforpeople.base.BaseTest;
import org.testng.annotations.Test;

public class AboutMainPageText extends BaseTest {
    private static final String TEXT = "This is fist test page \"MainPage\". Second test page is \"SecondPage\". This is a test page filled with common HTML elements. Feel free to practice create your auto-tests.";

    @Test
    private void checkAboutMainPageText() {
        openSite()
                .checkAboutText(TEXT);
        System.out.println("!!!!!!!!!!____________TEST 1 END__________!!!!!!!!!!!!!!");

    }
}
