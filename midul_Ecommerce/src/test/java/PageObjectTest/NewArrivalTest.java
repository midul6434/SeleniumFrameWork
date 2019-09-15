package PageObjectTest;

import PageObject.NewArriavle;
import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewArrivalTest extends BrowserDriver {
    NewArriavle objarrival = null;

    @BeforeMethod
    public void Arrivalitem() {
        objarrival = PageFactory.initElements(driver, NewArriavle.class);

    }

    @Test
    public void Arrivalsarch() {
        String actualvaule = objarrival.Arrival();
        String expectedvalue = "392 RESULTS FOR NEW ARRIVALS";
        Assert.assertEquals(actualvaule, expectedvalue);

    }
}