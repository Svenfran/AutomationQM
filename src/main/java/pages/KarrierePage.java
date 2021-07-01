package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KarrierePage {
    private WebDriver driver;
    public By bewirbDichJetztButton = By.xpath("//a[contains(text(), 'Bewirb dich jetzt!')]");

    public KarrierePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getKarrierePageTitle() {
        return driver.getTitle();
    }

    public String getKarrierePageUrl() {
        return driver.getCurrentUrl();
    }

    public KontaktFormular clickOnApplyButton(By by) {
        driver.findElement(by).click();
        return new KontaktFormular(driver);
    }

}
