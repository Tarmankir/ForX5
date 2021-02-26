package pages;

import com.codeborne.selenide.SelenideElement;
import enums.Credentials;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class SelenideUse {

    @FindBy(css = "#username")
    private SelenideElement loginen;

    @FindBy(css = "#password")
    private SelenideElement passen;

    @FindBy(css = ".button1")
    private SelenideElement button;

    }