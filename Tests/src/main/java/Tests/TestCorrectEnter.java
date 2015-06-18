package Tests;

import Pages.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCorrectEnter {

    private WebDriver driver;
    private final String username = "tt";
    private final String password = "123456";


    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testCorrectLogin() throws Exception {
        driver.get("https://goantifraud.com/manager/");

        LoginPage login = new LoginPage(driver);
        login.loginAs(username,password);

        Assert.assertTrue(isElementPresent(By.xpath(".//*[@id='toolbar-profile']/span[contains(text(),'tt')]")));
    }
    @After
    public void tearDown() throws Exception {
          driver.quit();
    }
    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
