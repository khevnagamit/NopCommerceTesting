package NopCommerceTesting;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ReferProductToFriend extends Utils {
    LoadProp loadProp = new LoadProp();

    private By _categoriesComputers =By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/computers\"]");
    private By _notebook =By.xpath("//h2/a[@href=\"/notebooks\"]");
    private By _macBookPro13inch = By.xpath("//img[contains(@src,'apple-macbook-pro-13-inch')]");
    private By _eMailFriendButton = By.xpath("//input[@onclick='setLocation(\"/productemailafriend/4\")']");
    private By _friendsEmailAddress=By.className("friend-email");
    private By _messageArea = By.xpath("//textarea[@id='PersonalMessage']");
    private By _sendEmailButton =By.name("send-email");
    private By _actualMsgSendResult=By.xpath("//div[@class=\"result\"]");
    private By _yourEmailAddress= By.id("YourEmailAddress");
    private By _actualMsgNotSentResult=By.xpath("//div[@class=\"message-error validation-summary-errors\"]");

    public void ReferProductToFriend() {
        clickOnElement(_categoriesComputers);
        clickOnElement(_notebook);
        clickOnElement(_macBookPro13inch);
        clickOnElement(_eMailFriendButton);
        enterText(_friendsEmailAddress, loadProp.getProperties("FriendEmail"));
        enterText(_messageArea, loadProp.getProperties("Message"));
    }
    public void ClickOnSendEmailButton(){
        clickOnElement(_sendEmailButton);
    }

    public void enterYourEmailAddress(){
        enterText(_yourEmailAddress,(loadProp.getProperties("FirstName")+loadProp.getProperties("Email")));
    }
    public void VerifySentMsgSuccessfully(){
        String actual = findText(_actualMsgSendResult);
        Assert.assertEquals(actual, loadProp.getProperties("ExpectedSendMsgSuccessfully"));

    }public void VerifyMsgNotSent(){
        String actual =findText(_actualMsgNotSentResult);
        Assert.assertEquals(actual,loadProp.getProperties("ExpectedErrorMsgForNonRegisterUser"));
    }
}
