package SETests;

import Base.TestBase;
import SEpages.HomePage;
import SEpages.SimpleForm;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomepageTest extends TestBase {

    HomePage Home;
    public HomepageTest() throws IOException {
        super();
    }

    @BeforeMethod
    public void initialisation() throws IOException {
        TestBase.Chromeinitialisation();
        Home=new HomePage();
         Home.HomepageInit();
    }

    @Test
    public void HomeTest(){
        Home.TitleValidation();
        Home.LogoValidation();

    }

    @AfterMethod
    public void teardown(){
        driver.close();
        driver.quit();

    }

}
