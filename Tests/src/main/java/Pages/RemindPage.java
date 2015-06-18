package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemindPage {

    By idEmailLocator = By.id("id_email");
    By sendButtonLocator = By.id("submit_btn");


    private final WebDriver driver;

    public RemindPage(WebDriver driver) {
    this.driver = driver;
    }



    public RemindPage typeIdEmail(String idemail) {
        driver.findElement(idEmailLocator).sendKeys(idemail);
        return this;
    }

    public RemindPage clickSend() {
        driver.findElement(sendButtonLocator).click();
        return new RemindPage(driver);
    }

}