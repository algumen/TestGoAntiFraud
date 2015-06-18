package Tests;

import Pages.LoginPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestIncorrEnter_2 extends AbstractTest{

    private final String username = "ttt";
    private final String password = "123456";

    @Test
    public void testCorrectLogin() throws Exception {
        getDriver().get("https://goantifraud.com/manager/");

        LoginPage login = new LoginPage(getDriver());
        login.loginAs(username, password);

        Assert.assertTrue(isElementPresent(By.xpath(".//*/div[contains(text(),'Login or password is incorrect')]")));
    }
}
