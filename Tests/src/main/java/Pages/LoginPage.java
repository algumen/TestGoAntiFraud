package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    By usernameLocator = By.id("login");
    By passwordLocator = By.id("password");
    By loginButtonLocator = By.id("submit_btn");
    By forgotPassLink = By.linkText("Forgot your password?");

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage typeUsername(String username) {
        driver.findElement(usernameLocator).sendKeys(username);
        return this;
    }

    public LoginPage typePassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
        return this;
    }

    public LoginPage clickLogin() {
        driver.findElement(loginButtonLocator).click();
        return new LoginPage(driver);
    }

    public LoginPage loginAs(String username, String password) {
        typeUsername(username);
        typePassword(password);
        return clickLogin();
    }

    public LoginPage clickforgotPassLink() {
        driver.findElement(forgotPassLink).click();
        return new LoginPage(driver);
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
