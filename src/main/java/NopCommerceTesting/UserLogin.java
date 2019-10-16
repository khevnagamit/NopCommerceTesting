package NopCommerceTesting;

import org.openqa.selenium.By;

public class UserLogin extends Utils {
    LoadProp loadProp = new LoadProp();

    private By _loginUser=By.xpath("//input[@class=\"button-1 login-button\"]");
    private By _enterEmail=By.id("Email");
    private By _enterPassword=By.id("Password");
    private String registeredUserEmail=loadProp.getProperties("RegisteredEmail");
    private String registeredUserPassword=loadProp.getProperties("RegisteredPassword");

    public void UserShouldLogin(){
        enterText(_enterEmail,registeredUserEmail);
        enterText(_enterPassword,registeredUserPassword);
        clickOnElement(_loginUser);
    }
}
