package PageObject;

import ApplicationBase.HelperMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ReadFromExcelFile {

    @FindBy(how = How.NAME,using = "email")
    WebElement mail;
    @FindBy(how = How.NAME,using = "telephone")
    WebElement pass;
    @FindBy(how = How.LINK_TEXT,using = "Send message")
    WebElement submit;
    @FindBy(how = How.CLASS_NAME,using = "formErrorContent")
    WebElement result;

    public void read(String email,String password){
        HelperMethod.sendKeys(mail,"emailbox",email);
        HelperMethod.sendKeys(pass,"Password",password);
        submit.submit();
    }
    public String getErrorMessage(){

        String actual=result.getText();
        return actual;
    }


}
