package com.qaforpeople.locators.platforms;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class MobileLocators {

    private static volatile MobileLocators instance;

    private MobileLocators() {

    }

    public static MobileLocators getInstance() {
        if (instance == null) {
            synchronized (MobileLocators.class) {
                if (instance == null) {
                    instance = new MobileLocators();
                }
            }
        }
        return instance;
    }

    public By searchButton() {
        return MobileBy.AndroidUIAutomator("");
    }

}
