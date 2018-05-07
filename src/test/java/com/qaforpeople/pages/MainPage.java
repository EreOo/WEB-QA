package com.qaforpeople.pages;


import com.qaforpeople.base.BasePage;
import com.qaforpeople.locators.LocatorsService;
import com.qaforpeople.locators.interfaces.MainPageLocators;
import com.qaforpeople.pages.blocks.CatalogMenuBlock;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/**
 * Author Vladimir S
 */
public class MainPage extends BasePage {

    public MainPageLocators locator() {
        return LocatorsService.MAIN_PAGE_LOCATORS;
    }

    public CatalogMenuBlock getCatalogMenuBlock() {
        return new CatalogMenuBlock();
    }

    public MainPage inputSearch(String query) {
        $(locator().searchTextField()).setValue(query);
        return this;
    }

    public SearchResultPage clickSearchButton() {
        $(locator().searchButton()).click();
        return new SearchResultPage();
    }

    public MainPage clickRegionButtonYes() {
        $(locator().regionButtonYes()).click();
        return this;
    }

    public MainPage checkEmptyCartLink() {
        Assert.assertEquals($(locator().emptyCart()).getAttribute("href"), "https://www.dns-shop.ru/order/begin/");
        return this;
    }
}
