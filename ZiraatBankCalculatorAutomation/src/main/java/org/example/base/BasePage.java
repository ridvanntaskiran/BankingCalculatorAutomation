package org.example.base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    public By getBy(String xpath) {
        return By.xpath(xpath);
    }

    public WebElement waitForElement(String xpath) {
        By locator = getBy(xpath);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            return driver.findElement(locator);
        } catch (TimeoutException e) {
            throw new AssertionError("Element with locator '" + xpath + "' could not be found within the specified time.");
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element with locator '" + xpath + "' does not exist in DOM.");
        }
    }

    public void sendKeys(String xpath, String txt) {
        WebElement element = waitForElement(xpath);
        element.sendKeys(txt);
    }

    public void click(String xpath) {
        WebElement element = waitForElement(xpath);
        element.click();
    }

    public void clear(String xpath) {
        WebElement element = waitForElement(xpath);
        element.clear();
    }
}

