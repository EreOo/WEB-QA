package com.qaforpeople.pages;

import com.qaforpeople.base.BaseLocators;
import com.qaforpeople.base.BasePage;
import com.qaforpeople.locators.LocatorsService;
import com.qaforpeople.locators.interfaces.SearchResultPageLocators;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage extends BasePage {

    public SearchResultPageLocators locator() {
        return LocatorsService.SEARCH_RESULT_PAGE_LOCATORS;
    }

    public SearchResultPage checkNoSearchResultsMessage(String s) {
        String noResultText = String.format("К сожалению, по запросу «%s» мы ничего не смогли найти.", s);
        $(locator().noResultMessage()).shouldHave(text(noResultText));
        return this;
    }
}
