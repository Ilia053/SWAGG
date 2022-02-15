package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObject.GlobalVaraible;
import pageObject.LoginPage;
import pageObject.ProductPage;
import pageObject.ProductsssPage;

public class test_for_data extends BaseTest{

    @Test(dataProvider = "get_data")
    public void test_for(String x,String y){
        LoginPage loginPage = new LoginPage(driver);
        loginPage
                .insertName(x)
                .insertPass(y)
                .clickLoginElem();
        ProductsssPage productsssPage = new ProductsssPage(driver);
        Assert.assertEquals(productsssPage.getUrlPage(), GlobalVaraible.Urls.BASE_URL_PRODUCT);
    }

    @DataProvider
    public Object[][] get_data(){
        return new Object[][]{
                {GlobalVaraible.STANDARD_USER,GlobalVaraible.CORRECT_PASSWORD},
                {GlobalVaraible.PROBLEM_USER,GlobalVaraible.CORRECT_PASSWORD},
                {GlobalVaraible.GLITCH_USER,GlobalVaraible.CORRECT_PASSWORD},
        };
    }
}
