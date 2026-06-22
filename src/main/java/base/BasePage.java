package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage() {

        driver = DriverFactory.getDriver();

        wait = new WebDriverWait(driver,
                Duration.ofSeconds(20));
    }

    public void click(By locator) {

        wait.until(ExpectedConditions
                .elementToBeClickable(locator))
                .click();
    }

    public void enterText(By locator,String value) {

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(locator))
                .sendKeys(value);
    }

    public String getText(By locator) {

        return wait.until(ExpectedConditions
                .visibilityOfElementLocated(locator))
                .getText();
    }
    
    public boolean isDisplayed(By locator) {
        try {
            return wait.until(
                    ExpectedConditions.visibilityOfElementLocated(locator))
                    .isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
