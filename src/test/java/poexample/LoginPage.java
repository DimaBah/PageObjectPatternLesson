package poexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {

    private String loginField = "mailbox:login";
    private String enterPasswordBtn = "mailbox:submit";
    private String passwordField = "mailbox:password";

//    @FindBy(id = "mailbox:login")
//    WebElement loginField ;
//    @FindBy(id = "mailbox:submit")
//    WebElement enterPasswordBtn ;
//    @FindBy(id = "mailbox:password")
//    WebElement loginField ;

//    public LoginPage(){
//        PageFactory.initElements();
//    }

    public void navigateToLoginPage(String url){
        getDriver().get(url);
    }

    public void fillUsernameFld(String username) {
        getElement(loginField).sendKeys(username);

    }

    public void clickEnterPasswordBtn() {
        getElement(enterPasswordBtn).click();
        waitElement(getElement(passwordField));
    }

    public void fillPasswordFld(String password) {
        getElement(passwordField).sendKeys(password);
    }
}