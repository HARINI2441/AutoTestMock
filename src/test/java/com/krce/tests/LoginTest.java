package com.krce.tests;

import com.krce.base.BaseTest;
import com.krce.pages.LoginPage;
import com.krce.pages.SignupPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @DataProvider(name = "loginData")

    public Object[][] loginData() {

        return new Object[][] {

                { "harini" + System.currentTimeMillis() + "@gmail.com", "Ecg_0324"},

                {"user2@gmail.com", "pass2"}
        };
    }
    @Test(dataProvider = "loginData")
    public void verifyLogin(String email,String password) {
        SignupPage signup = new SignupPage(driver);
        signup.clickSignupLogin();
        LoginPage login = new LoginPage(driver);
        login.enterLoginEmail(email);
        login.enterLoginPassword(password);
        login.clickLoginButton();
    }

}
