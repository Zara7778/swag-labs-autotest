package autotests.products;

import autotests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static framework.constants.Data.PASSWORD;
import static framework.constants.Data.STANDARD_USER_NAME;

public class ProductsTest extends BaseTest {

    @Test
    public void verifyAllItemTitlesDisplay() {
        loginFormPage.setUserName(STANDARD_USER_NAME);
        loginFormPage.setPassword(PASSWORD);
        loginFormPage.clickOnLoginButton();

        Assert.assertTrue(productsPage.isProductPageOpen());

        productsPage.verifyBackpackItemTitle("Sauce Labs Backpack");
        productsPage.verifyBikeLightItemTitle("Sauce Labs Bike Light");
        productsPage.verifyBoltTShirtItemTitle("Sauce Labs Bolt T-Shirt");
        productsPage.verifyFleeceJacketItemTitle("Sauce Labs Fleece Jacket");
        productsPage.verifyOnesieItemItemTitle("Sauce Labs Onesie");
        productsPage.verifyTShirtRedItemTitle("Test.allTheThings() T-Shirt (Red)");
    }

    @Test
    public void displayAddToCartButtonOfEveryItem() {
        loginFormPage.setUserName(STANDARD_USER_NAME);
        loginFormPage.setPassword(PASSWORD);
        loginFormPage.clickOnLoginButton();
        productsPage.isBackPackItemAddToCartButtonDisplay();
        productsPage.isBikeLightItemAddToCartButtonDisplay();
        productsPage.isBoltTShirtItemAddToCartButtonDisplay();
        productsPage.isFleeceJacketItemAddToCartButtonDisplay();
        productsPage.isOnesieItemAddToCartButtonDisplay();
        productsPage.isAllTheThingsTShirtRedItemAddToCartButtonDisplay();
        productsPage.verifyAllAddToCartButtonsByArrayList();
    }
}
