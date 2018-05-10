package com.qaforpeople.locators.platforms;

import com.qaforpeople.locators.interfaces.InputFieldsBlockLocators;
import org.openqa.selenium.By;

public class WebInputFieldsBlockLocators implements InputFieldsBlockLocators {


    public By nameLabel() {
        return By.className("label_name");
    }

    public By nameInputText() {
        return By.id("input__name");
    }
}
