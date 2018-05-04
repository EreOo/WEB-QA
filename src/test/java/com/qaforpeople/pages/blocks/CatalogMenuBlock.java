package com.qaforpeople.pages.blocks;

import com.qaforpeople.base.BasePage;
import com.qaforpeople.locators.LocatorsService;
import com.qaforpeople.locators.interfaces.CatalogMenuBlockLocators;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CatalogMenuBlock extends BasePage {

    public CatalogMenuBlockLocators locator() {
        return LocatorsService.CATALOG_MENU_BLOCK_LOCATORS;
    }

    public CatalogMenuBlock checkMenuLaptopAndTablet() {
        $(locator().LaptopAndTablet()).shouldHave(text("Ноутбуки и планшеты"));
        return this;
    }

    public CatalogMenuBlock checkPcAndStuff() {
        $(locator().pcAndStuff()).shouldHave(text("Компьютеры и периферия"));
        return this;
    }

    public CatalogMenuBlock checkPcAccessories() {
        $(locator().pcAccessories()).shouldHave(text("Комплектующие для ПК"));
        return this;
    }

    public CatalogMenuBlock checkPhones() {
        $(locator().phones()).shouldHave(text("Смартфоны и смарт-часы"));
        return this;
    }

    public CatalogMenuBlock checkTv() {
        $(locator().tv()).shouldHave(text("Телевизоры и медиа"));
        return this;
    }

    public CatalogMenuBlock checkGames() {
        $(locator().games()).shouldHave(text("Игры и приставки"));
        return this;
    }

    public CatalogMenuBlock checkAudio() {
        $(locator().audio()).shouldHave(text("Аудиотехника"));
        return this;
    }

    public CatalogMenuBlock checkPhoto() {
        $(locator().photo()).shouldHave(text("Фото-видеоаппаратура"));
        return this;
    }

    public CatalogMenuBlock checkOffice() {
        $(locator().office()).shouldHave(text("Офисная техника и мебель"));
        return this;
    }

    public CatalogMenuBlock checkNet() {
        $(locator().net()).shouldHave(text("Сетевое оборудование"));
        return this;
    }
}
