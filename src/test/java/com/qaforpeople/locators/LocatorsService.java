package com.qaforpeople.locators;

import com.qaforpeople.locators.interfaces.CatalogMenuBlockLocators;
import com.qaforpeople.locators.interfaces.MainPageLocators;
import com.qaforpeople.locators.interfaces.SearchResultPageLocators;
import com.qaforpeople.locators.platforms.MobileMainPageLocators;
import com.qaforpeople.locators.platforms.WebCatalogMenuBlockLocators;
import com.qaforpeople.locators.platforms.WebMainPageLocators;
import com.qaforpeople.locators.platforms.WebSearchResultPageLocators;

/**
 * logic of choosing a locator depending on the platform
 * When need new page - add new public final static var. (and create AnotherPageLocators interface).
 * Example
 public final static MainPageLocators ANOTHER_PAGE_LOCATORS = System.getProperty("platform.env").equals("pc") ? new WebAnotherPageLocators() : new MobileAnotherPageLocators();
 */
public class LocatorsService {

    public static final MainPageLocators MAIN_PAGE_LOCATORS = System.getProperty("platform.env")
            .equals("pc") ? new WebMainPageLocators() : new MobileMainPageLocators();
    public static final CatalogMenuBlockLocators CATALOG_MENU_BLOCK_LOCATORS = new WebCatalogMenuBlockLocators();
    public static final SearchResultPageLocators SEARCH_RESULT_PAGE_LOCATORS = new WebSearchResultPageLocators();
}
