package Tests;

import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCorrectEnter {

    private final By loginButton = By.id("login");
    driver.findElement(By.id("login")).clear();

    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://goantifraud.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }






}
