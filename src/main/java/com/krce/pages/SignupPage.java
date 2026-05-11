package com.krce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
    WebDriver driver;
    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }
    By signupLoginBtn = By.linkText("Signup / Login");
    By nameField = By.name("name");
    By emailField =
            By.xpath("//input[@data-qa='signup-email']");
    By signupButton =
            By.cssSelector("button[data-qa='signup-button']");
    public void clickSignupLogin() {
        driver.findElement(signupLoginBtn).click();
    }
    public void enterName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }
    public String enterEmail() {
        String email ="harini" + System.currentTimeMillis() + "@gmail.com";
        driver.findElement(emailField).sendKeys(email);
        return email;
    }
    public void clickSignupButton() {
        driver.findElement(signupButton).click();
    }

}
