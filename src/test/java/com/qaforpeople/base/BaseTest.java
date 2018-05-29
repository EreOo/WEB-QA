package com.qaforpeople.base;

import com.qaforpeople.pages.MainPage;
import org.openqa.selenium.WebDriver;

/**
 * Author Vladimir S
 */
public class BaseTest {

    private static final String SITE_URL = "https://ereoo.github.io/main-page";
    WebDriver driver;

    protected MainPage openSite() {

        driver.get(SITE_URL);
        return new MainPage();
    }

    /**
     * set property "browser" from pom.xml
     */
}


