package com.qaforpeople.locators.platforms;

import com.qaforpeople.locators.interfaces.SecondPageLocators;
import org.openqa.selenium.By;

public class WebSecondPageLocators implements SecondPageLocators {

    public By aboutText() {
        return By.id("about");
    }
}
