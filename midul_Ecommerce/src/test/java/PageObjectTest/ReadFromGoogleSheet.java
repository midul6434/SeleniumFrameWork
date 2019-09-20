package PageObjectTest;

import API.GoogleSheetReader;
import PageObject.HomePage;
import PageObject.NewWebsiteReading;
import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ReadFromGoogleSheet extends BrowserDriver {
        HomePage homePage = null;
        NewWebsiteReading newWebsiteReading=null;

        @BeforeMethod
        public void element(){
            homePage= PageFactory.initElements(driver,HomePage.class);
            newWebsiteReading=PageFactory.initElements(driver,NewWebsiteReading.class);
        }

        @DataProvider
        public Object[][] Settingup() throws Exception {
            GoogleSheetReader googleSheetReader =new GoogleSheetReader();
            Object[][] data=googleSheetReader.getSpreadSheetRecordsToSupplyDataProviderAlternativeWay("1sk4h62ybzLhSkXEx4wTvU4nA7zhzK2oI","Sheet1!A1:H");

            return data;
        }
        @Test(dataProvider = "Settingup")
        public void newtest(String name,String Email,String TelePhone,String Country,String City,String Company,String Message,String formErrorContent){
            homePage.Contract();
            newWebsiteReading.loging(name,Email,TelePhone,Country,City,Company,Message);
            String actual=newWebsiteReading.GetError();
            Assert.assertEquals(actual,formErrorContent);



        }



    }


