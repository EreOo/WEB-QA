package com.qaforpeople.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/**
 * Author Vladimir S
 */
public class MainPage {

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

    public MainPage checkMenuLaptopAndTablet() {
        $(By.cssSelector("#menu-catalog > li:nth-child(1) > a > span.title")).shouldHave(text("Ноутбуки и планшеты"));
        return this;
    }

    public MainPage checkPcAndStuff() {
        $(By.cssSelector("#menu-catalog > li:nth-child(2) > a > span.title")).shouldHave(text("Компьютеры и периферия"));
        return this;
    }

    public MainPage checkPcAccessories() {
        $(By.cssSelector("#menu-catalog > li:nth-child(3) > a > span.title")).shouldHave(text("Комплектующие для ПК"));
        return this;
    }

    public MainPage checkPhones() {
        $(By.cssSelector("#menu-catalog > li:nth-child(4) > a > span.title")).shouldHave(text("Смартфоны и смарт-часы"));
        return this;
    }

    public MainPage checkTv() {
        $(By.cssSelector("#menu-catalog > li:nth-child(5) > a > span.title")).shouldHave(text("Телевизоры и медиа"));
        return this;
    }

    public MainPage checkGames() {
        $(By.cssSelector("#menu-catalog > li:nth-child(6) > a > span.title")).shouldHave(text("Игры и приставки"));
        return this;
    }

    public MainPage checkAudio() {
        $(By.cssSelector("#menu-catalog > li:nth-child(7) > a > span.title")).shouldHave(text("Аудиотехника"));
        return this;
    }

    public MainPage checkPhoto() {
        $(By.cssSelector("#menu-catalog > li:nth-child(8) > a > span.title")).shouldHave(text("Фото-видеоаппаратура"));
        return this;
    }

    public MainPage checkOffice() {
        $(By.cssSelector("#menu-catalog > li:nth-child(9) > a > span.title")).shouldHave(text("Офисная техника и мебель"));
        return this;
    }

    public MainPage checkNet() {
        $(By.cssSelector("#menu-catalog > li:nth-child(10) > a > span.title")).shouldHave(text("Сетевое оборудование"));
        return this;
    }
}
