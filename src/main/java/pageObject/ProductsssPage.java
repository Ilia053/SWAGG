package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

public class ProductsssPage extends CommonElements{

    public ProductsssPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[class='product_sort_container']")
    WebElement productSortDrp;
    @FindBy(css = "[class='header_secondary_container'] [class='title']")
    WebElement stringProd;

    @FindBy(css = "[class='inventory_item_name']")
    public List<WebElement> listOfProductTitle;

    @FindBy(css = "[class='btn btn_primary btn_small btn_inventory']")
    private List<WebElement> listOfButtonAdd;

    @FindBy(css = "[class='shopping_cart_container']")
    private WebElement simbolCart;



    public String getName(){
        waitisVisible(stringProd);
        return stringProd.getText();
    }

     public int getCartNumber(){

        return Integer.parseInt(simbolCart.getText());
     }


    public void   clickNameProduct(String nameOfProducts){
        for (WebElement productName : listOfProductTitle) {
            System.out.println(productName.getText());
            if (productName.getText().equalsIgnoreCase(nameOfProducts)){
                waitisClickable(productName);
                productName.click();
                sleepMy(3000);
            }
        }
//        return new ProductPage(driver);
    }


    public ProductsssPage addToCart(String nameOfProducts){
        for (WebElement productName : listOfProductTitle) {
            if (productName.getText().equalsIgnoreCase(nameOfProducts)){
                listOfButtonAdd.get(Arrays.stream(GlobalVaraible.Productsss.TITLE_NAME_LIST).toList().indexOf(nameOfProducts)).click();
                sleepMy(2000);
            }
        }
        return this;
    }
    public void allProductClick(){
        for (WebElement webElement : listOfProductTitle) {
            waitisClickable(webElement);
            webElement.click();
            sleepMy(2000);
        }
    }
    public void removeToCart(){

    }
    @Override
    public ProductsssPage sleepMy(long x){
        try {
            Thread.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }


}
