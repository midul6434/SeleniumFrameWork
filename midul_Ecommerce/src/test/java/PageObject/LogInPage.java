package PageObject;

import HelperMethod.HelperMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInPage {
    @FindBy(how = How.ID,using = "email")
    WebElement emailbox;
    @FindBy(how = How.ID,using = "passwd")
    WebElement Password;
    @FindBy(how = How.XPATH,using ="//*[@id=\"SubmitLogin\"]/span")
    WebElement signin;
    @FindBy(how = How.CSS,using = "#center_column > div.alert.alert-danger > p")
    WebElement error;

    public LogInPage logInPage(String email,String password){
        HelperMethod.sendKeys(emailbox,"person email",email);
        HelperMethod.sendKeys(Password,"person pass",password);
        HelperMethod.click(signin,"SignIn");
        return new  LogInPage();
    }
public String getError(){
        String actualvalue=HelperMethod.getText(error,"ErrorMassege");
        return actualvalue;
}





}
