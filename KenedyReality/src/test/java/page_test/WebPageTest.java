package page_test;

import Page_Calss.WebPage;
import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebPageTest extends BrowserDriver {
    WebPage obj = null;


    @BeforeMethod
    public void Element() {
        obj = PageFactory.initElements(driver, WebPage.class);
    }


    @Test
    public void febtest() {
        String actualvalue = obj.feb();
        String expectedvalues = "";
        Assert.assertEquals(actualvalue, expectedvalues);

    }
}
