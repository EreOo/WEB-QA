import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class OurFirstTest {

    @BeforeTest
    private void settings() {
        Configuration.browser = "chrome";
    }

    @Test
    public void checkSecondPageAboutText() {
        open("https://ereoo.github.io/main-page");
        $(By.id("go_second")).click();
        $(By.id("about")).shouldHave(text("This is second test page \"SecondPage\". First test page is \"MainPage\". This is a test page filled with common HTML elements. Feel free to practice create your auto-tests."));
    }

    @AfterTest
    private void close() {
        getWebDriver().close();
    }
}
