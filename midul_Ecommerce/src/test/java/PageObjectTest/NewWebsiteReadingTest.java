package PageObjectTest;

import PageObject.HomePage;
import PageObject.NewWebsiteReading;
import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reader.MyDataReader;

public class NewWebsiteReadingTest extends BrowserDriver {
    HomePage homePage = null;
    NewWebsiteReading newWebsiteReading=null;

    @BeforeMethod
    public void element(){
        homePage= PageFactory.initElements(driver,HomePage.class);
        newWebsiteReading=PageFactory.initElements(driver,NewWebsiteReading.class);
    }

@DataProvider
    public Object[][] Settingup() throws Exception {
    MyDataReader myDataReader =new MyDataReader();
    String path ="/Users/midul/IdeaProjects/SeleniumFrameWork/midul_Ecommerce/src/test/TestData/TestCases.xlsx";
    myDataReader.setExcelFile(path);
    Object[][] newdata=myDataReader.getExcelSheetData("Sheet1");

return newdata;
}
@Test(dataProvider = "Settingup")
public void websitetest(String name,String Email,String TelePhone,String Country,String City,String Company,String Message,String formErrorContent){
        homePage.Contract();
        newWebsiteReading.loging(name,Email,TelePhone,Country,City,Company,Message);
        String actual=newWebsiteReading.GetError();
    Assert.assertEquals(actual,formErrorContent);


}



}
