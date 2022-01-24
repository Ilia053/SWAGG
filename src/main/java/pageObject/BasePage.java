package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
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

    public void fillField(WebElement elem, String text){
        elem.clear();
        elem.sendKeys(text);
    }

    public void clickElem(WebElement elem){
        elem.click();
    }

    public String getTextElem(WebElement elem){
        return elem.getText();
    }

    public String getUrlPage(){
        return driver.getCurrentUrl();
    }

    public void sleepMy(long x){
        try {
            Thread.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
