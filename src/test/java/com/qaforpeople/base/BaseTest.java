package com.qaforpeople.base;

import com.codeborne.selenide.Configuration;
import com.qaforpeople.pages.MainPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Author Vladimir S
 */
public class BaseTest {

    private static final String SITE_URL = "https://ereoo.github.io/main-page";

    protected MainPage openSite() {
        open(SITE_URL);
        return new MainPage();
    }

    /**
     * set property "browser" from pom.xml
     */
    @BeforeSuite
    private void selectBrowser() {
        //It's localhost - but jenkins in container and it need your local ip
        Configuration.remote = "http://169.254.243.36:4444/wd/hub";
        Configuration.browser = "chrome";
        System.setProperty("platform", "MAC");
    }

}
