package com.qaforpeople.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/**
 * Author Vladimir S
 */
public class SecondPage {
    private static final By ABOUT_TEXT_LOCATOR = By.id("about");

    public SecondPage checkAboutText(String aboutText) {
        $(ABOUT_TEXT_LOCATOR).shouldHave(text(aboutText));
        return this;
    }
}
