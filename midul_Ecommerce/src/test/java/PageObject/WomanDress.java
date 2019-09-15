package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WomanDress {
    @FindBy(how = How.CLASS_NAME, using = "search-field")
    WebElement newarrival;
    @FindBy(how = How.ID, using = "header-search-field")
    WebElement woman;
    @FindBy(how = How.ID, using = "total-products")
    WebElement allproduct;

    public String Men() {
        newarrival.sendKeys("Suits");
        woman.submit();
        String actualvalue = allproduct.getText();
        return actualvalue;

    }
    @FindBy(how=How.XPATH,using = "//*[@id=\"content\"]/div/div[12]/div/div/div/div[4]/div/div[1]/div/a")
    WebElement sweater;
    @FindBy(how=How.XPATH,using = "//*[@id=\"content\"]/div/div/div/div[2]/div[2]/div")
    WebElement PRODUCT;
    public String Sweater(){
        sweater.click();
        String actualresult=PRODUCT.getText();
        return actualresult;
    }






}