package page_test;

import Page_Calss.HomePage;
import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class HomepageTest extends BrowserDriver {
    HomePage obj = null;

    @BeforeMethod
    public void Element() {
        obj = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void searchtest() {
        String actualvalue = obj.search();
        String expectedvalues = "Featured Listings";
        Assert.assertEquals (actualvalue, expectedvalues);
        System.out.println(actualvalue);
    }

    @Test
    public void serTest(){
        String actualvalue=obj.ser();
        String expectedvalues = "Search MLS Listings";
        Assert.assertEquals(actualvalue, expectedvalues);
        System.out.println(actualvalue);
    }

    @Test
    public void soldtest(){
        String actualvalues = obj.sold();
        String expectedvalues = "Our Sold Properties";
        Assert.assertEquals(actualvalues, expectedvalues);
        System.out.println(actualvalues);
    }

    @Test
    public void homtest(){
        String actualvalues = obj.hom();
        String expectedvalues = "For Rent";
        Assert.assertEquals(actualvalues, expectedvalues);
        System.out.println(actualvalues);
    }

}

