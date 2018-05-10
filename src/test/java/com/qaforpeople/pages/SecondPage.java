package com.qaforpeople.pages;

import com.qaforpeople.base.BasePage;
import com.qaforpeople.locators.LocatorsService;
import com.qaforpeople.locators.interfaces.SecondPageLocators;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SecondPage extends BasePage {

    public SecondPageLocators locator() {
        return LocatorsService.TEXT_PAGE_LOCATORS;
    }

    public SecondPage checkAboutText(String text) {
        $(locator().aboutText()).shouldHave(text(text));
        return this;
    }
}
