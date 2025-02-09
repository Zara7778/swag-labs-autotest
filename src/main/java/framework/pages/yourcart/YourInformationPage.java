package framework.pages.yourcart;

import framework.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class YourInformationPage extends BasePage {

    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy (id = "last-name")
    private WebElement lastNameInput;

    @FindBy (id = "postal-code")
    private WebElement postalCodeField;

    @FindBy (id = "continue")
    private WebElement continueButton;

    @FindBy (id = "cancel")
    private WebElement cancelButton;

    public YourInformationPage(ChromeDriver driver) {
        super(driver);
    }

    public void setFirstName(String name){
        firstNameInput.sendKeys(name);
    }

    public void setLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
    }

    public void setPostalCode(String postalCode) {
        postalCodeField.sendKeys(postalCode);
    }

    public void clickOnContinueButton() {
        continueButton.click();
    }
}
