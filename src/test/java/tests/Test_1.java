package tests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.GlobalVaraible;
import pageObject.LoginPage;
import pageObject.ProductsssPage;

public class Test_1 extends BaseTest{

        @Severity(SeverityLevel.BLOCKER)
        @Description("Just enter")
        @Epic("E-01")
        @Feature("Feature_2:Login")
        @Story("Story")
        @Test
        public void test1(){
            LoginPage loginPage = new LoginPage(driver);
            Assert.assertEquals(loginPage.insertName(GlobalVaraible.INCORRECT_USER).insertPass(GlobalVaraible.CORRECT_PASSWORD).clickLoginElem().getErorrText(),GlobalVaraible.ERORR_MESSAGE_2);
            loginPage.insertName(GlobalVaraible.STANDARD_USER).insertPass(GlobalVaraible.CORRECT_PASSWORD).clickLoginElem().sleepMy(2000);

            ProductsssPage productsssPage = new ProductsssPage(driver);
            Assert.assertEquals(productsssPage.getUrlPage(), GlobalVaraible.Urls.BASE_URL_PRODUCT);
            Assert.assertEquals(productsssPage.getName(), GlobalVaraible.Productsss.NAME_PRODUCTS);
        }
}
