package testcases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PortfolioPage;
import testdata.TestData;

public class PortfolioPageTest extends BaseTest {

    PortfolioPage portfolioPage;

    @Test
    public void testPortfolioPage() {
        Assert.assertEquals(homePage.getHomePageTitle(), TestData.homePageTitle);
        Assert.assertEquals(homePage.getHomePageUrl(), TestData.homePageUrl);
        homePage.mouseHover(homePage.portfolio);
        Assert.assertEquals(homePage.displayCheckOfHomePageElement(homePage.subMenu), true);
        portfolioPage = homePage.clickOnWebAutomationMobileTesting(homePage.webAutomationMobileTesting);
        Assert.assertEquals(portfolioPage.getWebAutomationMobileTestingPageTitle(), TestData.webAutomationMobileTestingPageTitle);
        Assert.assertEquals(portfolioPage.getWebAutomationMobileTestingPageUrl(), TestData.webAutomationMobileTestingPageUrl);
        Assert.assertEquals(portfolioPage.checkHighlight(homePage.portfolio),TestData.highlightColor );
        portfolioPage.clickOnPortfolioPageElement(portfolioPage.mobile);
        Assert.assertEquals(portfolioPage.checkMobileUnderline(portfolioPage.mobileUnderline),TestData.mobileUnderlineColor );
        Assert.assertEquals(portfolioPage.getAttributeOfPortfolioPage(portfolioPage.flyerFindTheBugSession, "href"), TestData.flyerFindTheBugSessionUrl);
        portfolioPage.clickOnPortfolioPageElement(portfolioPage.flyerFindTheBugSession);

    }
}
