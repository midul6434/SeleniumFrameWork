package PageObjectTest;

import PageObject.HomePage;
import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BrowserDriver {
    HomePage obj=null;
    @BeforeMethod
    public void Element() {
        obj = PageFactory.initElements(driver,HomePage.class);

    }

    @Test
    public void sarchtest() {
        String actualvalue = obj.search();
        String expectedvalues = "1418 RESULTS FOR PANTS";
        Assert.assertEquals(actualvalue, expectedvalues);
    }


    @Test
    public void Anoothertest(){
        String actualresult=obj.Anothersarch();
        String expectedvalue="1 through 60 of 284 items";
        Assert.assertEquals(actualresult,expectedvalue);
    }

}
