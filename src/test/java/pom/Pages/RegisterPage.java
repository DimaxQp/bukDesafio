package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{
     public RegisterPage(WebDriver driver) {
        super(driver);
    }
    String titlePage = "STORE";
    private final By usernameField = By.id("sign-username");
    private final By passwordField = By.id("sign-password");
    private By SignUpButton = By.xpath("//button[contains(text(),'Sign up')]");
    private final By SignUpMenu = By.xpath("//a[@id='signin2']");

    public void confirmPage(){
        this.assertEqualTitle(titlePage);
    }
    public void clickOnMenuRegister(){
        this.clickOnElement(SignUpMenu);
    }

    public void inputRegister(String username, String password){
        this.inputKeys(usernameField,username);
        this.inputKeys(passwordField,password);

    }

    public void clickOnRegisterButton() throws Exception {
        this.clickOnElement(SignUpButton);

    }

}
