package com.qaforpeople.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Author Vladimir S
 */
public class MainPage {
    private static final By SECOND_PAGE_BUTTON_LOCATOR = By.id("go_second");

    public SecondPage clickRedirectToSecondPageButton() {
        $(SECOND_PAGE_BUTTON_LOCATOR).click();
        return new SecondPage();
    }
}
