import com.sedc.FinalProject.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class End2EndTesting extends CommonComponents  {
    @BeforeClass
    public void beforeClass(){
        SetUp.setup();
    }

    @Test (description = "Create user account",priority = 1, enabled = true)
    public void CreateAccount() {

        RegistrationAccount.NavigateToCreateAccount();
        RegistrationAccount.InsertAccountDetails();
        Assert.assertEquals(GetElementText(PasswordStrengthMessageXpath),"Very Strong");
        RegistrationAccount.CreateAnAccount();
        Assert.assertEquals(GetElementText(RegisteringMessageXpath),"Thank you for registering with Main Website Store.");
        sleep(2000);
    }

    @Test (description = "Create user account",priority = 2, enabled = true)
    public void AddProducts()
    {
        // Add one man product
        AddProducts.AddProduct(true);//man

        GetElementText(productNameXpath);
        Assert.assertEquals(GetElementText(productNameXpath),"Hero Hoodie");

        GetElementText(AddedProductToCartMessageXpath);
        Assert.assertEquals(GetElementText(AddedProductToCartMessageXpath),"You added Hero Hoodie to your shopping cart.");

       // Add one woman product
        AddProducts.AddProduct(false);// woman

        GetElementText(productNameXpath);
        Assert.assertEquals(GetElementText(productNameXpath),"Breathe-Easy Tank");

        GetElementText(AddedProductToCartMessageXpath);
        Assert.assertEquals(GetElementText(AddedProductToCartMessageXpath),"You added Breathe-Easy Tank to your shopping cart.");

        sleep(3000);
    }

    @Test (description = "ProceedToCheckOut",priority = 3, enabled = true)
    public void CheckOut() {
        ClickButtonByXpath(ShowCartXpath);
        sleep(3000);
        ClickButtonByXpath(proceedToCheckoutXpath);
        sleep(3000);
        PlaceOrder.FillShippingInfo();

        GetElementText(OrderSummaryXpath);
        GetElementText(ShoppingCartCountXpath);
        Assert.assertEquals(GetElementText(ShoppingCartCountXpath),"2");
        GetElementText(CartSubtotalXpath);
        Assert.assertEquals(GetElementText(CartSubtotalXpath),"$88.00");
        sleep(3000);
    }

    @Test(description = "Place order", priority = 6, enabled = true)
    public void PlaceOrder(){
        ClickButtonByXpath(CommonComponents.PlaceOrderXpath);
        sleep(3000);
        GetElementText(MainContentXpath);
        Assert.assertEquals(GetElementText(MainContentXpath),"Thank you for your purchase!");
        ClickButtonByXpath(PrintReceiptXpath);
    }

    @AfterClass
    public void afterClass() {
        SetUp.end();
    }

}
