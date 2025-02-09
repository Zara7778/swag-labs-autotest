package framework.pages.yourcart;

import framework.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class YourCartPage extends BasePage {

    @FindBy (id = "continue-shopping")
    private WebElement continueShoppingButton;

    @FindBy (id = "checkout")
    private WebElement checkoutButton;

    @FindBy(css = "[data-test='title']")
    private WebElement productsPageTitle;

    @FindBy (css = "[data-test='inventory-item']")
    private List<WebElement> allAddedItems;

    @FindBy(css = "button[data-test^='remove']")
    private List<WebElement> removeTextOnEachButton;

    public YourCartPage(ChromeDriver driver) {
        super(driver);
    }

    public void clickOnContinueShoppingButton() {
        continueShoppingButton.click();
    }

    public void clickOnCheckoutButton() {
        checkoutButton.click();
    }

    public void clickOnAllRemoveButtons() {
        for (WebElement element : removeTextOnEachButton) {
            element.click();
        }
    }

    public void verifyContinueShoppingButtonDisplay(){
        Assert.assertTrue(continueShoppingButton.isDisplayed());
    }

    public void verifyCheckoutButtonDisplay() {
        Assert.assertTrue(checkoutButton.isDisplayed());
    }

    public void verifyCountOfItemsAddedToCart(int count) {
        Assert.assertEquals(allAddedItems.size(),count);
    }
}
