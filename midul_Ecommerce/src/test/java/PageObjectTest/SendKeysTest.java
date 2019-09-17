package PageObjectTest;

import PageObject.SendKeys;
import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SendKeysTest extends BrowserDriver {
    SendKeys obj=null;
    @BeforeMethod
    public void element(){
        obj= PageFactory.initElements(driver,SendKeys.class);
    }
@Test
    public void Send(){
String actual=obj.SelectMethod();
String expect="Feedback has been sent to the administrator";
    Assert.assertEquals(actual,expect);
}





}
