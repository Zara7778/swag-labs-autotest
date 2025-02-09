package framework.pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
