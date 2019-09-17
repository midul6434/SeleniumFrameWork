package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.BeforeMethod;

public class HomePage {
    WebDriver driver = null;



    @FindBy(how = How.LINK_TEXT,using = "CONTACT")
    WebElement info;

    @FindBy(how = How.XPATH,using = "//*[@id=\"content\"]/div/div[2]/div/form/div/span[1]/input")
    WebElement name;
    @FindBy(how = How.XPATH,using = "//*[@id=\"content\"]/div/div[2]/div/form/div/span[2]/input")
    WebElement email;
    @FindBy(how = How.NAME,using = "telephone")
    WebElement number;
    @FindBy(how = How.NAME,using = "country")
    WebElement country;
    @FindBy(how = How.NAME,using = "city")
    WebElement city;
    @FindBy(how = How.NAME,using = "company")
    WebElement company;
    @FindBy(how = How.NAME,using = "message")
    WebElement message;
  @FindBy(how = How.XPATH,using = "//*[@id=\"content\"]/div/div[2]/div/form/p/a[1]")
    WebElement submit;
    @FindBy(how = How.CLASS_NAME,using = "formErrorContent")
    WebElement result;
    public String contract(){
        info.click();
        name.sendKeys("Mohammed");
        email.sendKeys("nabil0959@gmail.com");
        number.sendKeys("347-00-000");
        country.sendKeys("USA");
        city.sendKeys("Brooklyn");
        company.sendKeys("Dominos");
        message.sendKeys("Hey, I am doing Selenium practice in this website.");
       submit.submit();
       String actual=result.getText();
       return actual;

    }
}

    /*@FindBy(how = How.ID, using = "main-search")
    WebElement searchBox;
    @FindBy(how = How.CLASS_NAME, using = "menu__search_submit")
    WebElement submit;
    @FindBy(how = How.CLASS_NAME, using = "filter-pagination")
    WebElement toalconsumer;
    @FindBy(how = How.CLASS_NAME, using = "menu__super-link")
    WebElement women;
    @FindBy(how = How.CLASS_NAME, using = "link")
    WebElement store;

    public String Firstone() {
        searchBox.sendKeys("jeans");
        submit.submit();
        String actualresult = toalconsumer.getText();
        return actualresult;
    }

    public String Women() {
        String actual = women.getText();
        return actual;
    }

    public String Store() {
        String acutal = store.getText();
        return acutal;*/