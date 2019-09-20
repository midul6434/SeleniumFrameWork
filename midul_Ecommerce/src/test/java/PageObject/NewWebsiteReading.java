package PageObject;

import HelperMethod.HelperMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewWebsiteReading {
    @FindBy(how = How.NAME,using = "name")
    WebElement Namebox;
    @FindBy(how = How.NAME,using = "email")
    WebElement emailbox;
    @FindBy(how = How.NAME,using = "telephone")
    WebElement telephonebox;
    @FindBy(how = How.NAME,using = "country")
    WebElement countrybox;
    @FindBy(how = How.NAME,using = "city")
    WebElement citybox;
    @FindBy(how = How.NAME,using = "company")
    WebElement companybox;
    @FindBy(how = How.NAME,using = "message")
    WebElement massegebox;
    @FindBy(how = How.LINK_TEXT,using = "Send message")
    WebElement submitbox;
    @FindBy(how = How.CLASS_NAME,using = "formErrorContent")
    WebElement error;
    public void loging(String name,String Email,String TalePhone,String Country,String City,String Company,String Message){
        HelperMethod.sendKeys(Namebox,"personName",name);
        HelperMethod.sendKeys(emailbox,"TheirEmail",Email);
        HelperMethod.sendKeys(telephonebox,"TelephoneNumber",TalePhone);
        HelperMethod.sendKeys(countrybox,"People Country",Country);
        HelperMethod.sendKeys(citybox,"City",City);
        HelperMethod.sendKeys(companybox,"Company",Company);
        HelperMethod.sendKeys(massegebox,"Whatever u wanna say",Message);
        HelperMethod.click(submitbox,"Submiting");
       // return new LogInPage();
    }
    public String GetError(){
        String actualvaule=HelperMethod.getText(error,"Whateverinthe file");

        return actualvaule;
    }


}
