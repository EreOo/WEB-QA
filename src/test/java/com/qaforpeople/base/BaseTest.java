package com.qaforpeople.base;

import com.codeborne.selenide.Configuration;
import com.qaforpeople.pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

/**
 * Author Vladimir S
 */
public class BaseTest {

    private static final String SHOP_SITE = "https://www.dns-shop.ru/";

    protected MainPage openSite() {
        selectChrome();
        open(SHOP_SITE);
        return new MainPage();
    }

    private void selectChrome() {
        Configuration.browser = "chrome";
        System.setProperty("selenide.browser", "chrome");
    }
}
