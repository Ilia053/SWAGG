package tests;

import org.testng.annotations.BeforeMethod;
import pageObject.GlobalVaraible;
import pageObject.LoginPage;
import pageObject.ProductsssPage;

public class BaseTestWithEnter extends BaseTest{

    @BeforeMethod
    public Object enter(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsssPage productsssPage = new ProductsssPage(driver);
        loginPage.insertName(GlobalVaraible.STANDARD_USER).insertPass(GlobalVaraible.CORRECT_PASSWORD).clickLoginElem().sleepMy(2000);
        return productsssPage;
    }
}
