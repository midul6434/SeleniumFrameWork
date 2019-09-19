package PageobjectTest;

import PageObject.HomePage;
import PageObject.ReadFromExcelFile;
import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reader.MyDataReader;

public class ReadFromExcelFileTest extends BrowserDriver {
    HomePage objHom= null;
    ReadFromExcelFile obj=null;

    @BeforeMethod
    public void run(){
        objHom= PageFactory.initElements(driver,HomePage.class);
        obj=PageFactory.initElements(driver,ReadFromExcelFile.class);
    }
    @DataProvider
    public Object [][] readData() throws Exception {
        MyDataReader myDataReader= new MyDataReader();
        String path=System.getProperty("user.dir")+"/testData/TestData.xlsx";
        myDataReader.setExcelFile(path);
        Object [][] data=myDataReader.getExcelSheetData("Sheet3");
        return data;
    }
    @Test(dataProvider = "readData")
    public void dataTest(String email,String password,String expectedErroMessage){
        objHom.contract();
        obj.read(email,password);
        String actual=obj.getErrorMessage();
        Assert.assertEquals(actual,expectedErroMessage);

    }



}
