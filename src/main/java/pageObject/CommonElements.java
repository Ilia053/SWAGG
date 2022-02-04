package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonElements extends BasePage{
    @FindBy(css = "[id='react-burger-menu-btn']")
    WebElement menuButton;
    @FindBy(css = "[id='shopping_cart_container']")
    WebElement cart;
    @FindBy(css = "[class='social_twitter']")
    WebElement twitter;
    @FindBy(css = "[class='social_facebook']")
    WebElement facebook;
    @FindBy(css = "[class='social_linkedin']")
    WebElement linkedin;

    public CommonElements(WebDriver driver) {
        super(driver);
    }

    public CartPage openCart(){
        clickElem(cart);
        return new CartPage(driver);
    }
}
