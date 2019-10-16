package NopCommerceTesting;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    HomePage homePage= new HomePage();
    UserRegistration userRegistration = new UserRegistration();
    ReferProductToFriend referProductToFriend =new ReferProductToFriend();
    CheckOut checkOut = new CheckOut();
    UserLogin userLogIn =new UserLogin();

    @Given("^user is on register page$")
    public void userIsOnRegisterPage() {
        homePage.clickOnRegistrationButton();
    }

    @When("^user enter information$")
    public void userEnterInformation() {
        userRegistration.enterRegistrationData();
    }

    @Then("^user should be register successfully$")
    public void userShouldBeRegisterSuccessfully() {
        userRegistration.verifyUserRegisterSuccessfully();

    }

    @And("^user refer product to friend$")
    public void userReferProductToFriend() {
        referProductToFriend.ReferProductToFriend();
    }

    @And("^click on sent email$")
    public void clickOnSentEmail() {
        referProductToFriend.ClickOnSendEmailButton();

    }

    @Then("^email should sent successfully$")
    public void emailShouldSentSuccessfully() {
        referProductToFriend.VerifySentMsgSuccessfully();
    }

    @And("^enter his email$")
    public void enterHisEmail() {
        referProductToFriend.enterYourEmailAddress();
    }

    @Then("^user should be should see error message$")
    public void userShouldBeShouldSeeErrorMessage() {
        referProductToFriend.VerifyMsgNotSent();
    }

    @Given("^user is loggedin$")
    public void userIsLoggedin() {
        homePage.clickOnLoginButton();
        userLogIn.UserShouldLogin();
    }

    @When("^user is on books page$")
    public void userIsOnBooksPage() {
        homePage.clickOnBooksPage();
    }

    @And("^select a product$")
    public void selectAProduct() {
        checkOut.UserShouldAddProductInBasket();
    }

    @And("^user buy that product$")
    public void userBuyThatProduct() {
        checkOut.registerUserCheckout();
    }


    @Then("^user should able to purchase successfully$")
    public void userShouldAbleToPurchaseSuccessfully() {
        checkOut.VerifyConfirmationOrder();
    }

    @And("^user buy that product as guest$")
    public void userBuyThatProductAsGuest() {
        checkOut.UserShouldCheckoutAsGuest();
    }
}
