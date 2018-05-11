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
        Configuration.browser = System.getProperty("browser");
        //TODO refactoring!
        Configuration.remote = "http://localhost:4444/wd/hub";
    }

    /**
     * Selenide has shutdown driver method but I have issue:
     * Browsers don't close and CPU're working 100% after few test runs.
     */
//    @AfterTest
//    public void closeDriver() {
//        getWebDriver().close();
//    }
}
