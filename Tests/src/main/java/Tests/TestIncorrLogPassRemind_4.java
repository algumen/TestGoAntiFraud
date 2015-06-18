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

public class TestIncorrLogPassRemind_4 extends AbstractTest{

    private final String idemail = "ttt";

    @Test
    public void testCorrectLogin() throws Exception {
        getDriver().get("https://goantifraud.com/manager/");

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickforgotPassLink();

        RemindPage remindPage = new RemindPage(getDriver());
        remindPage.typeIdEmail(idemail);
        remindPage.clickSend();

        Assert.assertTrue(isElementPresent(By.xpath(".//*/div[contains(text(),'Username is not exist')]")));
    }
}
