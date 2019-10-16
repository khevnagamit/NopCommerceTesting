package NopCommerceTesting;

import org.openqa.selenium.By;
import org.testng.Assert;

public class UserRegistration extends Utils {
    LoadProp loadProp = new LoadProp();

    private By _firstName = By.id("FirstName");
    private By _lastName =By.xpath("//input[@name='LastName']");
    private By _email =By.name("Email");
    private By _password =By.id("Password");
    private By _confirmPassword= By.id("ConfirmPassword");
    private By _registerButton =By.id("register-button");
    private By _actualMsg = By.xpath("//div[@class=\'result\']");

    public void varifyUserIsOnRegistrationPage(){
    }


    public void enterRegistrationData(){
        enterText(_firstName,loadProp.getProperties("FirstName"));
        enterText(_lastName,loadProp.getProperties("Lastname"));
        enterText(_email,(loadProp.getProperties("FirstName"))+UniqueNumberDateFormate()+loadProp.getProperties("Email"));
        enterText(_password,loadProp.getProperties("Password"));
        enterText(_confirmPassword,loadProp.getProperties("ConfirmPassword"));
        clickOnElement(_registerButton);
    }

    public void verifyUserRegisterSuccessfully(){
        String actualMsg = findText(_actualMsg);
        Assert.assertEquals(actualMsg,loadProp.getProperties("ExpectedRegSuccessfullyMsg"));
    }
}
