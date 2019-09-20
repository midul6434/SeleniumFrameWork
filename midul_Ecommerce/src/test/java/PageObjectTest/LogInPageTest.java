package PageObjectTest;

import PageObject.HomePage;
import PageObject.LogInPage;
import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reader.MyDataReader;

public class LogInPageTest extends BrowserDriver {
    HomePage homePage = null;
    LogInPage logInPage = null;
    @BeforeMethod
    public void element(){
        homePage= PageFactory.initElements(driver,HomePage.class);
        logInPage=PageFactory.initElements(driver,LogInPage.class);
    }
@DataProvider
    public Object[][] readable() throws Exception {
    MyDataReader myDataReader = new MyDataReader();
String path="/Users/midul/IdeaProjects/SeleniumFrameWork/midul_Ecommerce/src/test/TestData/TestData.xlsx";
myDataReader.setExcelFile(path);
Object[][]data = myDataReader.getExcelSheetData("Sheet1");

return data;
}
@Test(dataProvider = "readable")
    public void logintest(String email,String password,String expectedErroMessage){
        homePage.Signin();
        logInPage.logInPage(email,password);
        String actualvalue=logInPage.getError();
    Assert.assertEquals(actualvalue,expectedErroMessage);



}








}
