package tests;

import org.testng.annotations.Test;
import pageObject.GlobalVaraible;
import pageObject.ProductsssPage;

public class Test_3 extends BaseTestWithEnter{

    @Test
    public void test_2_1() {
        ProductsssPage productsssPage = new ProductsssPage(driver);
        productsssPage.addToCart(GlobalVaraible.Productsss.TITLE_NAME_LIST[1]);

    }
}
