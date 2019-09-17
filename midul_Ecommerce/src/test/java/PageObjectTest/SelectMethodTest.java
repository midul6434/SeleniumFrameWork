package PageObjectTest;

import PageObject.Selectmethod;
import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectMethodTest extends BrowserDriver {
    Selectmethod obj = new Selectmethod();
    @BeforeMethod
    public void element(){
        obj= PageFactory.initElements(driver, Selectmethod.class);

    }
@Test
    public void selectetst(){
        String actualvalue=obj.TheoneIselect();
        String expect ="";
    Assert.assertEquals(actualvalue,expect);
}




}
