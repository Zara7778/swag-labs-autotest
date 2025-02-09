package autotests.burgermenu;

import autotests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static framework.constants.Data.PASSWORD;
import static framework.constants.Data.STANDARD_USER_NAME;

public class BurgerMenuTest extends BaseTest {

    @Test
    public void verifyLoginPageOpensAfterClickingLogoutFromBurgerMenu() {
        loginFormPage.setUserName(STANDARD_USER_NAME);
        loginFormPage.setPassword(PASSWORD);
        loginFormPage.clickOnLoginButton();
        burgerMenuPage.clickOnBurgerMenuButton();
        burgerMenuPage.clickOnLogoutButtonInBurgerMenuDropDown();
        Assert.assertTrue(loginFormPage.isLoginPageDisplay());
    }
}

