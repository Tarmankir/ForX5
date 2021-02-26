package loginPage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import settings.DriverSet;
import pages.LoginPage;
import java.io.IOException;
import static enums.Credentials.*;
import static org.openqa.selenium.support.PageFactory.initElements;
import static settings.Config.getSetting;

public class LoginPageTest extends DriverSet {

    //todo add mvn site
    //todo user ElementCollections in tests
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void driverSet() throws IOException {
        driver = new FirefoxDriver();
        driver.manage().window().setSize( new Dimension( 1280, 768 ) );
        loginPage = initElements(driver, LoginPage.class);
        driver.get(getSetting("baseUrl"));
    }

    @AfterMethod
    void afterMethod() {
        driver.close();
    }

    @Test
    public void loginPageTest() {
        loginPage.loginIn(TEST1);
        loginPage.clickLogin();
        loginPage.checkButtonExit("Выход [ IVakidov ]");
    }
}