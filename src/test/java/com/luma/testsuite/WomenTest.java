package com.luma.testsuite;

import com.luma.customlisteners.CustomListeners;
import com.luma.pages.Women;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;
@Listeners(CustomListeners.class)
public class WomenTest extends BaseTest {
    Women women ;
    @BeforeMethod(groups = {"sanity","smoke","regrassion"})
    public void inIT(){
        women = new Women();
    }

    List<String> jacketsNameListAfter;
    List<String> jacketsNameListBefore;

    @Test(groups = {"sanity", "regression"})
    public void verifyTheSortByProductNameFilter() {
        women.mouseHoverWomen();
        women.clickOnTops();
        women.clickOnJacket();
        women.jacketsNameListBefore();
        women.jacketsElementsList();
        sleep(2000);
        Assert.assertEquals(jacketsNameListAfter, jacketsNameListBefore, "Ascending order ");
    }

    @Test
    public void verifyTheSortByPriceFilter() {

    }

}
