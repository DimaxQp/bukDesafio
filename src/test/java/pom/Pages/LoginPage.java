package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage
{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    String titlePage = "STORE";
    private final By usernameField = By.id("loginusername");
    private final By passwordField = By.id("loginpassword");
    private By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    private final By loginMenu = By.xpath("//a[@id='login2']");
    private final By userLogged = By.xpath("//*[@id='nameofuser']");


    public void confirmPage(){
        this.assertEqualTitle(titlePage);
    }
    public void inputLogin(String username, String password){
        this.inputKeys(usernameField,username);
        this.inputKeys(passwordField,password);

    }
    public void clickOnLoginButton() throws Exception {
        this.clickOnElement(loginButton);

    }

    public void clickOnMenuLogin(){
        this.clickOnElement(loginMenu);
    }

    public void confirmLogin(String user) throws Exception {
        String usuarioLogueado = this.getText(userLogged);
        this.assertEqual(user,usuarioLogueado);
        System.out.println("se validó el inicio de sesion: "+user+ " es igual al contenido del elemento: " +usuarioLogueado);
    }

}
