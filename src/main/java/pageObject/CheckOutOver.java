package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutOver extends BasePage{

    public CheckOutOver(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[class='btn btn_action btn_medium cart_button']")
    WebElement buttonFinish;

    public void clickFinish(){
        clickElem(buttonFinish);
    }
}
