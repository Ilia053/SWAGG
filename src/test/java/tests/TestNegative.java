package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObject.GlobalVaraible;
import pageObject.LoginPage;
import pageObject.ProductsssPage;

import java.util.Arrays;

public class TestNegative extends BaseTest{


    @Test(dataProvider = "getData")
    public void testttt(String x,String y,String s){
            LoginPage loginPage = new LoginPage(driver);
            loginPage
                    .insertName(x)
                    .insertPass(y)
                    .clickLoginElem();
            Assert.assertEquals(loginPage.getErorrText(), s);
        }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {GlobalVaraible.LOCKED_USER, GlobalVaraible.CORRECT_PASSWORD,GlobalVaraible.ERORR_MESSAGE_4},
                {GlobalVaraible.EMPTY_USER, GlobalVaraible.CORRECT_PASSWORD, GlobalVaraible.ERORR_MESSAGE_1},
                {GlobalVaraible.EMPTY_USER, GlobalVaraible.CORRECT_PASSWORD, GlobalVaraible.ERORR_MESSAGE_1},
                {GlobalVaraible.EMPTY_USER, GlobalVaraible.CORRECT_PASSWORD, GlobalVaraible.ERORR_MESSAGE_1},
                {GlobalVaraible.EMPTY_USER, GlobalVaraible.CORRECT_PASSWORD, GlobalVaraible.ERORR_MESSAGE_1},
                {GlobalVaraible.EMPTY_USER, GlobalVaraible.CORRECT_PASSWORD, GlobalVaraible.ERORR_MESSAGE_1},
                {GlobalVaraible.EMPTY_USER, GlobalVaraible.CORRECT_PASSWORD, GlobalVaraible.ERORR_MESSAGE_1},
                {GlobalVaraible.EMPTY_USER, GlobalVaraible.CORRECT_PASSWORD, GlobalVaraible.ERORR_MESSAGE_1},
                {GlobalVaraible.EMPTY_USER, GlobalVaraible.CORRECT_PASSWORD, GlobalVaraible.ERORR_MESSAGE_1},
                {GlobalVaraible.EMPTY_USER, GlobalVaraible.CORRECT_PASSWORD, GlobalVaraible.ERORR_MESSAGE_1},
//                {GlobalVaraible.INCORRECT_USER, GlobalVaraible.CORRECT_PASSWORD, GlobalVaraible.ERORR_MESSAGE_3},
        };
    }

}
