package com.qaforpeople.locators.platforms;


import com.qaforpeople.locators.interfaces.MainPageLocators;
import org.openqa.selenium.By;

public class WebMainPageLocators implements MainPageLocators {

    public By aboutText() {
        System.out.println("!!!!!!!!!!____________MAIN P LOCATOR SERVICE WORK__________!!!!!!!!!!!!!!");
        return By.className("about-text");
    }

    public By redirectButton() {
        return By.id("go_second");
    }

    public By inputFieldsBlock() {
        return By.id("forms_input");
    }
}
