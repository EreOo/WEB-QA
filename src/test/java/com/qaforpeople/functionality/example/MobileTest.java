package com.qaforpeople.functionality.example;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.$;

public class MobileTest {
    
    private void before() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        File app = new File("C:/Users/Vladimir/Documents/DNSShop.apk");
        caps.setCapability(MobileCapabilityType.APP, app);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
    }


    public void checkCity() {
        $(MobileBy.AndroidUIAutomator("3455345")).click();
    }
}
