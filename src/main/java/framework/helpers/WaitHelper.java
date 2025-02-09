package framework.helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

    private static ChromeDriver driver;
    private static final int DEFAULT_TIMEOUT = 10;

    public WaitHelper(ChromeDriver driver){
        this.driver = driver;
    }

    public static void waitElementVisibility(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void waitElementInvisibility(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    public static void waitElementClickable(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public static void waitElementVisibility(WebElement webElement, int timeOut){
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void waitElementInvisibility(WebElement webElement, int timeOut){
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    public static void waitElementClickable(WebElement webElement, int timeOut){
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }
}
