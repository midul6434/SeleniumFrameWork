package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    WebDriver driver = null;
    @FindBy(how= How.ID,using = "header-search-field")
    WebElement Search;
    @FindBy(how = How.CLASS_NAME,using = "search-field")
    WebElement submitbox;
    @FindBy(how = How.ID,using = "total-products")
    WebElement totalproduct;

    public String search(){
        Search.sendKeys("pants");
        submitbox.submit();
        String actualvaule = totalproduct.getText();

        return actualvaule;
    }
    public String Anothersarch(){
        Search.sendKeys("PYTHON PRINTS");
        submitbox.submit();
        String actualvaule=totalproduct.getText();
        return actualvaule;

    }







}
