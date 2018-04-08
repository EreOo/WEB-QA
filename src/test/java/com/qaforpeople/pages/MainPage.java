package com.qaforpeople.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Author Vladimir S
 */
public class MainPage {

    public MainPage inputSeearch(String query) {
        $(By.cssSelector("#header-search > div > form > div > input")).setValue(query);
        return this;
    }

    public MainPage clickSearchButton() {
        $(By.cssSelector("#header-search > div > form > div > span.input-group-btn > button")).click();
        return this;
    }

    public MainPage checkNoSearchResultsMessage() {
        $(By.cssSelector("#header-search > div > form > div > span.input-group-btn > button")).click();
        return this;
    }

}
