import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TEST {

    @BeforeTest
    public void settings() {
        Configuration.browser = "chrome";
        System.setProperty("selenide.browser", "chrome");
    }

    @Test
    public void test() {
        open("https://www.dns-shop.ru/");
        $(By.cssSelector("#header-search > div > form > div > input")).setValue("qweqwe");
        $(By.cssSelector("#header-search > div > form > div > span.input-group-btn > button")).click();
        $(By.id("empty-search-results")).shouldHave(text("К сожалению, по запросу «qweqwe» мы ничего не смогли найти."));
    }
}
