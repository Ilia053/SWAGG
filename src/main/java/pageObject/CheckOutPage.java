package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage{
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[data-test='firstName']")
    WebElement inputName;
    @FindBy(css = "[class='lastName']")
    WebElement inputLastName;
    @FindBy(css = "[class='postalCode']")
    WebElement inputPostalCode;

    @FindBy(css = "[class='submit-button btn btn_primary cart_button btn_action']")
    WebElement buttonContinue;

    public void fillEveryThing(){
        fillField(inputName,);
    }
}
