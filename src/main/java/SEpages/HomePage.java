package SEpages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class HomePage extends TestBase {
    public HomePage() throws IOException {

    }

@FindBy(xpath = "//*[contains(text(),'Input Forms') and @class='dropdown-toggle']")
        @CacheLookup
    WebElement InputForms;

    @FindBy(xpath = "//*[@class='dropdown-menu']//*[contains(text(),'Simple Form Demo')]")
    WebElement SimpleForm;

@FindBy(xpath="//img[@class='cbt']")
    WebElement CrossBrowserLogo;

    @FindBy(xpath="//a[@class='dropdown-toggle'][contains(text(),'List Box')]")
    WebElement ListBox;

    @FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'Alerts & Modals')]")
    WebElement AlertAndModals;

    @FindBy(xpath="//ul[@class='dropdown-menu']//a[contains(text(),'Javascript Alerts')]")
    WebElement JavascriptAlerts;

    @FindBy(xpath="//ul[@class='dropdown-menu']//a[contains(text(),'Input Form Submit')]")
    WebElement Inputformvalidations;



    public void HomepageInit(){
        PageFactory.initElements(driver,this);

    }

    public void TitleValidation(){
String Tittle =driver.getTitle();
System.out.println(Tittle);
        Assert.assertEquals(Tittle,"Selenium Easy Demo - Simple Form to Automate using Selenium");
    }

    public void LogoValidation(){

        CrossBrowserLogo.isDisplayed();
    }

    public void ClickOnInputForm(){
        InputForms.click();
        System.out.println("Element is clicked");

    }
    public SimpleForm ClickOnSimpleForm() throws IOException {
        SimpleForm.click();
        System.out.println(" SimpleForm clicked");
return new SimpleForm();
    }

public ListBox ClickonListBox() throws IOException {
    ListBox.click();
    return new ListBox();
}
    public  void  ClickOnAlertAndModals() throws IOException {
        AlertAndModals.click();

    }
    public  AlertAndModals ClickJavascriptAlerts() throws IOException {
        JavascriptAlerts.click();
        return new AlertAndModals();
    }
    public Inputform clickOnInputformvalidations() throws IOException {
        Inputformvalidations.click();
        return new Inputform();
    }

}
