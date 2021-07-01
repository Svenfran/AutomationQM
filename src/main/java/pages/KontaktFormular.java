package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class KontaktFormular {
    private WebDriver driver;
    public By applyNowButton = By.xpath("//input[@type='submit']");
    public By validationMsgFirstNameField = By.id("parsley-id-7");
    public By validationMsgLastNameField = By.id("parsley-id-9");
    public By validationMsgEmailField = By.id("parsley-id-11");
    public By validationMsgCheckbox = By.id("parsley-id-multiple-fld_4989725_1");
    public By firstNameField = By.id("fld_1144146_1");
    public By lastNameField = By.id("fld_7067875_1");
    public By emailField = By.id("fld_3149235_1");
    public By uploadFile = By.id("fld_8583967_1");
    public By fileName = By.xpath("//span[@class='cf2-file-name file-name']");
    public By checkbox = By.xpath("//label[@for='fld_4989725_1_opt1865542']");
    public By checkboxState = By.id("fld_4989725_1_opt1865542");

    public KontaktFormular(WebDriver driver) {
        this.driver = driver;
    }

    public String getKontaktFormularPageTitle() {
        return driver.getTitle();
    }

    public String getKontaktFormularPageUrl() {
        return driver.getCurrentUrl();
    }

    public void clickApplyNowButton(By by) {
        driver.findElement(by).click();
    }

    public String getValidationMessage(By by) {
        return driver.findElement(by).getText();
    }

    public void setFieldValue(By by, String value) {
        driver.findElement(by).sendKeys(value);
    }

    public String getFieldValue(By by) {
        return driver.findElement(by).getAttribute("value");
    }

    public void uploadFile(By by) {
        driver.findElement(by).sendKeys("C:\\Users\\Sven\\IdeaProjects\\AutomationQM\\files\\kalender-2021.jpg");
    }

    public String getFileName(By by) {
        return driver.findElement(by).getText();
    }

    public void clickCheckBox(By by) {
        driver.findElement(by).click();
    }

    public boolean getCheckboxState(By by) {
        return driver.findElement(by).isSelected();
    }
}
