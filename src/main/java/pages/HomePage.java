package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    private WebDriver driver;
    public By kontaktNavbar = By.xpath("//a[contains(text(), 'Kontakt')]");
    public By kontaktFooter = By.xpath("//a[normalize-space()='Kontakt & Anfahrt']");
    public By karriere = By.xpath("//a[contains(text(), 'Karriere')]");
    public By portfolio = By.xpath("//a[normalize-space()='Portfolio']");
    public By subMenu = By.className("sub-menu");
    public By webAutomationMobileTesting = By.xpath("//a[normalize-space()='Web, Automation & Mobile Testing']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHomePageTitle() {
        return driver.getTitle();
    }

    public String getHomePageUrl() {
        return driver.getCurrentUrl();
    }

    public KontaktPage clickOnHomePageElement(By by) {
        driver.findElement(by).click();
        return new KontaktPage(driver);
    }

    public void mouseHover(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();
    }

    public boolean displayCheckOfHomePageElement(By by) {
        return driver.findElement(by).isDisplayed();
    }

    public PortfolioPage clickOnWebAutomationMobileTesting(By by) {
        driver.findElement(by).click();
        return new PortfolioPage(driver);
    }

    public KarrierePage clickOnKarriereInNavbar(By by) {
        driver.findElement(by).click();
        return new KarrierePage(driver);
    }

}
