package com.sedc.FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CommonComponents extends SetUp {

    public static void FillElementWithValue(By elementXpath, String elementValue){
        wait.until(ExpectedConditions.presenceOfElementLocated(elementXpath)).sendKeys(elementValue);
    }
    public static void ClickButtonByXpath(By elementXpath){
        wait.until(ExpectedConditions.presenceOfElementLocated(elementXpath)).click();
    }

    public static String GetElementText(By elementXpath){
        return wait.until(ExpectedConditions.presenceOfElementLocated(elementXpath)).getText();
    }
    protected static By proceedToCheckoutXpath = By.xpath("//*[@id='top-cart-btn-checkout']");
    protected static By shippingCompanyXpath = By.xpath("//div[@name='shippingAddress.company']/div/input");
    protected static By shippingStreetAddressXpath  = By.xpath("//div[@name='shippingAddress.street.0']/div/input");
    protected static By shippingCityXpath  = By.xpath("//div[@name='shippingAddress.city']/div/input");
    protected static By shippingStateXpath = By.xpath("//div[@name='shippingAddress.region_id']/div/select");
    protected static By shippingPostalCodeXpath  = By.xpath("//div[@name='shippingAddress.postcode']/div/input");
    protected static By shippingPhoneNumberXpath  = By.xpath("//div[@name='shippingAddress.telephone']/div/input");
    protected static By clickShippingNextButton = By.xpath("//button[@class='button action continue primary']/span");
    protected static By ShippingMethodsRadioButton = By.xpath("//td[@class='col col-method']/input");
    protected static By productNameXpath = By.xpath("//span[@class='base']");
    protected static By AddedProductToCartMessageXpath = By.xpath("//div[@class='message-success success message']/div");
    protected static By PasswordStrengthMessageXpath = By.xpath("//span[@id='password-strength-meter-label']");
    protected static By RegisteringMessageXpath = By.xpath("//div[@class='message-success success message']/div");
    protected static By ShoppingCartCountXpath = By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/div/div[1]/strong/span[1]");
    protected static By PersonalInformationTitleXpath = By.xpath("//fieldset[@class='fieldset create info']/legend/span");
    protected static By CartSubtotalXpath = By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[3]/td/strong/span");
    protected static By OrderSummaryXpath = By.xpath("//*[@class='opc-block-summary']");
    protected static By ShowCartXpath = By.xpath("//html/body/div[1]/header/div[2]/div[1]/a");
    protected static By PlaceOrderXpath = By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span");
    protected static By MainContentXpath = By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span");
    protected static By PrintReceiptXpath = By.xpath("//*[@id=\"maincontent\"]/div[1]/a");
    protected static By CreateAnAccountFieldXpath = By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[3]/a");
    protected static By FirstNameFieldXpath = By.xpath("//input[@id='firstname' and @title='First Name']");
    protected static By LastNameFieldId = By.id("lastname");
    protected static By EmailFieldId = By.id("email_address");
    protected static By PasswordFieldId = By.id("password");
    protected static By ConfirmPasswordFieldId = By.id("password-confirmation");
    protected static By CreateAnAccFieldXpath = By.xpath("//div[@class='actions-toolbar']/div[@class='primary']/button/span");

}
