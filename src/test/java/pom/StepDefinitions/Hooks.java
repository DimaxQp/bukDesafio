package pom.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    private static ChromeDriver driver;

    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();
    }

    @After
    public void TearDown(){
        //driver.quit();
    }

    public static ChromeDriver getDriver(){
        return driver;
    }
}
