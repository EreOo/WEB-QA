package com.qaforpeople.locators;

import com.qaforpeople.locators.platforms.MobileLocators;
import com.qaforpeople.locators.platforms.WebLocators;
import org.openqa.selenium.By;

public class Locator {
    private boolean isPc = System.getProperty("platform.env").equals("pc");

    public By searchButton() {
        if (isPc) {
            return WebLocators.getInstance().searchButton();
        } else {
            return MobileLocators.getInstance().searchButton();
        }
    }

}
