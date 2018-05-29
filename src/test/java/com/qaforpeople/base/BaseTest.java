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

    private static final String SITE_URL = "https://ereoo.github.io/main-page";

    protected MainPage openSite() {
        selectBrowser();
        open(SITE_URL);
        return new MainPage();
    }

    /**
     * set property "browser" from pom.xml
     */
    private void selectBrowser() {
        Configuration.browser = "chrome";
        Configuration.remote = "http://192.168.1.155:4444/wd/hub";
    }

    @AfterTest
    private void close() {
        getWebDriver().close();
    }
}
