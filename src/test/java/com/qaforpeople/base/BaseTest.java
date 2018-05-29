package com.qaforpeople.base;

import com.codeborne.selenide.Configuration;
import com.qaforpeople.pages.MainPage;
import org.testng.annotations.AfterTest;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

/**
 * Author Vladimir S
 */
public class BaseTest {

    private static final String SITE_URL = "https://ereoo.github.io/main-page";

    protected MainPage openSite() {
        selectBrowser();
        open(SITE_URL);
        return new MainPage();
    }

    /**
     * set property from pom.xml
     */
    private void selectBrowser() {
        Configuration.browser = System.getProperty("browser");
        Configuration.remote = System.getProperty("hub");
    }

    @AfterTest
    private void closeBrowser() {
        close();
    }
}
