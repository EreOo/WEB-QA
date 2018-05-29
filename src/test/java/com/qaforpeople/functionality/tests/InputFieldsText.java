package com.qaforpeople.functionality.tests;

import com.qaforpeople.base.BaseTest;


/**
 * Author Vladimir S
 */
public class InputFieldsText extends BaseTest {


    public void checkFieldsText() {
        openSite()
                .getInputFieldsBlock()
                .checkNameLabelText()
                .checkNameInputText();
    }
}
