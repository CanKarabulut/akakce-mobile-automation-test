package mobileautomation.base;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;



public class BaseTest {

    public static AppiumDriver driver;

    @Given("User is on the Akakçe mobile app on the {string}")
    public void setUpDriver(String driverName) {
        if (driverName.equalsIgnoreCase("android"))
            driver = Drivers.ANDROID.browserConfigureOptions();
        else if (driverName.equalsIgnoreCase("ios"))
            driver = Drivers.IOS.browserConfigureOptions();
        else
            Assertions.fail("Invalid Environment");
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
