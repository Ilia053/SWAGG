package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css = "[id='user-name']")
    WebElement username ;
    @FindBy(css = "[id='password']")
    WebElement password;
    @FindBy(css = "[id='login-button']")
    WebElement buttonLogin;
    @FindBy(css = "[data-test='error']")
    WebElement textError;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}


