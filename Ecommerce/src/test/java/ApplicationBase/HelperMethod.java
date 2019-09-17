package ApplicationBase;

import Reporting.TestLogger;
import org.openqa.selenium.WebElement;

public class HelperMethod {
    public static void sendKeys(WebElement element, String elementName, String keys) {
        TestLogger.log("Send Keys to " + elementName);
        element.sendKeys(keys);
        TestLogger.log("Send Keys to " + elementName);
    }
}
