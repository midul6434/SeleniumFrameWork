package HelperMethod;

import Reporting.TestLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HelperMethod {
    public static void sendKeys(WebElement element, String elementName, String keys) {
        TestLogger.log("Send Keys to " + elementName);
        element.sendKeys(keys);
        TestLogger.log("Sent keys to " + elementName);
    }

    public static void click(WebElement element, String elementName) {
        TestLogger.log("CLick " + elementName);
        element.click();
        TestLogger.log("Clicked " + elementName);
    }

    public static void selectByIndex(WebElement element, int i) {
        Select select = new Select(element);
        TestLogger.log("Select option at index " + i);
        select.selectByIndex(i);
        TestLogger.log("Selected option at index " + i);

    }

    public static void submit(WebElement element, String name) {
        TestLogger.log("Submiting File is " + name);
        element.submit();


    }

    public static String getText(WebElement webElement, String webElementName) {

        TestLogger.log("Getting Text from " + webElementName);
        String actualText = webElement.getText();
        TestLogger.log("Actual text: " + actualText);

        return actualText;


    }
}