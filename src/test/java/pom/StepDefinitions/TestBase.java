package pom.StepDefinitions;

import org.openqa.selenium.WebDriver;
import pom.Pages.*;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected HomePage homePage = new HomePage(driver);
    protected LoginPage loginPage = new LoginPage(driver);
    protected RegisterPage registerPage = new RegisterPage(driver);
    protected CartPage cartPage = new CartPage(driver);
    protected PlaceOrderPage placeOrderPage = new PlaceOrderPage(driver);



}
