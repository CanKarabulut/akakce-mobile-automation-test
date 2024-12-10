package mobileautomation.steps;

import io.appium.java_client.AppiumDriver;
import mobileautomation.base.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class BaseSteps {

    protected AppiumDriver appiumDriver;
    protected WebDriverWait wait;

    public BaseSteps() {
        this.appiumDriver = BaseTest.driver;
    }


    public WebElement findElement(By by) {
        wait = new WebDriverWait(appiumDriver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public List<WebElement> findElements(By by) {
        return appiumDriver.findElements(by);
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void clickElement(By by) {
        clickElement(findElement(by));
    }

    public void sendKeys(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void sendKeys(By by, String text) {
        findElement(by).clear();
        sendKeys(findElement(by), text);
    }

    public void forcedSendKeys(By by, String text) {
        Actions actions = new Actions(appiumDriver);
        actions.sendKeys(findElement(by), text).perform();
    }

    public boolean isDisplayed(By by) {
        try {
            findElement(by);
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public void sendEnter() {
        Actions actions = new Actions(appiumDriver);
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void sendEsc() {
        Actions actions = new Actions(appiumDriver);
        actions.sendKeys(Keys.ESCAPE).perform();
    }

    public By createXPathByText(String startWith, String text, String endWith) {
        By elementPath;
        if (startWith == null && endWith == null) {
            elementPath = By.xpath("//*[@text='" + text + "']");
        } else if (startWith == null) {
            elementPath = By.xpath("//*[@text='" + text + "']" + endWith);
        } else if (endWith == null) {
            elementPath = By.xpath(startWith + "[@text='" + text + "']");
        } else {
            elementPath = By.xpath(startWith + "[@text='" + text + "']" + endWith);
        }
        return elementPath;
    }

    public void ifStatusBooleanClickElement(boolean condition, By by) {
        if (condition)
            clickElement(by);
    }

    public void scrollByElementHeight(WebElement scrollArea, WebElement firstElement, String direction) {
        Rectangle rectangle = scrollArea.getRect();
        int fromY = rectangle.getY();
        int fromX = rectangle.getX();
        int toY = 0;

        int height = firstElement.getSize().getHeight();
        if (direction.equals("down")) {
            toY = fromY + height;
        } else if (direction.equals("up")) {
            toY = fromY - height;
        }

        appiumDriver.executeScript("mobile: scrollGesture", Map.of(
                "left", fromX,
                "top", fromY,
                "width", 0,
                "height", toY,
                "direction", direction,
                "speed", 500,
                "percent", 1
        ));
    }

}


