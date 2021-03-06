package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    WebDriver driver;
    WebDriverWait driverWait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driverWait = new WebDriverWait(driver, 30);

    }

    public void waitisVisible(WebElement elem){
        driverWait.until(ExpectedConditions.visibilityOf(elem));
    }
    public void waitisClickable(WebElement elem){
        waitisVisible(elem);
        driverWait.until(ExpectedConditions.elementToBeClickable(elem));
    }

    public BasePage fillField(WebElement elem, String text){
        waitisVisible(elem);
        elem.clear();
        elem.sendKeys(text);
        return this;
    }

    public void clickElem(WebElement elem){
        waitisClickable(elem);
        elem.click();
    }

    public String getTextElem(WebElement elem){
        waitisVisible(elem);
        return elem.getText();
    }

    public String getUrlPage(){
        return driver.getCurrentUrl();
    }

    public BasePage sleepMy(long x){
        try {
            Thread.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public void correct(String str1, String str2){

    }

    public void tearDown() {
        driver.quit();
    }
}
