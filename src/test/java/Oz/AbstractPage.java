package Oz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import poexample.DriverUtils;
import poexample.WaitUtils;

public class AbstractPage {
    private WebDriver driver = DriverUtils.getDriver();

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getElement(String xp){
        return driver.findElement(By.xpath(xp));
    }

    public void waitElement(WebElement element){
        WaitUtils.waitForElement(driver, element);

    }

}
