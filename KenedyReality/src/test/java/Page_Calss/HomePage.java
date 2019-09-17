package Page_Calss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class HomePage {

    @FindBy(how = How.XPATH,using = "//*[@id=\"menu-item-1102\"]/a")
    WebElement search;
    @FindBy(how = How.ID,using = "menu-item-1116")
    WebElement jj;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-item-1104\"]/a")
    WebElement MLS_Leasing;

    @FindBy(how = How.XPATH, using ="//*[@id=\"menu-item-1106\"]/a")
    WebElement Our_properties;

    @FindBy(how= How.XPATH, using = "//*[@id=\"QSForRent\"]")
    WebElement hom;





    public String search(){
        String actual=search.getText();;
        return actual;
    }

    public  String ser() {
        String actual=MLS_Leasing.getText();
        return actual;
    }

    public String sold (){
        String actual = Our_properties.getText();
        return actual;
    }

    public String hom(){
        String actual = hom.getText();
        return actual;
    }

}
