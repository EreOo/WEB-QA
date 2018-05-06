package com.qaforpeople.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Author Vladimir S
 */
public class MainPage {
    private static final By SEARCH_FIELD = By.cssSelector("#header-search > div > form > div > input");
    private static final By SEARCH_BUTTON = By.cssSelector("#header-search > div > form > div > span.input-group-btn > button");

    public MainPage inputSearch(String query) {
        $(SEARCH_FIELD).setValue(query);
        return this;
    }

    public SearchResultPage clickSearchButton() {
        $(SEARCH_BUTTON).click();
        return new SearchResultPage();
    }
}
