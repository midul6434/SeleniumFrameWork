/*
package PageObject;


import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.How;

public class NewArriavle {
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-search-field\"]")
    WebElement search;
    @FindBy(how = How.ID, using = "header-search-field")
    WebElement man;
    @FindBy(how = How.ID, using = "total-products")
    WebElement product;

    public String Arrival() {
        search.sendKeys("New Arrivals");
        man.submit();
        String actualvaule = product.getText();
        return actualvaule;
    }
}*/
