package Tests;

import Pages.LoginPage;
import Pages.RemindPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestRemindPass_3 {

    private final String idemail = "tt";

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

        RemindPage enterIdEmail = new RemindPage(driver);
        enterIdEmail.typeIdEmail(idemail);

        RemindPage clicksend = new RemindPage(driver);
        clicksend.clickSend();


        Assert.assertTrue(isElementPresent(By.cssSelector("#captcha_1_err")));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
