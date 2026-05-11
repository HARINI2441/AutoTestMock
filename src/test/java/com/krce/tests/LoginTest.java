package com.krce.tests;

import com.krce.base.BaseTest;
import com.krce.pages.LoginPage;
import com.krce.pages.SignupPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void verifyLogin() {

        SignupPage signup = new SignupPage(driver);
        signup.clickSignupLogin();
        LoginPage login = new LoginPage(driver);
        login.enterLoginEmail("yourmail@gmail.com");
        login.enterLoginPassword("yourpassword");
        login.clickLoginButton();
    }

}
