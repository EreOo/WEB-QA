package com.qaforpeople.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage {

    private static final By EMPTY_RESULT = By.id("empty-search-results");

    public SearchResultPage checkNoSearchResultsMessage(String query) {
        String noResultText = String.format("К сожалению, по запросу «%s» мы ничего не смогли найти.", query);
        $(EMPTY_RESULT).shouldHave(text(noResultText));
        return this;
    }
}
