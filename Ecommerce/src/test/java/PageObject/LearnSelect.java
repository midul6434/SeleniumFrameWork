package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LearnSelect {

  @FindBy(how = How.XPATH,using = "//*[@id=\"content\"]/div[3]/div[3]/div/div/div/p[2]/span/a")
    WebElement enter;
  @FindBy(how = How.CLASS_NAME,using = "active")
  WebElement clik;
  public void select(){
      enter.click();
      clik.click();

  }


}
