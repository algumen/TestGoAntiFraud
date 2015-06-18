package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemindPage {

    By idEmailLocator = By.linkText("id_email");
    By loginButtonLocator = By.id("submit_btn");


    private final WebDriver driver;

    public RemindPage(WebDriver driver) {
    this.driver = driver;
    }



    public RemindPage typeIdEmail(String password) {
        driver.findElement(idEmailLocator).sendKeys(password);
        return this;
    }

    public RemindPage clickSend() {
        driver.findElement(loginButtonLocator).click();
        return new RemindPage(driver);
    }

}