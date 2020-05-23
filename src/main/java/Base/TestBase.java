package Base;

import Util.Utilities;
import Util.WebEventListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static Properties prop;
    public static WebDriver driver;
    public  static EventFiringWebDriver e_driver;
    public static WebEventListener eventListener;

    public TestBase() throws IOException {
        prop = new Properties();
        FileInputStream inp = new FileInputStream("C:\\Users\\user\\Desktop\\SeleniumEasySite\\src\\main\\java\\Config\\Config.properties");
        prop.load(inp);
    }

     public static void Chromeinitialisation() throws IOException {
      /*  System.setProperty("driver.chrome.driver",prop.getProperty("Chromepath"));
        driver= new ChromeDriver();*/
         System.setProperty("webdriver.chrome.driver",prop.getProperty("Chromepath"));
         driver=new ChromeDriver();
         driver.manage().deleteAllCookies();

         e_driver = new EventFiringWebDriver(driver);
         // Now create object of EventListerHandler to register it with EventFiringWebDriver
         eventListener = new WebEventListener();
         e_driver.register(eventListener);
         driver = e_driver;

         driver.manage().window().maximize();
        driver.get(prop.getProperty("SEURL"));
        driver.manage().timeouts().implicitlyWait(Utilities.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Utilities.IMPLICIT_WAIT,TimeUnit.SECONDS);
         WebElement popup=driver.findElement(By.xpath("//a[@id='at-cv-lightbox-close']"));
        if (popup.isDisplayed()){
            popup.click();

        }

     }

}
