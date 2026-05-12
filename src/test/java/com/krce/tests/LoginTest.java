package com.krce.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.krce.base.BaseTest;
import com.krce.pages.LoginPage;
import com.krce.pages.SignupPage;
import com.krce.utils.ExtentManager;
import com.krce.utils.ScreenshotUtils;
import org.testng.Assert;
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
        // Extent Report
        ExtentReports extent = ExtentManager.getReport();

        ExtentTest test = extent.createTest("Login Test");
        //Page Objects
        SignupPage signup = new SignupPage(driver);
        LoginPage login = new LoginPage(driver);
        // Click Signup/Login
        signup.clickSignupLogin();

        test.info("Clicked Signup/Login");

        // Enter Email
        login.enterLoginEmail(email);
        test.info("Entered Email");

        // Enter Password
        login.enterLoginPassword(password);
        test.info("Entered Password");

        // Click Login
        login.clickLoginButton();

        test.info("Clicked Login Button");
        // Screenshot
        ScreenshotUtils.captureScreenshot(driver, "LoginTest");
        test.pass("Screenshot Captured");
        // Example Assertion
        Assert.assertTrue(driver.getCurrentUrl().contains("automationexercise"));

        test.pass("Login Test Passed");
        // Flush Report
        extent.flush();
    }
    }


