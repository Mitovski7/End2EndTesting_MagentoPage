package com.sedc.FinalProject;

import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

public class RegistrationAccount extends CommonComponents {
    static String firstnameValue = "Mario";
    static String lastnameValue = "Mitovski";
    static String passwordValue = "TemporaryPasword12345!";
    static String confirmPasswordValue = "TemporaryPasword12345!";

    public static void NavigateToCreateAccount()
    {
        ClickButtonByXpath(CreateAnAccountFieldXpath);
        GetElementText(PersonalInformationTitleXpath);
    }

    public static void InsertAccountDetails()
    {
        FillElementWithValue(FirstNameFieldXpath,firstnameValue);
        FillElementWithValue(LastNameFieldId,lastnameValue);

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        String emailValue = firstnameValue + lastnameValue + randomInt + "@gmail.com";
        FillElementWithValue(EmailFieldId,emailValue);

        FillElementWithValue(PasswordFieldId,passwordValue);
        FillElementWithValue(ConfirmPasswordFieldId,confirmPasswordValue);
        GetElementText(PasswordStrengthMessageXpath);
    }
    public static void CreateAnAccount() {
        ClickButtonByXpath(CreateAnAccFieldXpath);
        GetElementText(RegisteringMessageXpath);

    }

}
