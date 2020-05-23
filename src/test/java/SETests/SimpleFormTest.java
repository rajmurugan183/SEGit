package SETests;

import Base.TestBase;
import SEpages.HomePage;
import SEpages.SimpleForm;
import org.testng.annotations.*;

import java.io.IOException;

public class SimpleFormTest extends TestBase {

    HomePage Home;
    SimpleForm SF= new SimpleForm();;

    public SimpleFormTest() throws IOException {
        super();
    }



    @BeforeMethod
    public void initialisation() throws IOException {
        TestBase.Chromeinitialisation();
        Home=new HomePage();
        Home.HomepageInit();
        SF.SimpleFormInit();
    }

    @Test
    public void SFHeader() throws IOException {
        Home.ClickOnInputForm();
        Home.ClickOnSimpleForm();
        SF.SFHeaderValidation();
    }


    @AfterMethod
    public void teardown(){
        driver.close();
        driver.quit();

    }

}
