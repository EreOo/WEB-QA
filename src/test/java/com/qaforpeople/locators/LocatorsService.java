package com.qaforpeople.locators;

import com.qaforpeople.locators.interfaces.MainPageLocators;
import com.qaforpeople.locators.platforms.MobileMainPageLocators;
import com.qaforpeople.locators.platforms.WebMainPageLocators;

/**
 * logic of choosing a locator depending on the platform
 * When need new page - add new public final static var. (and create AnotherPageLocators interface).
 */
public class LocatorsService {

    public final static MainPageLocators MAIN_PAGE_LOCATORS = System.getProperty("platform.env").equals("pc") ? new WebMainPageLocators() : new MobileMainPageLocators();

    /* Example
     public final static MainPageLocators ANOTHER_PAGE_LOCATORS = System.getProperty("platform.env").equals("pc") ? new WebAnotherPageLocators() : new MobileAnotherPageLocators();
    */
}
