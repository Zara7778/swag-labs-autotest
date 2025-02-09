package framework.pages.burgermenu;

import framework.helpers.WaitHelper;
import framework.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class BurgerMenuPage extends BasePage {

    @FindBy(id = "react-burger-menu-btn")
    private WebElement burgerMenuButton;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutButtonInBurgerMenuButton;


    public BurgerMenuPage(ChromeDriver driver) {
        super(driver);
    }

    public void clickOnBurgerMenuButton() {
        burgerMenuButton.click();
    }

    public void clickOnLogoutButtonInBurgerMenuDropDown() {
        WaitHelper.waitElementClickable(logoutButtonInBurgerMenuButton);
        logoutButtonInBurgerMenuButton.click();
    }
}
