package com.qaforpeople.locators.platforms;

import com.qaforpeople.locators.interfaces.SearchResultPageLocators;
import org.openqa.selenium.By;

public class WebSearchResultPageLocators implements SearchResultPageLocators {

    public By noResultMessage() {
        return By.id("empty-search-results");
    }
}
