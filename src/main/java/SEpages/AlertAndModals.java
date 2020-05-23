package SEpages;

import Base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class AlertAndModals extends TestBase {
    public AlertAndModals() throws IOException {

    }
@FindBy(xpath ="//button[@class='btn btn-default']")
    WebElement JavaScriptAlertBox;

    @FindBy(xpath="//button[contains(text(),'Click for Prompt Box')]")
    WebElement JavaScriptConfirmText;

    public void AlertAndModalsInit(){
        PageFactory.initElements(driver,this);

    }
    public void JavaScriptAlertBox() throws InterruptedException {
        JavaScriptAlertBox.click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();


    }

    public void JavaScriptConfirmBox() throws InterruptedException {

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[2]/button[1]")).click();
        System.out.println("JavaScriptAlertBox is clicked");
        Thread.sleep(5000);
        Alert alert= driver.switchTo().alert();
        alert.dismiss();
    }

    public void JavaScriptConfirmText(){
        JavaScriptConfirmText.click();
        Alert alert=driver.switchTo().alert();
        String alertText=alert.getText().trim();
        Assert.assertEquals(alertText,"Please enter your name");
        String Text="SeleniumEasy";
        alert.sendKeys("");
        alert.accept();

       String  output= driver.findElement(By.id("prompt-demo")).getText().trim();
        System.out.println(output);
        String[] finaltext=output.split("'",0);
String Actual=finaltext[1].trim();
           // System.out.println(Actual);
           Assert.assertEquals(finaltext[1],Actual);




    }

}
