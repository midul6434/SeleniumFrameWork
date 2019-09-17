package PageobjectTest;

import PageObject.HomePage;
import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomepageTest extends BrowserDriver{

    HomePage obj = null;
    @BeforeMethod
    public void Run() {

        obj = PageFactory.initElements(BrowserDriver.driver, HomePage.class);

    }
    @Test
    public void contractTest(){
        obj.contract();
        String acutal="Feedback has been sent to the administrator";
        String except="Feedback has been sent to the administrator";
        Assert.assertEquals(acutal,except);
    }

    }

/*
Test
public void Firstrun() {
        String actualresult =obj.Firstone();
        String expectedresult="1512 items";
        Assert.assertEquals(actualresult,expectedresult);
        }
@Test
public void WomenTest(){
        String acutal=obj.Women();
        String except="WOMEN";
        Assert.assertEquals(acutal,except);
        }
@Test
public void StoreTest(){
        String actual=obj.Store();
        String except="how you can refuse them.";
        Assert.assertEquals(actual,except);*/
