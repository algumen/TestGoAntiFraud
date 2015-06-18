package Tests;

import Pages.LoginPage;
//import Pages.RemindPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Bad {

    private final String idEmail = "ttt";

    private WebDriver driver;

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testCorrectLogin() throws Exception {
        driver.get("https://goantifraud.com/manager/");

        LoginPage forgotPass = new LoginPage(driver);
        forgotPass.clickforgotPassLink();

//        RemindPage idemail = new RemindPage(driver);
//        idemail.typeIdEmail(idEmail);

        forgotPass.clickforgotPassLink();

        Assert.assertTrue(isElementPresent(By.xpath(".//*/div[contains(text(),'Username is not exist')]")));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
