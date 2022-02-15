package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.CartPage;
import pageObject.GlobalVaraible;
import pageObject.ProductsssPage;

public class TestSanity extends BaseTestWithEnter{

    @Test(testName = "SanityBasic")
    public void TestS(){
        productsssPage.addToCart(GlobalVaraible.Productsss.TITLE_NAME_LIST[0])
                .addToCart(GlobalVaraible.Productsss.TITLE_NAME_LIST[0]).sleepMy(2000)
                .openCart().ClickCheckOut().sleepMy(2000).fillEveryThingAndSend().clickFinish()
                .clickBackHome().sleepMy(2000);
        Assert.assertEquals(productsssPage.getUrlPage(), GlobalVaraible.Urls.BASE_URL_PRODUCT);

    }

}
