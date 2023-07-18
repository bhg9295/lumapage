package com.luma.testsuite;


import com.luma.customlisteners.CustomListeners;
import com.luma.pages.Men;
import com.luma.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class MenTest extends BaseTest {
    Men men ;
    @BeforeMethod(groups = {"sanity","smoke","regrassion"})
    public void inIT(){
        men = new Men();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        men.mouseHourMenMenu();
        men.mouseHourBottomMenu();
        men.clickonPents();
        men.setCronusYoga();
        men.setClicksize();
        men.clickonblackcolourpents();
        men.clickonyogapants();
        men.setAddToCart();
        sleep(2000);
        String actualMessage = "You added Cronus Yoga Pant to your shopping cart.";
        String expectedMessage = getTextFromElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
        sleep(2000);
        Assert.assertEquals(actualMessage, expectedMessage, "Message not display");
        men.clickonShoppingCart();
        sleep(2000);
        String actualProductsize = "32";
        String expectedProductsize = getTextFromElement(By.xpath("//dd[contains(text(),'32')]"));
        Assert.assertEquals(actualProductsize, expectedProductsize, "size is not display");
        sleep(2000);
        String verifycolour = "Black";
        String verifyBlackColour = getTextFromElement(By.xpath("//dd[contains(text(),'Black')]"));
        Assert.assertEquals(verifycolour, verifyBlackColour, "Colour not select");

    }

}
