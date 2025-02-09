package framework.pages.yourcart;

import framework.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckoutOverviewPage extends BasePage {

    @FindBy (css = "[data-test='subtotal-label']")
    private WebElement itemTotalText;

    public CheckoutOverviewPage(ChromeDriver driver) {
        super(driver);
    }

    public void verifyItemTotalAmount(String price) {
        Assert.assertTrue(itemTotalText.getText().endsWith(price));
    }
}
