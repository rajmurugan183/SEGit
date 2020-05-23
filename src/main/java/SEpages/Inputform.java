package SEpages;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class Inputform  extends TestBase {
    @FindBy(name = "first_name")
    WebElement firstname;

    @FindBy(name = "last_name")
    WebElement lastname;

    @FindBy(name = "email")
    WebElement email;

    @FindBy(name = "phone")
    WebElement phone;

    @FindBy(name = "address")
    WebElement address;

    @FindBy(name = "city")
    WebElement city;

    @FindBy(name = "state")
    WebElement state;

    @FindBy(name = "zip")
    WebElement zip;

    @FindBy(name = "website")
    WebElement website;

    @FindBy(name = "comment")
    WebElement comment;

    @FindBy(xpath = "//*[@name='hosting' and @type='radio' and @value='yes']")
    WebElement hosting;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement Submit;

    public Inputform() throws IOException {
    }

    public void InputFormInit(){
        PageFactory.initElements(driver,this);
    }

    public void fillForm(String ftname,String ltname,String mail,String phone1,String address1,String city1,String zipcode,String website1,String comment1){
        firstname.sendKeys(ftname);
        lastname.sendKeys(ltname);
        email.sendKeys(mail);
        phone.sendKeys(phone1);
        address.sendKeys(address1);
        city.sendKeys(city1);

        Select State = new Select(driver.findElement(By.name("state")));
        State.selectByVisibleText("Alabama");


        zip.sendKeys(zipcode);
        website.sendKeys(website1);
        comment.sendKeys(comment1);
        hosting.click();
        Submit.click();


    }

}
