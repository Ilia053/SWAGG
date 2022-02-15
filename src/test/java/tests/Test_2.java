package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.GlobalVaraible;
import pageObject.ProductPage;
import pageObject.ProductsssPage;

import java.util.Arrays;

public class Test_2 extends BaseTestWithEnter {

    @Test
    public void test_2() {
        ProductsssPage productsssPage = new ProductsssPage(driver);
        productsssPage.sleepMy(2000);
        Assert.assertEquals(productsssPage.getName(), GlobalVaraible.Productsss.NAME_PRODUCTS);
        productsssPage.clickNameProduct(GlobalVaraible.Productsss.TITLE_NAME_LIST[2]);
        productsssPage.sleepMy(2000);
        System.out.println("777777");

//        ProductPage productPage = new ProductPage(driver);
//        Assert.assertEquals(productPage.getName(), GlobalVaraible.Productsss.ProductInside.BACK_TO_PRODUCTS);

    }
}
