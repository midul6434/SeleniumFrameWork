package PageObjectTest;

import PageObject.WomanDress;
import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WomanDressTest extends BrowserDriver {
    WomanDress objwoman= null;
    @BeforeMethod
    public  void Anotherther(){
        objwoman= PageFactory.initElements(driver,WomanDress.class);

    }

    @Test
    public void womandress() {
        String actualvalue = objwoman.Men();
        String expectedvalue = "649 RESULTS FOR SUITS";
        Assert.assertEquals(actualvalue, expectedvalue);


    }
    @Test
    public void sweatertest(){
        String actualresult=objwoman.Sweater();
        String expectedresult ="";
        Assert.assertEquals(actualresult,expectedresult);
    }
}

