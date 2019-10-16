package NopCommerceTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSelector extends Utils {
    LoadProp loadProp = new LoadProp();
    public void setUpBrowser(){
        String browser =loadProp.getProperties("browser");

        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src\\test\\Resourses\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src\\test\\Resourses\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","src\\test\\Resourses\\BrowserDriver\\MicrosoftWebDriver.exe");
            driver = new EdgeDriver();
        }
        else if(browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","src\\test\\Resourses\\BrowserDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else
            System.out.println("Browser name is Emplty or typed wrong URL");
    }
}
