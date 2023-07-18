package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Gear extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement  gearMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-25']")
    WebElement clickBag;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
            WebElement overnightDuffle;
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement qty3;
    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
            WebElement addCart;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingcartlink;
    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
            WebElement changeQty5;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart;

   /* By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By clickBag = By.xpath("//span[normalize-space()='Bags']");
    By overnightDuffle = (By.xpath("//a[normalize-space()='Overnight Duffle']"));
    By qty3 = By.xpath("//input[@id='qty']");
    By addCart = By.xpath("//button[@id='product-addtocart-button']");
By shoppingcartlink =By.xpath("//a[normalize-space()='shopping cart']");
By changeQty5 = (By.xpath("(//input[@class='input-text qty'])[1]"));
By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");*/
    public void hoverGearMenu() {
clickOnElement(gearMenu);
        CustomListeners.test.log(Status.PASS,"click on GearMenu");
    }

    public void setClickBag() {
        clickOnElement(clickBag);
        CustomListeners.test.log(Status.PASS,"click on setClickBag");
    }
    public void productnameovernightDuffle(){
        clickOnElement(overnightDuffle);
        CustomListeners.test.log(Status.PASS,"overnightDuffle");
    }
    public void changeQty() {
        clickOnElement(qty3);
        CustomListeners.test.log(Status.PASS,"changeQty");
    }
    public void addtocartProduct() {
       clickOnElement(addCart);
        CustomListeners.test.log(Status.PASS,"add to Cart");
    }
    public void clickonshoppingcartlink(){
        clickOnElement(shoppingcartlink);
        CustomListeners.test.log(Status.PASS,"click on shoppingcartlink");
    }
    public void clickchangeqty5(){
        clickOnElement(changeQty5);
        CustomListeners.test.log(Status.PASS,"click on Changeqty5");
    }
    public void clickonUpdatecart(){
        clickOnElement(updateShoppingCart);
        CustomListeners.test.log(Status.PASS,"click on Updatecart");
    }
}