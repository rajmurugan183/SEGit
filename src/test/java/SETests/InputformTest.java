package SETests;

import Base.TestBase;
import SEpages.HomePage;
import SEpages.Inputform;
import Util.Utilities;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class InputformTest extends TestBase {

String sheetname="FirstSheet";

    public InputformTest() throws IOException {
    }
    HomePage Home;
    Inputform IP;

    @BeforeMethod
    public void initialisation() throws IOException {
        TestBase.Chromeinitialisation();
        Home=new HomePage();
        IP= new Inputform() ;
        Home.HomepageInit();
        IP.InputFormInit();


    }

    @DataProvider

    public Object[][] getSETestData() throws InvalidFormatException {
Object data[][]= Utilities.getTestData(sheetname);
return data;

    }

    @Test(dataProvider = "getSETestData")
    public void InputformTest(String ftname,String ltname,String mail,String phone1,String address1,String city1,String zipcode,String website1,String comment1) throws IOException {
        Home.ClickOnInputForm();
        Home.clickOnInputformvalidations();
        IP.fillForm(ftname,ltname,mail,phone1,address1,city1,zipcode,website1,comment1);

    }

    @AfterMethod
    public void teardown(){
        driver.close();
        driver.quit();

    }
}
