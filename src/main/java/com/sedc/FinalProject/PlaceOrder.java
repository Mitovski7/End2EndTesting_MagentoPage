package com.sedc.FinalProject;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class PlaceOrder extends CommonComponents {
    static String ShippingStreetAddressValue = "Chedomir Kantardziev";
    static String ShippingCityNameValue = "Skopje";
    static String ShippingStateNameValue = "Macedonia";
    static String ShippingPostalCodeValue = "5614-5684";
    static String ShippingPhoneNumberValue = "047851496687";
    static String ShippingCompanyValue = "Dela";

    public static void FillShippingInfo()
    {
        FillElementWithValue(shippingCompanyXpath , ShippingCompanyValue);
        FillElementWithValue(shippingStreetAddressXpath , ShippingStreetAddressValue);
        FillElementWithValue(shippingCityXpath , ShippingCityNameValue);
        FillElementWithValue(shippingStateXpath, ShippingStateNameValue);
        FillElementWithValue(shippingPostalCodeXpath , ShippingPostalCodeValue);
        FillElementWithValue(shippingPhoneNumberXpath , ShippingPhoneNumberValue);

        ClickButtonByXpath(ShippingMethodsRadioButton);
        sleep(3000);
        ClickButtonByXpath(clickShippingNextButton);
    }
}
