package PageObject;

import ApplicationBase.HelperMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class About {
    @FindBy(how = How.LINK_TEXT,using = "ABOUT")
    WebElement about;
    @FindBy(how = How.NAME,using = "name")
    WebElement name;
    @FindBy(how=How.NAME,using = "email")
    WebElement email;
    @FindBy(how=How.NAME,using = "telephone")
    WebElement number;
    @FindBy(how = How.NAME,using = "message")
    WebElement message;
    @FindBy(how = How.LINK_TEXT,using = "Sign Up Course")
    WebElement sub;
    @FindBy(how = How.CLASS_NAME,using = "formErrorContent")
    WebElement result;

    public String about(){
        about.click();
        HelperMethod.sendKeys(name,"Mohammed","Firstname");
        HelperMethod.sendKeys(email,"Email","nabil0994@gmail.com");
        number.sendKeys("342049409");
        message.sendKeys("Hey, This is for testing");
        sub.submit();
        String acutal=result.getText();
        return  acutal;
    }
}
