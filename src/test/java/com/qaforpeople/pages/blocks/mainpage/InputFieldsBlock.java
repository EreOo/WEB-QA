package com.qaforpeople.pages.blocks.mainpage;

import com.qaforpeople.base.BasePage;
import com.qaforpeople.locators.LocatorsService;
import com.qaforpeople.locators.interfaces.InputFieldsBlockLocators;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class InputFieldsBlock extends BasePage {

    public InputFieldsBlockLocators locator() {
        return LocatorsService.INPUT_FIELDS_BLOCK_LOCATORS;
    }

    public InputFieldsBlock checkNameLabelText() {
        $(locator().nameLabel()).shouldHave(text("Name"));
        return this;
    }

    public InputFieldsBlock checkNameInputText() {
        Assert.assertEquals($(locator().nameInputText()).getAttribute("placeholder"), ("Name Input"));
        return this;
    }
}
