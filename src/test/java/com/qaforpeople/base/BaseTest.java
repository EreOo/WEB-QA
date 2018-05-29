package com.qaforpeople.base;

import com.codeborne.selenide.Configuration;
import com.qaforpeople.pages.MainPage;
import org.testng.annotations.AfterSuite;

import static com.codeborne.selenide.Selenide.open;

/**
 * Author Vladimir S
 */
public class BaseTest {

    private static final String SITE_URL = "https://ereoo.github.io/main-page";

    protected MainPage openSite() {
        open(SITE_URL);
        return new MainPage();
    }

    /**
     * set property "browser" from pom.xml
     */
    @AfterSuite
    private void selectBrowser() {
        //It's localhost - but jenkins in container and it need your local ip
        Configuration.remote = "http://192.168.1.155:4444/wd/hub";
        Configuration.browser = System.getProperty("browser");
        System.setProperty("platform", "Windows");
    }
}
