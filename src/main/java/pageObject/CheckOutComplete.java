package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutComplete extends BasePage{
    public CheckOutComplete(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[class='btn btn_primary btn_small']")
    WebElement buttonBackHome;

    public ProductsssPage clickBackHome(){
        clickElem(buttonBackHome);
        return new ProductsssPage(driver);
    }
}
