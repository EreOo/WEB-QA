package com.qaforpeople.pages.blocks;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CatalogMenuBlock {

    public CatalogMenuBlock checkMenuLaptopAndTablet() {
        $(By.cssSelector("#menu-catalog > li:nth-child(1) > a > span.title")).shouldHave(text("Ноутбуки и планшеты"));
        return this;
    }

    public CatalogMenuBlock checkPcAndStuff() {
        $(By.cssSelector("#menu-catalog > li:nth-child(2) > a > span.title")).shouldHave(text("Компьютеры и периферия"));
        return this;
    }

    public CatalogMenuBlock checkPcAccessories() {
        $(By.cssSelector("#menu-catalog > li:nth-child(3) > a > span.title")).shouldHave(text("Комплектующие для ПК"));
        return this;
    }

    public CatalogMenuBlock checkPhones() {
        $(By.cssSelector("#menu-catalog > li:nth-child(4) > a > span.title")).shouldHave(text("Смартфоны и смарт-часы"));
        return this;
    }

    public CatalogMenuBlock checkTv() {
        $(By.cssSelector("#menu-catalog > li:nth-child(5) > a > span.title")).shouldHave(text("Телевизоры и медиа"));
        return this;
    }

    public CatalogMenuBlock checkGames() {
        $(By.cssSelector("#menu-catalog > li:nth-child(6) > a > span.title")).shouldHave(text("Игры и приставки"));
        return this;
    }

    public CatalogMenuBlock checkAudio() {
        $(By.cssSelector("#menu-catalog > li:nth-child(7) > a > span.title")).shouldHave(text("Аудиотехника"));
        return this;
    }

    public CatalogMenuBlock checkPhoto() {
        $(By.cssSelector("#menu-catalog > li:nth-child(8) > a > span.title")).shouldHave(text("Фото-видеоаппаратура"));
        return this;
    }

    public CatalogMenuBlock checkOffice() {
        $(By.cssSelector("#menu-catalog > li:nth-child(9) > a > span.title")).shouldHave(text("Офисная техника и мебель"));
        return this;
    }

    public CatalogMenuBlock checkNet() {
        $(By.cssSelector("#menu-catalog > li:nth-child(10) > a > span.title")).shouldHave(text("Сетевое оборудование"));
        return this;
    }
}
