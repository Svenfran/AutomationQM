package testcases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KarrierePage;
import pages.KontaktFormular;
import testdata.TestData;

public class KarrierePageTest extends BaseTest {

    KarrierePage karrierePage;
    KontaktFormular kontaktFormular;

    @Test
    public void testKarrierePage() {
        Assert.assertEquals(homePage.getHomePageTitle(), TestData.homePageTitle);
        Assert.assertEquals(homePage.getHomePageUrl(), TestData.homePageUrl);
        karrierePage = homePage.clickOnKarriereInNavbar(homePage.karriere);
        Assert.assertEquals(karrierePage.getKarrierePageUrl(), TestData.karrierePageUrl);
        Assert.assertEquals(karrierePage.getKarrierePageTitle(), TestData.karrierePageTitle);
        kontaktFormular = karrierePage.clickOnApplyButton(karrierePage.bewirbDichJetztButton);
        Assert.assertEquals(kontaktFormular.getKontaktFormularPageUrl(), TestData.kontaktFormularPageUrl);
        Assert.assertEquals(kontaktFormular.getKontaktFormularPageTitle(), TestData.kontaktFormularPageTitle);
        kontaktFormular.clickApplyNowButton(kontaktFormular.applyNowButton);
        Assert.assertEquals(kontaktFormular.getValidationMessage(kontaktFormular.validationMsgFirstNameField), TestData.commonValidationMessage);
        Assert.assertEquals(kontaktFormular.getValidationMessage(kontaktFormular.validationMsgLastNameField), TestData.commonValidationMessage);
        Assert.assertEquals(kontaktFormular.getValidationMessage(kontaktFormular.validationMsgEmailField), TestData.commonValidationMessage);
        Assert.assertEquals(kontaktFormular.getValidationMessage(kontaktFormular.validationMsgCheckbox), TestData.commonValidationMessage);
        kontaktFormular.setFieldValue(kontaktFormular.firstNameField, TestData.firstName);
        kontaktFormular.setFieldValue(kontaktFormular.lastNameField, TestData.lastName);
        Assert.assertEquals(kontaktFormular.getFieldValue(kontaktFormular.firstNameField), TestData.firstName);
        Assert.assertEquals(kontaktFormular.getFieldValue(kontaktFormular.lastNameField), TestData.lastName);
        kontaktFormular.clickApplyNowButton(kontaktFormular.applyNowButton);
        Assert.assertEquals(kontaktFormular.getValidationMessage(kontaktFormular.validationMsgEmailField), TestData.commonValidationMessage);
        Assert.assertEquals(kontaktFormular.getValidationMessage(kontaktFormular.validationMsgCheckbox), TestData.commonValidationMessage);
        kontaktFormular.setFieldValue(kontaktFormular.emailField, TestData.invalidEmail);
        Assert.assertEquals(kontaktFormular.getFieldValue(kontaktFormular.emailField), TestData.invalidEmail);
        Assert.assertEquals(kontaktFormular.getValidationMessage(kontaktFormular.validationMsgEmailField), TestData.ValidationMessageEmail);
        kontaktFormular.clickApplyNowButton(kontaktFormular.applyNowButton);
        kontaktFormular.uploadFile(kontaktFormular.uploadFile);
        Assert.assertEquals(kontaktFormular.getFileName(kontaktFormular.fileName), TestData.fileName);
        kontaktFormular.clickCheckBox(kontaktFormular.checkbox);
        Assert.assertEquals(kontaktFormular.getCheckboxState(kontaktFormular.checkboxState), true);

    }
}
