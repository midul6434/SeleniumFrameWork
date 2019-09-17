package PageObject;

import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class MouseHovert extends BrowserDriver {
    Actions actions = new Actions(driver);
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/header/div[2]/div/nav/ul/li[2]/a")
    WebElement Woman;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/header/div[2]/div/nav/ul/li[2]/ul")
    WebElement All;


        public  String Mouse () {
          //  actions.moveToElement(Woman).perform();
            actions.moveToElement(All).perform();

            String actualresult = All.getText();


            return actualresult;
        }
    }
