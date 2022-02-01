package tests;

import org.testng.annotations.Test;
import pageObject.GlobalVaraible;
import pageObject.ProductPage;
import pageObject.ProductsssPage;

public class test_4 extends BaseTestWithEnter{

    @Test
    public void test_4(){
        ProductsssPage productsssPage = new ProductsssPage(driver);
        for(int i = 0; i < 5; i++){
            productsssPage.clickNameProduct(GlobalVaraible.Productsss.TITLE_NAME_LIST[i]);
            productsssPage.sleepMy(2000);
            ProductPage productPage = new ProductPage(driver);
            productsssPage.sleepMy(2000);
            productPage.backToMain();
        }
    }
}
