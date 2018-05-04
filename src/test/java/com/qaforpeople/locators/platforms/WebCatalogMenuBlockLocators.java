package com.qaforpeople.locators.platforms;

import com.qaforpeople.locators.interfaces.CatalogMenuBlockLocators;
import org.openqa.selenium.By;

public class WebCatalogMenuBlockLocators implements CatalogMenuBlockLocators {

    public By LaptopAndTablet() {
        return By.cssSelector("#menu-catalog > li:nth-child(1) > a > span.title");
    }

    public By pcAndStuff() {
        return By.cssSelector("#menu-catalog > li:nth-child(2) > a > span.title");
    }

    public By pcAccessories() {
        return By.cssSelector("#menu-catalog > li:nth-child(3) > a > span.title");
    }

    public By phones() {
        return By.cssSelector("#menu-catalog > li:nth-child(4) > a > span.title");
    }

    public By tv() {
        return By.cssSelector("#menu-catalog > li:nth-child(5) > a > span.title");
    }

    public By games() {
        return By.cssSelector("#menu-catalog > li:nth-child(6) > a > span.title");
    }

    public By audio() {
        return By.cssSelector("#menu-catalog > li:nth-child(7) > a > span.title");
    }

    public By photo() {
        return By.cssSelector("#menu-catalog > li:nth-child(8) > a > span.title");
    }

    public By office() {
        return By.cssSelector("#menu-catalog > li:nth-child(9) > a > span.title");
    }

    public By net() {
        return By.cssSelector("#menu-catalog > li:nth-child(10) > a > span.title");
    }
}
