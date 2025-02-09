package autotests;

import framework.helpers.WaitHelper;
import framework.pages.burgermenu.BurgerMenuPage;
import framework.pages.loginform.LoginFormPage;
import framework.pages.products.ProductsPage;
import framework.pages.yourcart.CheckoutOverviewPage;
import framework.pages.yourcart.YourCartPage;
import framework.pages.yourcart.YourInformationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import static framework.constants.Data.BASE_URL;

public class BaseTest {

    private static ChromeDriver driver;
    public WaitHelper waitHelper;
    public LoginFormPage loginFormPage;
    public ProductsPage productsPage;
    public YourCartPage yourCartPage;
    public BurgerMenuPage burgerMenuPage;
    public YourInformationPage yourInformationPage;
    public CheckoutOverviewPage checkoutOverviewPage;

    public BaseTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        waitHelper = new WaitHelper(driver);
        loginFormPage = new LoginFormPage(getDriver());
        productsPage = new ProductsPage(getDriver());
        yourCartPage = new YourCartPage(getDriver());
        burgerMenuPage = new BurgerMenuPage(getDriver());
        yourInformationPage = new YourInformationPage(getDriver());
        checkoutOverviewPage = new CheckoutOverviewPage(getDriver());
    }

    public static ChromeDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void openBaseUrl() {
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @AfterSuite
    public void quitDriver() {
        driver.quit();
    }
}