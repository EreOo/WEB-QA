package com.qaforpeople.functionality.tests;

import com.qaforpeople.base.BaseTest;
import org.testng.annotations.Test;

public class CheckCatalogMenu extends BaseTest {

    @Test
    private void catalogMenu() {
        openSite()
                .getCatalogMenuBlock()
                .checkMenuLaptopAndTablet()
                .checkPcAndStuff()
                .checkPcAccessories()
                .checkPhones()
                .checkTv()
                .checkGames()
                .checkAudio()
                .checkPhoto()
                .checkOffice()
                .checkNet();

    }
}
