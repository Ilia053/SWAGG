package tests;

import org.testng.annotations.Test;
import pageObject.CartPage;
import pageObject.GlobalVaraible;
import pageObject.ProductsssPage;

public class TestSanity extends BaseTestWithEnter{

    @Test(testName = "Sanity")
    public void TestS(){
        ProductsssPage productsssPage = new ProductsssPage(driver);
        productsssPage.addToCart(GlobalVaraible.Productsss.TITLE_NAME_LIST[0]).addToCart(GlobalVaraible.Productsss.TITLE_NAME_LIST[0]).sleepMy(2000);
    }

}
