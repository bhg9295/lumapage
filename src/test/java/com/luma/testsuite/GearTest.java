package com.luma.testsuite;

import com.luma.customlisteners.CustomListeners;
import com.luma.pages.Gear;
import com.luma.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.w3c.dom.Element;

import static com.sun.org.apache.xml.internal.security.utils.XMLUtils.getAttributeValue;
@Listeners(CustomListeners.class)
public class GearTest extends BaseTest {
    Gear test;
  @BeforeMethod(groups = {"sanity","smoke","regrassion"})
    public void inIT(){
        test =new Gear();
    }
    @Test(groups = {"sanity", "regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart(){
test.hoverGearMenu();
test.setClickBag();
test.productnameovernightDuffle();

String verifyOvvernightDuffle = "Overnight Duffle";
        String verifyOverNightDuffleText =  getTextFromElement(By.xpath("//span[@class='base']"));
        Assert.assertEquals(verifyOvvernightDuffle,verifyOverNightDuffleText);
        sleep(2000);
        test.changeQty();
        test.addtocartProduct();
        sleep(2000);
        String actualMessage = "You added Overnight Duffle to your shopping cart.";
        String expectedMessage =  getTextFromElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
        sleep(2000);
        Assert.assertEquals(actualMessage,expectedMessage);
        test.clickonshoppingcartlink();
        sleep(2000);
        String verifyNameOvernightDuffle ="Overnight Duffle";
        String expectedverifyNameOvernightDuffle = getTextFromElement(By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']"));
Assert.assertEquals(verifyNameOvernightDuffle,expectedverifyNameOvernightDuffle,"the product name ‘Overnight Duffle’");
        sleep(2000);
String actualQty3 = "3";
String expectedQty3 = getAttributeValue((Element) By.xpath("//input[@title='Qty']"), "value");
        sleep(2000);
Assert.assertEquals(actualQty3,expectedQty3,"Qty 3 is not dispaly");
String actualPriseProduct = "$135.00";
        sleep(2000);
String expectedPriseProduct = getTextFromElement(By.xpath("(//span[@class='cart-price']//span)[2]"));
Assert.assertEquals(actualPriseProduct,expectedPriseProduct,"product Prise is not verify");
        sleep(2000);
test.clickchangeqty5();
test.clickonUpdatecart();
        sleep(2000);
String productPrice = "‘$225.00";
String verifyproductPrice =  getTextFromElement(By.xpath("(//span[@class='cart-price']//span)[2]"));
Assert.assertEquals(productPrice,verifyproductPrice,"Product price is not right");

    }
    }


