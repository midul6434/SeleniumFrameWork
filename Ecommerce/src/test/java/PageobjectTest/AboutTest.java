package PageobjectTest;

import PageObject.About;
import PageObject.HomePage;
import PageObject.LearnSelect;
import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AboutTest extends BrowserDriver {
    HomePage obj=null;
    About object;
    LearnSelect selectobj;
    @BeforeMethod
    public void run(){
        obj = PageFactory.initElements(driver, HomePage.class);
        selectobj=PageFactory.initElements(driver, LearnSelect.class);
        object= PageFactory.initElements(driver,About.class);
    }
    @Test
    public void aboutTest(){
        object.about();
        String acutal="Feedback has been sent to the administrator";
        String except="Feedback has been sent to the administrator";
        Assert.assertEquals(acutal,except);

    }
}
