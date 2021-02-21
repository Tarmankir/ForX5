package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideUse {

    @Test
    void selenideUse() {
        open("https://forum.awd.ru/");
        $(By.cssSelector("#site-description > h1 > a")).shouldHave(Condition.text("Форум Винского"));
    }
}