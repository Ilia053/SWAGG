package pageObject;

import org.openqa.selenium.By;

public class Locators {
   public By username = By.cssSelector("[id='user-name']");
   public By password = By.cssSelector("[id='password']");
   public By buttonLogin = By.cssSelector("[id='login-button']");
}
