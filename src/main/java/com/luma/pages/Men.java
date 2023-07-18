package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Men extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement mens;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
            WebElement bottom;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
            WebElement cronusYoga;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option text'])[1]")
    WebElement clicksize;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
            WebElement clickonColourBlack;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement yoga;
    @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
            WebElement AddToCart;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
            WebElement shoppingCart;

 /*   By mens = By.xpath("//span[normalize-space()='Men']");
By bottom = By.xpath("//a[@id='ui-id-18']");
By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
By cronusYoga = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
By clicksize = (By.xpath("(//div[@class='swatch-option text'])[1]"));
By clickonColourBlack = (By.xpath("(//div[@class='swatch-option color'])[1]"));
By yoga = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
By AddToCart =By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
By shoppingCart = (By.xpath("//a[normalize-space()='shopping cart']"));*/
public void mouseHourMenMenu(){
    clickOnElement(mens);
    CustomListeners.test.log(Status.PASS,"click on mens");
}
public void mouseHourBottomMenu(){
    Reporter.log("mouse Hour Bottom Menu" + bottom.toString());
    clickOnElement(bottom);
    CustomListeners.test.log(Status.PASS,"click on Botton");

}
public void clickonPents(){
    Reporter.log(" click on Pents" + pants.toString());
    clickOnElement(pants);
    CustomListeners.test.log(Status.PASS,"click on Pents");
}
public void setCronusYoga(){
    Reporter.log(" set Cronus Yoga" + cronusYoga.toString());
    clickOnElement(cronusYoga);
    CustomListeners.test.log(Status.PASS,"cronusYoga");
}
public void setClicksize(){
    Reporter.log(" set click on size" + clicksize.toString());
    clickOnElement(clicksize);
    CustomListeners.test.log(Status.PASS,"click on size");
}
public void clickonblackcolourpents(){
    Reporter.log(" click on black colourpents" + clickonColourBlack.toString());
    clickOnElement(clickonColourBlack);
    CustomListeners.test.log(Status.PASS,"click onColourBlack");
}
public void clickonyogapants(){
    Reporter.log(" click on yogapants" + yoga.toString());
    clickOnElement(yoga);
    CustomListeners.test.log(Status.PASS,"click on yoga Pants");
}
public void setAddToCart(){
    Reporter.log(" set Add To Cart" + AddToCart.toString());
    clickOnElement(AddToCart);
    CustomListeners.test.log(Status.PASS,"AddToCart");
}
public void clickonShoppingCart(){
    Reporter.log(" click on Shopping Cart" + shoppingCart.toString());
    clickOnElement(shoppingCart);
    CustomListeners.test.log(Status.PASS,"click on ShoppingCart");
}

}
