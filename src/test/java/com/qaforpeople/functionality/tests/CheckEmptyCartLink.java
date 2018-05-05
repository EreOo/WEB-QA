package com.qaforpeople.functionality.tests;

import com.qaforpeople.base.BaseTest;
import org.testng.annotations.Test;

public class CheckEmptyCartLink extends BaseTest {

    @Test
    public void emptyCartLink() {
        openSite()
                .clickRegionButtonYes()
                .checkEmptyCartLink();
    }

}
