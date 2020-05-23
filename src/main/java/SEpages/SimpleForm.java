package SEpages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class SimpleForm extends TestBase {

      HomePage HP;
    public SimpleForm() throws IOException {
    }

    @FindBy(xpath = "//*[text()='This would be your first example to start with Selenium.']")
    WebElement SfHeader;



    public void SimpleFormInit(){
        PageFactory.initElements(driver,this);
    }

    public SimpleForm Inputform() throws IOException {
        HP.ClickOnInputForm();
        HP.ClickOnSimpleForm();
        return new SimpleForm();
    }

    public void SFHeaderValidation(){
         SfHeader.click();

    }
}
