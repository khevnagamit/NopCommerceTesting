package NopCommerceTesting;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    private By _registrationButton = By.xpath("//a[@class='ico-register']");
    private By _loginButton=By.className("ico-login");
    private By _booksButton = By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/books\"]");


    public void clickOnRegistrationButton(){
        //click on register button
        clickOnElement(_registrationButton);
    }
    public void clickOnLoginButton(){
        clickOnElement(_loginButton);
    }
    public void clickOnBooksPage(){
        clickOnElement(_booksButton);
    }
}
