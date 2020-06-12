package Oz;

import org.openqa.selenium.By;

public class OzPage extends AbstractPage {
    private String searchField = "//input[@id=\"top-s\"]";
    private String enterButton = "//span[@class=\"top-panel__userbar__auth__lbl\"]";
    private String bucketButton = "//a[@href=\"/checkout/\"]";
    private String someFilter = "//a[@href=\"/food/\"]";

    public void navigateToOzPage(String url){
        getDriver().get(url);
    }
    public void waitForLoading(){
        waitElement(getDriver().findElement(By.xpath(enterButton)));
    }

    public boolean checkSearchField (){
        return getElement(searchField).isDisplayed();
    }
    public boolean checkEnterButton (){
        return getElement(enterButton).isDisplayed();
    }
    public boolean checkBucketButoon (){
        return getElement(bucketButton).isDisplayed();
    }
    public boolean checkSomeFilter (){
        return getElement(someFilter).isDisplayed();
    }
}
