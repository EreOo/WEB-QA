package com.qaforpeople.base;

import com.codeborne.selenide.Configuration;
import com.qaforpeople.pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

/**
 * Author Vladimir S
 */
public class BaseTest {

    public MainPage openSite() {
        selectChrome();
        open("https://www.dns-shop.ru/");
        return new MainPage();
    }

    private void selectChrome() {
        Configuration.browser = "chrome";
        System.setProperty("selenide.browser", "chrome");
    }
}
