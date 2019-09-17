package PageObjectTest;

import PageObject.HomePage;
import PageObject.MouseHovert;
import base.BrowserDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHovertTest extends BrowserDriver  {
  MouseHovert obj = new MouseHovert();




    @Test
    public void MouseTest(){

  String expectedvalue="";
        Assert.assertEquals(Mouse.class,expectedvalue);







}}