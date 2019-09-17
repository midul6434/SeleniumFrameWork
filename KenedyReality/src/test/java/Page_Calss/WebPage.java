package Page_Calss;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WebPage {
    @FindBy(how = How.CLASS_NAME,using = "button small")
    WebElement tt;
    @FindBy(how=How.ID,using="post-793")
    WebElement ss;



    public String feb(){
        tt.click();
        String actual=ss.getText();;
        return actual;
    }

}
