package NopCommerceTesting;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckOut extends Utils {
    LoadProp loadProp=new LoadProp();

    private By _fahrenheitBook=By.xpath("//h2/a[@href=\"/fahrenheit-451-by-ray-bradbury\"]");
    private By _addToCartForFahrenheitBook=By.id("add-to-cart-button-37");
    private By _spanClose= By.xpath("//span[@class=\"close\"]");
    private By _addToCartButton=By.linkText("Shopping cart");
    private By _termAndCondition = By.id("termsofservice");
    private By _checkOutButton=By.xpath("//button[@id=\"checkout\"]");
    private By _guestCheckOut=By.xpath("//input[@class=\"button-1 checkout-as-guest-button\"]");
    private By _guestFirstName=By.id("BillingNewAddress_FirstName");
    private By _guestLastName=By.id("BillingNewAddress_LastName");
    private By _guestEmail=By.id("BillingNewAddress_Email");
    private By _Country=By.xpath("//select[@id=\"BillingNewAddress_CountryId\"]");
    private By _City=By.id("BillingNewAddress_City");
    private By _Address1=By.id("BillingNewAddress_Address1");
    private By _PostalCode=By.id("BillingNewAddress_ZipPostalCode");
    private By _PhoneNumber=By.id("BillingNewAddress_PhoneNumber");
    private By _continueShippingAddress=By.xpath("//div[@id=\"billing-buttons-container\"]//input[@class=\"button-1 new-address-next-step-button\"]");
    private By _continueShipingMethod=By.xpath("//input[@class=\"button-1 shipping-method-next-step-button\"]");
    private By _paymentMethod =By.id("paymentmethod_1");
    private By _continuePaymentMethod=By.xpath("//input[@class=\"button-1 payment-method-next-step-button\"]");
    private By _selectCard=By.id("CreditCardType");
    private By _cardHolderName=By.id("CardholderName");
    private By _cardNumber=By.id("CardNumber");
    private By _cardExpiryMonth=By.id("ExpireMonth");
    private By _cardExpiryYear = By.id("ExpireYear");
    private By _cardCVVCode = By.id("CardCode");
    private By _continuePaymentInformation=By.xpath("//input[@class=\"button-1 payment-info-next-step-button\"]");
    private By _continueConfirmOrder= By.xpath("//input[@class=\"button-1 confirm-order-next-step-button\"]");
    private By _actualConfirmationOrder=By.xpath("//div[@class=\"section order-completed\"]//div[@class=\"title\"]");


    public void UserShouldAddProductInBasket(){
        clickOnElement(_fahrenheitBook);
        clickOnElement(_addToCartForFahrenheitBook);
        clickOnElement(_spanClose);
        clickOnElement(_addToCartButton);
        clickOnElement(_termAndCondition);
        clickOnElement(_checkOutButton);
    }
    public void UserShouldCheckoutAsGuest(){
        clickOnElement(_guestCheckOut);
        enterText(_guestFirstName,loadProp.getProperties("GuestFirstName"));
        enterText(_guestLastName,loadProp.getProperties("GuestLastName"));
        enterText(_guestEmail,loadProp.getProperties("GuestEmail"));
        selectByIndexNumber(_Country,233);
        enterText(_City,loadProp.getProperties("GuestCity"));
        enterText(_Address1,loadProp.getProperties("GuestAddress1"));
        enterText(_PostalCode,loadProp.getProperties("GuestPostalCode"));
        enterText(_PhoneNumber,loadProp.getProperties("GuestPhone"));
        clickOnElement(_continueShippingAddress);
        timeWait();
        clickOnElement(_continueShipingMethod);
        clickOnElement(_paymentMethod);
        clickOnElement(_continuePaymentMethod);
        selectByIndexNumber(_selectCard,1);
        enterText(_cardHolderName,loadProp.getProperties("GuestFirstName"));
        enterText(_cardNumber,loadProp.getProperties("CardNumber"));
        selectByIndexNumber(_cardExpiryMonth,7);
        selectByIndexNumber(_cardExpiryYear,3);
        enterText(_cardCVVCode,loadProp.getProperties("CardCVVNumber"));
        clickOnElement(_continuePaymentInformation);
        timeWait();
        clickOnElement(_continueConfirmOrder);
    }

    public void registerUserCheckout(){
        clickOnElement(_continueShippingAddress);
        timeWait();
        clickOnElement(_continueShipingMethod);
        clickOnElement(_paymentMethod);
        clickOnElement(_continuePaymentMethod);
        selectByIndexNumber(_selectCard,1);
        enterText(_cardHolderName,loadProp.getProperties("FirstName"));
        enterText(_cardNumber,loadProp.getProperties("CardNumber"));
        selectByIndexNumber(_cardExpiryMonth,7);
        selectByIndexNumber(_cardExpiryYear,3);
        enterText(_cardCVVCode,loadProp.getProperties("CardCVVNumber"));
        clickOnElement(_continuePaymentInformation);
        timeWait();
        clickOnElement(_continueConfirmOrder);

    }
    public void VerifyConfirmationOrder(){
        Assert.assertEquals(findGetText(_actualConfirmationOrder),loadProp.getProperties("ExpectedOrderConfirmation"));
    }
}
