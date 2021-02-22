package settings;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.testng.annotations.BeforeMethod;

public abstract class DriverSet {

    //todo why chromedrivermanager?
    //todo why beforemethod?
    //todo add browser settings: added resolution settings, headless
    @BeforeMethod
    public void beforeClass() {
        ChromeDriverManager.firefoxdriver().setup();
   }
}