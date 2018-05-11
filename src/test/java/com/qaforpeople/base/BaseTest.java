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
        //It's localhost - but jenkins in container and it need your local ip
        Configuration.remote = "http://169.254.173.3:4444/wd/hub";
    }

//    TODO delete it.
    /**
     * Selenide has shutdown driver method but I have issue:
     * Browsers don't close and CPU're working 100% after few test runs.
     */
    @AfterTest
    public void closeDriver() {
        getWebDriver().close();
    }
}
