package com.qaforpeople.pages;


import com.qaforpeople.pages.blocks.CatalogMenuBlock;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/**
 * Author Vladimir S
 */
public class MainPage {

    public CatalogMenuBlock getCatalogMenuBlock() {
        return new CatalogMenuBlock();
    }

    public MainPage inputSearch(String query) {
        $(By.cssSelector("#header-search > div > form > div > input")).setValue(query);
        return this;
    }

    public MainPage clickSearchButton() {
        $(By.cssSelector("#header-search > div > form > div > span.input-group-btn > button")).click();
        return this;
    }

    public MainPage clickRegionButtonYes() {
        $(By.cssSelector("#header-top > div > div.navbar-left.navbar-header.navbar-menu > ul > li.header-menu-city > div > a.btn.btn-additional")).click();
        return this;
    }

    public MainPage checkNoSearchResultsMessage(String s) {
        String noResultText = String.format("К сожалению, по запросу «%s» мы ничего не смогли найти.", s);
        $(By.id("empty-search-results")).shouldHave(text(noResultText));
        return this;
    }

}
