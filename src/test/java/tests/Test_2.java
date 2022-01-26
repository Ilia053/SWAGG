package tests;

import org.testng.annotations.Test;
import pageObject.ProductsssPage;

public class Test_2 extends BaseTestWithEnter{

    @Test
    public void test_2(){
            ProductsssPage productsssPage = new ProductsssPage(driver);
            productsssPage.getName();
            enter();//
        

    }
}
