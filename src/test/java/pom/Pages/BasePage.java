package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputKeys(By locator, String texto){
        driver.findElement(locator).sendKeys(texto);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void clickOnElement(By locator){
        driver.findElement(locator).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void assertEqual(String obj1, String obj2){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(obj1,obj2);
    }
    public void assertEqualTitle(String obj1){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    assertEquals(obj1,driver.getTitle());
    }
    public String getText(By locator) throws Exception {
        try {
            Thread.sleep(5000);
            return driver.findElement(locator).getText().substring(8);
                    //.getAttribute("textContent");
        } catch (Exception e) {
            throw new Exception("No se pudo obtener el texto del elemento: " + locator);
        }
    }

    public void KeyTAB() throws Exception{
        try {
            Thread.sleep(5000);
            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.TAB).perform();
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void switchTO(By element) throws Exception {
        try {
            Thread.sleep(5000);
            driver.findElement(element);
            driver.switchTo().frame((WebElement) element);
        } catch (Exception e) {
            throw new Exception("No se pudo cambiar al frame: " + element);
        }
    }
}
