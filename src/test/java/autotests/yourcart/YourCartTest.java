package autotests.yourcart;

import autotests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static framework.constants.Data.PASSWORD;
import static framework.constants.Data.STANDARD_USER_NAME;

public class YourCartTest extends BaseTest {

    @Test
    public void verifyContinueShoppingAndCheckoutButtonsDisplay() {
        loginFormPage.setUserName(STANDARD_USER_NAME);
        loginFormPage.setPassword(PASSWORD);
        loginFormPage.clickOnLoginButton();
        productsPage.clickOnCartIcon();

        yourCartPage.verifyCheckoutButtonDisplay();
        yourCartPage.verifyContinueShoppingButtonDisplay();
    }

    @Test
    public void verifyProductsPageOpensSuccessfullyAfterClickingOnContinueShoppingButton() {
        loginFormPage.setUserName(STANDARD_USER_NAME);
        loginFormPage.setPassword(PASSWORD);
        loginFormPage.clickOnLoginButton();
        productsPage.clickOnCartIcon();
        yourCartPage.clickOnContinueShoppingButton();

        Assert.assertTrue(productsPage.isProductPageOpen());
    }
}

