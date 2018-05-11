package com.qaforpeople.base;

import com.codeborne.selenide.Configuration;
import com.qaforpeople.pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

/**
 * Author Vladimir S
 */
public class BaseTest {

    private static final String SITE_URL = "https://ereoo.github.io/main-page";

    protected MainPage openSite() {
        selectBrowser();
        open(SITE_URL);
        System.out.println("!!!!!!!!!!____________OPEN SITE__________!!!!!!!!!!!!!!");
        return new MainPage();
    }

    /**
     * set property "browser" from pom.xml
     */
    private void selectBrowser() {
        //It's localhost - but jenkins in container and it need your local ip
        Configuration.remote = "http://169.254.243.36:4444/wd/hub";
        Configuration.browser = System.getProperty("browser");
        System.setProperty("platform", "MAC");
    }

}
