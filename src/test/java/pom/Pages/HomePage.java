package pom.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {

        super(driver);
    }

    private final By loginMenu = By.id("login2");
    private final By pageHeader = By.xpath("//*[@id='nameofuser']");

    // Register
    private final By registerMenu = By.id("signin2");
    private final By registerUsername = By.id("sign-username");
    private final By registerPassword = By.id("sign-password");
    private final By registerButton = By.xpath("//button[contains(text(),'Sign up')]");
    public void clickRegisterMenu(){
        driver.findElement(registerMenu).click();
    }
    public void inputRegisterUsername(String username,String password){
        driver.findElement(registerUsername).sendKeys(username);
        driver.findElement(registerPassword).sendKeys(password);

    }
    public void inputRegisterPassword(){
    }
    public void clickRegisterButton(){
        driver.findElement(registerButton).click();
    }


    // login
    public void clickLoginMenu(){
        driver.findElement(loginMenu).click();
    }
    public String accountName(){
        return driver.findElement(pageHeader).getText();
    }


    // message
    public void popUpMessage(String popUp){
        String mensajeAlerta = driver.switchTo().alert().getText();
        Assert.assertTrue(mensajeAlerta.contains(popUp));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.switchTo().alert().accept();
    }
    // add to cart
    public void chooseCategories(String categories){
        driver.findElement(By.linkText(categories)).click();
    }
    public void getProduct(String product) throws InterruptedException {
        //WebElement test = driver.findElement(By.xpath("//a[@href='prod.html?idp_=1'][text()='"+product+"']"));

        boolean elementFound = false;
        for (int i = 0; i < 5 && !elementFound; i++) {
            try {
                WebElement element = driver.findElement(By.xpath("//a[contains(text(),'"+product+"')]"));
                if (element.isDisplayed()) {
                    element.click(); // hacer clic en el elemento web encontrado
                    elementFound = true;
                }
            } catch (Exception e) {
                // El elemento no se encontró en la página web, continuar desplazando hacia abajo
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,1000);");
            }
        }

    }

}