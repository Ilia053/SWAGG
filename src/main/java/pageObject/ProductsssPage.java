package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsssPage extends BasePage{

    public ProductsssPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[class='product_sort_container']")
    WebElement productSortDrp;
    @FindBy(css = "[class='header_secondary_container'] [class='title']")
    WebElement stringProd;

    @FindBy(css = "[class='inventory_item_name']")
    private List<WebElement> listOfProductTitle;


    public String getName(){
        waitisVisible(stringProd);
        return stringProd.getText();
    }

    public ProductsssPage clickNameProduct(String nameOfProducts){
        for (WebElement productName : listOfProductTitle) {
            if (productName.getText().equalsIgnoreCase(nameOfProducts)){
                productName.click();
                return this;
            }
            break;
        }
        return this;
    }
    public void addToCart(){

    }
    public void removeToCart(){

    }
}
