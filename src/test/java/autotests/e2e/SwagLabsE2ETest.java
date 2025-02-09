package autotests.e2e;

import autotests.BaseTest;
import org.testng.annotations.Test;

import static framework.constants.Data.PASSWORD;
import static framework.constants.Data.STANDARD_USER_NAME;


public class SwagLabsE2ETest extends BaseTest {

    @Test(priority = 2)
    public void checkOneItemPurchase()  {
        loginFormPage.setUserName(STANDARD_USER_NAME);
        loginFormPage.setPassword(PASSWORD);
        loginFormPage.clickOnLoginButton();
        productsPage.isProductPageOpen();
        String firstItemPrice = productsPage.getItemsPriceByIndex(1);
        productsPage.clickOnAddToCartButtonByIndex(1);
        productsPage.clickOnCartIcon();
        yourCartPage.verifyCountOfItemsAddedToCart(1);
        yourCartPage.clickOnCheckoutButton();
        yourInformationPage.setFirstName("John");
        yourInformationPage.setLastName("Duo");
        yourInformationPage.setPostalCode("0006861");
        yourInformationPage.clickOnContinueButton();
        checkoutOverviewPage.verifyItemTotalAmount(firstItemPrice);
    }

    @Test(priority = 1)
    public void addToCartVerifyRemoveText()  {
        loginFormPage.setUserName(STANDARD_USER_NAME);
        loginFormPage.setPassword(PASSWORD);
        loginFormPage.clickOnLoginButton();
        productsPage.isProductPageOpen();
        productsPage.clickOnAllAddToCartButtons();
        productsPage.verifyAllRemoveButtons();
        productsPage.clickOnCartIcon();
        yourCartPage.clickOnAllRemoveButtons();
        yourCartPage.clickOnContinueShoppingButton();
        productsPage.verifyAllAddToCartButtonsText();
    }
}

