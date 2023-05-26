package com.sedc.FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public  class AddProducts extends CommonComponents {
    static String ButtonPath;
    static String ProductItem;
    static String AddToCart;
    static String ProductColor;
    static String ProductSize;

    public static void AddProduct (boolean man){

        AddToCart = "//button[@id='product-addtocart-button']/span";

        if(man) {
            ButtonPath = "//a[@id='ui-id-5']/span[2]";
            ProductItem = "//a[@title='Hero Hoodie']";
            ProductColor = "//div[@id = 'option-label-color-93-item-53']";
            ProductSize = "//div[@id='option-label-size-143-item-168']";

        }
        else {
            ButtonPath = "//a[@id='ui-id-4']/span[2]";
            ProductItem = "//a[@title='Breathe-Easy Tank']";
            ProductColor = "//div[@id = 'option-label-color-93-item-60']";
            ProductSize = "//div[@id='option-label-size-143-item-167']";
        }
        ClickButtonByXpath(By.xpath(ButtonPath));
        ClickButtonByXpath(By.xpath(ProductItem));
        ClickButtonByXpath(By.xpath(ProductSize));
        ClickButtonByXpath(By.xpath(ProductColor));
        ClickButtonByXpath(By.xpath(AddToCart));
    }

}
