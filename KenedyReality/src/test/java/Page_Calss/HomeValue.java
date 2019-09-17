package Page_Calss;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomeValue {
    @FindBy(how= How.LINK_TEXT,using = "What Is Your Home Worth")
    WebElement Home;
    @FindBy(how =How.ID,using = "divPageContainer")
    WebElement all;
    public String Real(){
        Home.click();
        String actual=all.getText();
        return actual;
    }
}
