package com.krce.tests;

import com.krce.base.BaseTest;
import com.krce.pages.AccountDetailsPage;
import com.krce.pages.SignupPage;
import org.testng.annotations.Test;

public class SignupTest extends BaseTest {
    @Test
    public void verifySignup() {

        SignupPage signup = new SignupPage(driver);

        signup.clickSignupLogin();
        signup.enterName("Harini");
        signup.enterEmail();
        signup.clickSignupButton();

        AccountDetailsPage details = new AccountDetailsPage(driver);
        details.selectGender();
        details.enterPassword("Ecg_0324");
        details.selectDay("24");
        details.selectMonth("May");
        details.selectYear("2005");
        details.clickNewsletter();
        details.clickSpecialOffers();
        details.enterFirstName("Harini");
        details.enterLastName("Petchimuthu");
        details.enterCompany("HCLTech");
        details.enterAddress1("9/338, New Colony Street");
        details.enterAddress2("Anbil Padugai");
        details.selectCountry("India");
        details.enterState("Tamil Nadu");
        details.enterCity("Thanjavur");
        details.enterZipcode("123459");
        details.enterMobileNumber("2294894533");
        details.clickCreateAccount();
        details.clickContinueButton();
    }

}
