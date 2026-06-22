package base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import utilities.ConfigReader;
import listeners.TestListener;

@Listeners(TestListener.class)
public class BaseTest {

    @Parameters("browser")
    @BeforeMethod
    public void setup(String browser) {

        DriverFactory.initDriver(browser);

        DriverFactory.getDriver()
                .get(ConfigReader.getProperty("url"));
    }
    

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}