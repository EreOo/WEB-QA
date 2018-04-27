package com.qaforpeople.locators.platforms;


import com.qaforpeople.locators.interfaces.MainPageLocators;
import org.openqa.selenium.By;

public class WebMainPageLocators implements MainPageLocators {

    public By searchButton() {
        return By.cssSelector("#header-search > div > form > div > span.input-group-btn > button");
    }

    public By searchTextField() {
        return By.cssSelector("#header-search > div > form > div > input");
    }

    public By regionButtonYes() {
        return By.cssSelector("#header-top > div > div.navbar-left.navbar-header.navbar-menu > ul > li.header-menu-city > div > a.btn.btn-additional");
    }

    public By noResultMessage() {
        return By.id("empty-search-results");
    }
}
