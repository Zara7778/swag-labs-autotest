package autotests.login;

import autotests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static framework.constants.Data.*;

public class LoginFormTest extends BaseTest {


    @Test
    public void checkLoginFunctionality() {
        loginFormPage.setUserName(STANDARD_USER_NAME);
        loginFormPage.setPassword(PASSWORD);
        loginFormPage.clickOnLoginButton();
        Assert.assertTrue(productsPage.isProductPageOpen());
    }

    @Test
    public void checkLoginWithoutLoginCredential() {
        loginFormPage.setPassword(PASSWORD);
        loginFormPage.clickOnLoginButton();
        loginFormPage.assertErrorMessage(ERROR_MESSAGE_WHEN_LOGIN_WITHOUT_LOGIN_CREDENTIALS);
    }

    @Test
    public void checkLoginWithoutPassword() {
        loginFormPage.setUserName(STANDARD_USER_NAME);
        loginFormPage.clickOnLoginButton();
        loginFormPage.assertErrorMessage(ERROR_MESSAGE_WHEN_NO_PASSWORD);
    }

    @Test
    public void checkLoginWithWrongPassword() {
        loginFormPage.setUserName(STANDARD_USER_NAME);
        loginFormPage.setPassword("wrongPassword");
        loginFormPage.clickOnLoginButton();
        loginFormPage.assertErrorMessage(ERROR_MESSAGE_LOGIN_WITH_WRONG_PASSWORD);
    }

    @Test
    public void checkLoginWithWrongUserName() {
        loginFormPage.setUserName("wrongUsername");
        loginFormPage.setPassword(PASSWORD);
        loginFormPage.clickOnLoginButton();
        loginFormPage.assertErrorMessage(ERROR_MESSAGE_WRONG_USERNAME);
    }

    @Test
    public void checkLoginWhenReplaceUsernameAndPasswordPlaces() {
        loginFormPage.setUserName(PASSWORD);
        loginFormPage.setPassword(STANDARD_USER_NAME);
        loginFormPage.clickOnLoginButton();
        loginFormPage.assertErrorMessage(ERROR_MESSAGE_WHEN_REPLACING_LOGIN_PASSWORD_FIELDS);
    }

    @Test
    public void checkLoginWhenClickOnLoginButtonWithoutFillingUpUsernameCredentials() {
        loginFormPage.clickOnLoginButton();
        loginFormPage.assertErrorMessage(ERROR_MESSAGE_LOGIN_WITHOUT_USERNAME_CREDENTIALS);
    }

    @Test
    public void checkAllErrorMessages() {
        loginFormPage.setPassword(PASSWORD);
        loginFormPage.clickOnLoginButton();
        loginFormPage.assertErrorMessage(ERROR_MESSAGE_LOGIN_WITHOUT_USERNAME_CREDENTIALS);

        getDriver().navigate().refresh();

        loginFormPage.setUserName(STANDARD_USER_NAME);
        loginFormPage.clickOnLoginButton();
        loginFormPage.assertErrorMessage(ERROR_MESSAGE_WHEN_NO_PASSWORD);

        getDriver().navigate().refresh();

        loginFormPage.setUserName(STANDARD_USER_NAME);
        loginFormPage.setPassword("wrongPassword");
        loginFormPage.clickOnLoginButton();
        loginFormPage.assertErrorMessage(ERROR_MESSAGE_LOGIN_WITH_WRONG_PASSWORD);

        getDriver().navigate().refresh();

        loginFormPage.setUserName("wrongUsername");
        loginFormPage.setPassword(PASSWORD);
        loginFormPage.clickOnLoginButton();
        loginFormPage.assertErrorMessage(ERROR_MESSAGE_WRONG_USERNAME );

        getDriver().navigate().refresh();

        loginFormPage.setUserName(PASSWORD);
        loginFormPage.setPassword(STANDARD_USER_NAME);
        loginFormPage.clickOnLoginButton();
        loginFormPage.assertErrorMessage(ERROR_MESSAGE_WHEN_REPLACING_LOGIN_PASSWORD_FIELDS);

        getDriver().navigate().refresh();

        loginFormPage.clickOnLoginButton();
        loginFormPage.assertErrorMessage(ERROR_MESSAGE_WHEN_LOGIN_WITHOUT_LOGIN_CREDENTIALS);
    }
}