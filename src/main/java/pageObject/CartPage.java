package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[class='btn btn_action btn_medium checkout_button']")
    WebElement buttonCheckOut;

//    public CartPage ClickCheckOut(){
//        clickElem(buttonCheckOut);
//        return this;
//    }
    public CheckOutPage ClickCheckOut(){
        clickElem(buttonCheckOut);
        return new CheckOutPage(driver);
    }
}
