package tests;

import org.testng.annotations.Test;
import pageObject.GlobalVaraible;
import pageObject.LoginPage;

public class Test_1 extends BaseTest{
        @Test
        public void test1(){
            LoginPage loginPage = new LoginPage(driver);
            loginPage.insertName(GlobalVaraible.STANDARD_USER).insertPass(GlobalVaraible.CORRECT_PASSWORD).clickLoginElem().sleepMy(2000);
        }
}
