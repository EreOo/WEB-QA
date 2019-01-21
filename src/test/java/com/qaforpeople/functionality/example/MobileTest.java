package com.qaforpeople.functionality.example;

import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class MobileTest {

    @BeforeTest
    private void before() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        File app = new File("/Users/shekhavtsov/Desktop/bank.apk");
        caps.setCapability(MobileCapabilityType.APP, app);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
        WebDriverRunner.setWebDriver(driver);
    }

    @Test
    public void checkCity() {
        $(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"ru.alfabank.mobile.android:id/sign_up_demo\")")).click();
        $(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"ru.alfabank.mobile.android:id/all_payments_widget_payments\")")).click();
        $$(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"ru.alfabank.mobile.android:id/recipient_title\")")).get(0).click();
        $(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"ru.alfabank.mobile.android:id/amount_edit_text\")")).setValue("666777");
    }
}
