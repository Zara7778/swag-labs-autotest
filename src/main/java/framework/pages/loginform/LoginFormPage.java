package framework.pages.loginform;

import framework.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginFormPage extends BasePage {

    @FindBy (id = "user-name")
    private WebElement userNameInput;

    @FindBy (id = "password")
    private WebElement passwordInput;

    @FindBy (id = "login-button")
    private WebElement loginButton;

    @FindBy (css = "[data-test='error'] ")
    private WebElement errorMessageFieldForLoginPage;

    public LoginFormPage(ChromeDriver driver) {
        super(driver);
    }

    public void setUserName(String name) {
        userNameInput.sendKeys(name);
    }

    public void setPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }

    public void assertErrorMessage(String expectedErrorMessage){
        Assert.assertEquals(errorMessageFieldForLoginPage.getText(),expectedErrorMessage);
    }

    public boolean isLoginPageDisplay() {
        return loginButton.isDisplayed();
    }
}
