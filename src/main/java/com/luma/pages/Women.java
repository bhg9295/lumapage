package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Women extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement women;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']")
            WebElement top;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jacket;
    @CacheLookup
    @FindBy(xpath = "//select[@id='sorter'])[1]")
            WebElement productName;
/*
    By women = By.xpath("//span[normalize-space()='Women']");
By top = By.xpath("//a[@id='ui-id-9']");
By jacket = By.xpath("By.xpath(//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
By productName = By.xpath("(//select[@id='sorter'])[1]");
*/

ArrayList<String> jacketsNameListBefore = new ArrayList<>();
ArrayList<String>  jacketsNameListAfter = new ArrayList<>();


public void mouseHoverWomen(){
    clickOnElement(women);
    CustomListeners.test.log(Status.PASS,"Women");
}
public void clickOnTops(){
    clickOnElement(top);
    CustomListeners.test.log(Status.PASS,"click on Tops");
}
public void clickOnJacket(){
    clickOnElement(jacket);
    CustomListeners.test.log(Status.PASS,"click on Jacket ");
}
public void jacketsNameListBefore (){

    List<WebElement> jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
    List<String> jacketsNameListBefore = new ArrayList<>();
    for (WebElement value : jacketsElementsList) {
        jacketsNameListBefore.add(value.getText());
    }}

public void jacketsElementsList(){
   List<WebElement> jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
    List<String> jacketsNameListAfter = new ArrayList<>();
    for (WebElement value : jacketsElementsList) {
        jacketsNameListAfter.add(value.getText());
    }
    }


public void clickProductName(){
    clickOnElement(productName);
    CustomListeners.test.log(Status.PASS,"click on productName");
}





}
