package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;

    @BeforeClass
    public void setupChromeDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setupDrive(String address){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(address);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
