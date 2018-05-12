package com.qaforpeople.base;

import com.codeborne.selenide.Configuration;
import com.qaforpeople.pages.MainPage;
import org.testng.annotations.AfterTest;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Author Vladimir S
 */
public class BaseTest {
    private static final String URL_SITE = "https://ereoo.github.io/main-page";

    public MainPage openSite() {
        selectChrome();
        open(URL_SITE);
        return new MainPage();
    }

    private void selectChrome() {
        Configuration.browser = "chrome";
    }

    @AfterTest
    public void close() {
        getWebDriver().close();
    }
}
