package com.qaforpeople.functionality.tests;

import com.qaforpeople.base.BaseTest;
import org.testng.annotations.Test;


/**
 * Author Vladimir S
 */
public class InputFieldsText extends BaseTest {

    @Test
    public void checkFieldsText() {
        openSite()
                .getInputFieldsBlock()
                .checkNameLabelText()
                .checkNameInputText();
    }
}
