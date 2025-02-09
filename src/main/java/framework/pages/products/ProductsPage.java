package framework.pages.products;

import framework.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

import static framework.constants.Data.ADD_TO_CART_BUTTON_TEXT;
import static framework.constants.Data.REMOVE_BUTTON_TEXT;

public class ProductsPage extends BasePage {

    @FindBy(css = "[data-test='title']")
    private WebElement productsPageTitle;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement backpackAddToCartButton;

    @FindBy(css = "[id $='bike-light']")
    private WebElement bikeLightAddToCartButton;

    @FindBy(css = "[id $= 'bolt-t-shirt']")
    private WebElement boltTShirtAddToCartButton;

    @FindBy(css = "[id $= 'fleece-jacket']")
    private WebElement fleeceJacketAddToCartButton;

    @FindBy(css = "[id $= 'onesie']")
    private WebElement onesieAddToCartButton;

    @FindBy(css = "[id $= 'test.allthethings()-t-shirt-(red)']")
    private WebElement testAllTheThingsTShirtRedAddToCartButton;

    @FindBy(css = "button[data-test^='add-to-cart']")
    private List<WebElement> allAddToCartButtons;

    @FindBy(css = "button[data-test^='remove']")
    private List<WebElement> removeTextOnEachButton;

    @FindBy(css = "[data-test='inventory-item-price']")
    private List<WebElement> eachItemPriceList;

    @FindBy (css = "[class='product_sort_container']")
    private WebElement filterIcon;

    @FindBy(id = "shopping_cart_container")
    private WebElement cartIcon;

    @FindBy(id = "item_4_title_link")
    private WebElement backpackItem;

    @FindBy(id = "item_0_title_link")
    private WebElement bikeLightItem;

    @FindBy(id = "item_1_title_link")
    private WebElement boltTShirtItem;

    @FindBy(id = "item_5_title_link")
    private WebElement fleeceJacketItem;

    @FindBy(id = "item_2_title_link")
    private WebElement onesieItem;

    @FindBy(id = "item_3_title_link")
    private WebElement tShirtRed;


    public ProductsPage(ChromeDriver driver) {
        super(driver);
    }

    public String getItemsPriceByIndex(int index) {
        return eachItemPriceList.get(index).getText();
    }

    public void clickOnBackPackItemAddToCartButton() {
        backpackAddToCartButton.click();
    }

    public void clickOnCartIcon() {
        cartIcon.click();
    }

    public void clickOnAddToCartButtonByIndex(int index) {
        allAddToCartButtons.get(index).click();
    }

    public void clickOnAllAddToCartButtons() {
        for (WebElement element : allAddToCartButtons) {
            element.click();
        }
    }

    public void selectFilterOption(String value) {
        Select select = new Select(filterIcon);
        select.selectByValue(value);
    }

    public void verifyAllRemoveButtons() {
        for (WebElement removeElement : removeTextOnEachButton) {
            Assert.assertEquals(removeElement.getText(), REMOVE_BUTTON_TEXT);
        }
    }

    public void verifyAllAddToCartButtonsText() {
        for (WebElement element : allAddToCartButtons) {
            Assert.assertEquals(element.getText(), ADD_TO_CART_BUTTON_TEXT);
        }
    }

    public void verifyBackpackItemTitle(String expectedTitleOfTheItem) {
        Assert.assertEquals(backpackItem.getText(), expectedTitleOfTheItem);
    }

    public void verifyBikeLightItemTitle(String expectedTitleOfTheItem) {
        Assert.assertEquals(bikeLightItem.getText(), expectedTitleOfTheItem);
    }

    public void verifyBoltTShirtItemTitle(String expectedTitleOfTheItem) {
        Assert.assertEquals(boltTShirtItem.getText(), expectedTitleOfTheItem);
    }

    public void verifyFleeceJacketItemTitle(String expectedTitleOfTheItem) {
        Assert.assertEquals(fleeceJacketItem.getText(), expectedTitleOfTheItem);
    }

    public void verifyOnesieItemItemTitle(String expectedTitleOfTheItem) {
        Assert.assertEquals(onesieItem.getText(), expectedTitleOfTheItem);
    }

    public void verifyTShirtRedItemTitle(String expectedTitleOfTheItem) {
        Assert.assertEquals(tShirtRed.getText(), expectedTitleOfTheItem);
    }

    public void verifyRemoveTextOnEachButtonByIndexAfterClick(int index) {
        Assert.assertEquals(removeTextOnEachButton.get(index).getText(), REMOVE_BUTTON_TEXT);
    }

    public void verifyAllAddToCartButtonsByArrayList() {
        for (WebElement element : allAddToCartButtons) {
            Assert.assertTrue(element.isDisplayed());
        }
    }

    public void isBackPackItemAddToCartButtonDisplay() {
        Assert.assertTrue(backpackAddToCartButton.isDisplayed());
    }

    public void isBikeLightItemAddToCartButtonDisplay() {
        Assert.assertTrue(bikeLightAddToCartButton.isDisplayed());
    }

    public void isBoltTShirtItemAddToCartButtonDisplay() {
        Assert.assertTrue(boltTShirtAddToCartButton.isDisplayed());
    }

    public void isFleeceJacketItemAddToCartButtonDisplay() {
        Assert.assertTrue(fleeceJacketAddToCartButton.isDisplayed());
    }

    public void isOnesieItemAddToCartButtonDisplay() {
        Assert.assertTrue(onesieAddToCartButton.isDisplayed());
    }

    public void isAllTheThingsTShirtRedItemAddToCartButtonDisplay() {
        Assert.assertTrue(testAllTheThingsTShirtRedAddToCartButton.isDisplayed());
    }

    public boolean isProductPageOpen() {
        return productsPageTitle.isDisplayed();
    }

    public boolean isBackPackItemDisplayed() {
        return backpackItem.isDisplayed();
    }
}

