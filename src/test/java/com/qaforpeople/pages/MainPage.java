package com.qaforpeople.pages;


import com.qaforpeople.base.BasePage;
import com.qaforpeople.locators.LocatorsService;
import com.qaforpeople.locators.interfaces.MainPageLocators;
import com.qaforpeople.pages.blocks.mainpage.InputFieldsBlock;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/**
 * Author Vladimir S
 */
public class MainPage extends BasePage {

    public MainPageLocators locator() {
        System.out.println("!!!!!!!!!!____________MAIN P LOCATOR CREATE__________!!!!!!!!!!!!!!");
        return LocatorsService.MAIN_PAGE_LOCATORS;
    }

    public InputFieldsBlock getInputFieldsBlock() {
        $(locator().inputFieldsBlock()).scrollTo();
        return new InputFieldsBlock();
    }

    public SecondPage clickRedirectToSecondButton() {
        $(locator().redirectButton()).click();
        return new SecondPage();
    }

    public MainPage checkAboutText(String text) {
        System.out.println("!!!!!!!!!!____________MAIN PAGE CREATE__________!!!!!!!!!!!!!!");
        $(locator().aboutText()).shouldHave(text(text));
        return this;
    }

}
