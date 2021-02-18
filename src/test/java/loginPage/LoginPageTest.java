package loginPage;

import enums.Credentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import settings.DriverSet;
import pages.LoginPage;

import static org.openqa.selenium.support.PageFactory.initElements;

public class LoginPageTest extends DriverSet {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void driverSet() {
        driver = new FirefoxDriver();
        driver.get("https://forum.awd.ru/ucp.php?mode=login&redirect=.%2Findex.php");
        loginPage = initElements(driver, LoginPage.class);
    }

    @Test
    public void loginPageTest() {
        loginPage.loginIn(Credentials.TEST1);
        loginPage.clickLogin();
        loginPage.checkButtonExit("Выход [ IVakidov ]");
    }

    @AfterMethod
    void afterMethod() {
        driver.close();
    }
}