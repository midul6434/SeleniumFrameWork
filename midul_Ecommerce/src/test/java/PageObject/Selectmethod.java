package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Selectmethod {
    @FindBy(how= How.LINK_TEXT,using = "//*[@id=\"ui-id-25\"]")
    WebElement option;


public String TheoneIselect(){
   // option.click();
    Select select=new Select(option);
    select.selectByIndex(2);
    return null;
}
}
