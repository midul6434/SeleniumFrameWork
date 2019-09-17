package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class SendKeys {
    @FindBy(how = How.XPATH, using = "//*[@id=\"main-nav\"]/li[9]/a")
    WebElement contract;
    @FindBy(how = How.NAME, using = "name")
    WebElement name;
    @FindBy(how = How.NAME, using = "email")
    WebElement email;
    @FindBy(how = How.NAME, using = "telephone")
    WebElement telephone;
    @FindBy(how = How.NAME, using = "country")
    WebElement country;
    @FindBy(how = How.NAME, using = "city")
    WebElement city;
    @FindBy(how = How.NAME, using = "company")
    WebElement company;
    @FindBy(how = How.NAME, using = "message")
    WebElement messege;
    @FindBy(how = How.CLASS_NAME, using = "formErrorContent")
    WebElement all;
    @FindBy(how = How.LINK_TEXT, using = "Send message")
    WebElement submit;

    public String SelectMethod() {
   /* Select select = new Select(name);
    contract.click();
    select.selectByVisibleText("Midul");
*/
        contract.click();
        email.sendKeys("midultalukder123@gmail.com");
        telephone.sendKeys("5167179845");
        country.sendKeys("USA");
        city.sendKeys("Brooklyn");
        company.sendKeys("MP construction");
        messege.sendKeys("Hello there, My name is Midul Talukder. I would like to Thank you guys to for using your website");
        submit.click();

        String actualvalue = all.getText();
        return actualvalue;


    }
}