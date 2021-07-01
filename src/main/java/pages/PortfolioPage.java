package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PortfolioPage {
    private WebDriver driver;
    public By mobile = By.id("team-tab-three-title-desktop");
    public By mobileUnderline = By.xpath("//div[@class='et_pb_column et_pb_column_1_5 et_pb_column_9 tab-title-column et_pb_css_mix_blend_mode_passthrough active-team-tab']");
    public By flyerFindTheBugSession = By.xpath("//a[@download='FLYER FIND THE BUG SESSION']");

    public PortfolioPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getWebAutomationMobileTestingPageTitle() {
        return driver.getTitle();
    }

    public String getWebAutomationMobileTestingPageUrl() {
        return driver.getCurrentUrl();
    }

    public String checkHighlight(By by) {
        return driver.findElement(by).getCssValue("color");
    }

    public String checkMobileUnderline(By by) {
        return driver.findElement(by).getCssValue("border-bottom-color");
    }

    public void clickOnPortfolioPageElement(By by) {
        driver.findElement(by).click();
    }

    public String getAttributeOfPortfolioPage(By by, String attr) {
        return driver.findElement(by).getAttribute(attr);
    }
}
