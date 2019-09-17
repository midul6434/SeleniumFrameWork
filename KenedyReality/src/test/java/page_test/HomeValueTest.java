package page_test;

import Page_Calss.HomeValue;
import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeValueTest extends BrowserDriver {
    HomeValue obj = null;

    @BeforeMethod
    public void ini() {
        obj =  PageFactory.initElements(driver, HomeValue.class);
    }
    @Test
    public void main(){

        String actualvalue=obj.Real();
        String Expected ="";
        Assert.assertEquals(actualvalue,Expected);
    }
}
