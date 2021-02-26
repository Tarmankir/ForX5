package selenide;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideUseTest {

    @Test
    void selenideUse() {
        open("https://forum.awd.ru/ucp.php?mode=login&redirect=.%2Findex.php");
        $(By.cssSelector("#username")).setValue("IVakidov");
        $(By.cssSelector("#password")).setValue("School593@");
        $(By.cssSelector(".button1")).click();
        $(By.cssSelector("a[title='Выход [ IVakidov ]']")).shouldHave(Condition.text("Выход [ IVakidov ]"));
    }
}