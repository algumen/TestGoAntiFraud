package Tests;

import Pages.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCorrectEnter {

    private WebDriver driver;
    private String baseUrl;
    private final username = "tt";


//    private final By loginButton = By.id("login");
//    driver.findElement(By.id("login")).clear();
    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://goantifraud.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void testUntitled() throws Exception {
        driver.get(baseUrl + "/manager/login/");
        LoginPage.typeUsername("tt");

        Assert.assertTrue(isElementPresent(By.xpath(".//*[@id='toolbar-profile']/span[contains(text(),'tt')]")));
    }








}
