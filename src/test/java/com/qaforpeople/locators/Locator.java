package com.qaforpeople.locators;

import com.qaforpeople.locators.interfaces.Locators;
import com.qaforpeople.locators.platforms.MobileLocators;
import com.qaforpeople.locators.platforms.WebLocators;

public class Locator {
    private boolean isPc = System.getProperty("platform.env").equals("pc");
    private Locators locatorInstance;

    protected Locators locator() {
        if (isPc) {
            return getWebLocators();
        } else {
            return getMobileLocators();
        }
    }

    private Locators getMobileLocators() {
        if (locatorInstance == null) {
            locatorInstance = new MobileLocators();
        }
        return locatorInstance;
    }

    private Locators getWebLocators() {
        if (locatorInstance == null) {
            locatorInstance = new WebLocators();
        }
        return locatorInstance;
    }

}
