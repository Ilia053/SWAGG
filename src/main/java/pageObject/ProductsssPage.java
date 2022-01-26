package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsssPage extends BasePage{

    public ProductsssPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[class='product_sort_container']")
    WebElement productSortDrp;
    @FindBy(css = "[class='header_secondary_container'] [class='title'")
    WebElement stringProd;


    public String getName(){
        return stringProd.getText();
    }

    public void addToCart(){

    }
    public void removeToCart(){

    }
    public void clickName(){
        
    }
}
