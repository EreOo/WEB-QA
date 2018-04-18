package com.qaforpeople.locators.platforms;

import org.openqa.selenium.By;

public class WebLocators {
    private static volatile WebLocators instance;

    private WebLocators() {

    }

    public static WebLocators getInstance() {
        if (instance == null) {
            synchronized (WebLocators.class) {
                if (instance == null) {
                    instance = new WebLocators();
                }
            }
        }
        return instance;
    }

    public By searchButton() {
        return By.cssSelector("#header-search > div > form > div > span.input-group-btn > button");
    }
}
