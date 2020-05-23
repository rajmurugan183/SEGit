package SETests;

import Base.TestBase;
import SEpages.AlertAndModals;
import SEpages.HomePage;
import javafx.scene.layout.Priority;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class AlertAndModalsTest extends TestBase {

    HomePage HP =new HomePage();
     AlertAndModals AM;

    public AlertAndModalsTest() throws IOException {
    super();
    }

    @BeforeMethod

    public void initAlertAndModalsTest() throws IOException {
        Chromeinitialisation();
        HP.HomepageInit();

        AM=new AlertAndModals();
        AM.AlertAndModalsInit();


    }

@Test
            public void JavaScriptAlertBoxTest() throws InterruptedException, IOException {
    HP.ClickOnAlertAndModals();
    HP.ClickJavascriptAlerts();
                AM.JavaScriptAlertBox();
        }

@Test(priority = 2)
public void JavaScriptConfirmBoxTest() throws IOException, InterruptedException {
        HP.ClickOnAlertAndModals();
        HP.ClickJavascriptAlerts();
        AM.JavaScriptConfirmBox();

    }
@Test(priority = 3)
public void JavaScriptConfirmTextTest() throws IOException, InterruptedException {
    HP.ClickOnAlertAndModals();
    HP.ClickJavascriptAlerts();
    AM.JavaScriptConfirmText();


}

    @AfterMethod
    public void teardown() throws IOException {
        driver.close();
        driver.quit();

    }
}
