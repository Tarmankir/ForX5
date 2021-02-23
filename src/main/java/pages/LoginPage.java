package pages;

import com.codeborne.selenide.ElementsCollection;
import enums.Credentials;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {

    private WebDriver driver;

    //todo constructor after fields
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = "#username")
    private WebElement loginen;

    @FindBy(css = "#password")
    private WebElement passen;

    @FindBy(css = ".button1")
    private WebElement button;

    @FindBy(css = "")
    private ElementsCollection language;

    @Step("Login in application")
    public void loginIn(Credentials creds) {
        typeLogin(creds.login);
        typePass(creds.pass);
    }

    public void typeLogin(String login) {
        loginen.sendKeys(login);
    }

    public void typePass(String pass) {
        passen.sendKeys(pass);
    }

    @Step("Click on the Login button")
    public void clickLogin(){
        button.click();
    }

    //todo move up
    @FindBy(css = "a[title='Выход [ IVakidov ]']")
    private WebElement buttonExit;

    public void checkButtonExit(String text) {
        Assert.assertEquals(buttonExit.getText(), text);
    }
}