package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.GlobalVaraible;
import pageObject.ProductsssPage;

public class Test_2 extends BaseTestWithEnter{

    @Test
    public void test_2(){
            ProductsssPage productsssPage = new ProductsssPage(driver);
            Assert.assertEquals(productsssPage.getName(), GlobalVaraible.Productsss.NAME_PRODUCTS);
            productsssPage.clickNameProduct(GlobalVaraible.Productsss.TITLE_NAME_LIST[0]).sleepMy(200);




    }
}
