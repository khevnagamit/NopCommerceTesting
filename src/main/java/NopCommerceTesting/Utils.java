package NopCommerceTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {
    // click on element
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    //enter text on input field
    public void enterText(By by,String text) {
        driver.findElement(by).sendKeys(text);
    }

    //date stamp
    public static String UniqueNumberDateFormate(){
        SimpleDateFormat sdf =new SimpleDateFormat("ddMMyyyyhhmmss");
        Date currDate = new Date();
        return sdf.format(currDate);
    }

    //get text from given Locator
    public String findText(By by){
        String text =driver.findElement(by).getText();
        return text;
    }

    public static void selectByVisibleText(By by,String text){
        Select select =new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void selectByIndexNumber(By by,Integer index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }
    public String findGetText(By by){
        String text =driver.findElement(by).getText();
        return text;
    }
    public static void timeWait(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
