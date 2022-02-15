package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pageObject.GlobalVaraible;
import pageObject.ProductsssPage;
import tests.BaseTestWithEnter;

public class TestCompareCart extends BaseTestWithEnter {

    @Severity(SeverityLevel.NORMAL)
    @Description("Compare the cart and number of products")
    @Epic("Functional tests")
    @Feature("IconCart")
    @Story("Story")
    @Test(testName = "Compare the cart and number of products")
    public void test(){
        ProductsssPage productsssPage = new ProductsssPage(driver);
            int count = 0;
        for (String ss : GlobalVaraible.Productsss.TITLE_NAME_LIST) {
            productsssPage.addToCart(ss);
            count++;
        }
        if count.
    }
}
