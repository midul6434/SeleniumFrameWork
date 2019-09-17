package PageobjectTest;

import PageObject.HomePage;
import PageObject.LearnSelect;
import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectTest extends BrowserDriver{
    HomePage obj = null;
  LearnSelect selectobj;
    @BeforeMethod
    public void Run() {

        obj = PageFactory.initElements(driver, HomePage.class);
        selectobj=PageFactory.initElements(driver,LearnSelect.class);
    }
    @Test
    public void testing(){
        selectobj.select();
    }
}
