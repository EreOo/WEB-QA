package com.qaforpeople.base;

import com.codeborne.selenide.Configuration;
import com.qaforpeople.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

/**
 * Author Vladimir S
 */
public class BaseTest {

    private static final String SITE_URL = "https://ereoo.github.io/main-page";
    WebDriver driver;

    protected MainPage openSite() {
        selectBrowser();
        open(SITE_URL);
        return new MainPage();
    }

    /**
     * set property "browser" from pom.xml
     */


    private void selectBrowser() {
//        DesiredCapabilities capabillities = DesiredCapabilities.chrome();
//        capabillities.setCapability("platform", Platform.WINDOWS);
//        capabillities.setCapability("name", "Testing Selenium-2 Remote WebDriver");
//
//        try {
//            driver = new RemoteWebDriver(new URL("http://192.168.1.155:4444/wd/hub"), capabillities);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().window().setPosition(new Point(220, 10));
//        driver.manage().window().setSize(new Dimension(1000, 650));
        Configuration.browser = System.getProperty("browser");
        Configuration.remote = "http://192.168.1.155:4444/wd/hub";
        System.setProperty("platform.env", "pc");
    }

    @AfterTest
    public void c() {
        close();
    }
}


