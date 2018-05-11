package com.qaforpeople.locators;

import com.qaforpeople.locators.interfaces.InputFieldsBlockLocators;
import com.qaforpeople.locators.interfaces.MainPageLocators;
import com.qaforpeople.locators.interfaces.SecondPageLocators;
import com.qaforpeople.locators.platforms.MobileMainPageLocators;
import com.qaforpeople.locators.platforms.WebInputFieldsBlockLocators;
import com.qaforpeople.locators.platforms.WebMainPageLocators;
import com.qaforpeople.locators.platforms.WebSecondPageLocators;

/**
 * logic of choosing a locator depending on the platform
 * When need new page - add new public final static var. (and create AnotherPageLocators interface).
 * Example
 public final static MainPageLocators ANOTHER_PAGE_LOCATORS = System.getProperty("platform.env").equals("pc") ? new WebAnotherPageLocators() : new MobileAnotherPageLocators();
 */
public class LocatorsService {
    public static final MainPageLocators MAIN_PAGE_LOCATORS = System.getProperty("platform.env")
            .equals("pc") ? new WebMainPageLocators() : new MobileMainPageLocators();
    public static final InputFieldsBlockLocators INPUT_FIELDS_BLOCK_LOCATORS = new WebInputFieldsBlockLocators();
    public static final SecondPageLocators TEXT_PAGE_LOCATORS = new WebSecondPageLocators();

    private LocatorsService() {
    }
}
