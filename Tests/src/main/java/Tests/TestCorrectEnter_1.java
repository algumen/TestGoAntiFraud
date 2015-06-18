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

public class TestCorrectEnter_1 extends  AbstractTest{

    private final String username = "tt";
    private final String password = "123456";

    @Test
    public void testCorrectLogin() throws Exception {
        getDriver().get("https://goantifraud.com/manager/");

        LoginPage login = new LoginPage(getDriver());
        login.loginAs(username, password);

        Assert.assertTrue(isElementPresent(By.xpath(".//*[@id='toolbar-profile']/span[contains(text(),'tt')]")));
    }
}
