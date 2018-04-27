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

    private static final String SHOP_SITE = "https://www.dns-shop.ru/";

    protected MainPage openSite() {
        selectBrowser();
        open(SHOP_SITE);
        return new MainPage();
    }

    /**
     * set property "browser" from pom.xml
     */
    private void selectBrowser() {
        String browser = System.getProperty("browser");
        Configuration.browser = browser;
        System.setProperty("selenide.browser", browser);
    }

    @AfterTest
    public void close() {
        getWebDriver().close();
    }
}
