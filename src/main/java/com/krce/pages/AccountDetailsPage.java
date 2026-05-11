package com.krce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountDetailsPage {
    WebDriver driver;

    public AccountDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    By gender = By.id("id_gender2");
    By password = By.id("password");
    By day = By.id("days");
    By month = By.id("months");
    By year = By.id("years");
    By newsletter = By.id("newsletter");
    By specialOffers = By.id("optin");
    By firstName = By.id("first_name");
    By lastName = By.id("last_name");
    By company = By.id("company");
    By address1 = By.id("address1");
    By address2 = By.id("address2");
    By country = By.id("country");
    By state = By.id("state");
    By city = By.id("city");
    By zipcode = By.id("zipcode");
    By mobileNumber = By.id("mobile_number");
    By createAccountButton = By.cssSelector("button[data-qa='create-account']");
    By continueButton = By.xpath("//a[@data-qa='continue-button']");

    public void selectGender() {
        driver.findElement(gender).click();
    }
    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }
    public void selectDay(String value) {
        Select select = new Select(driver.findElement(day));
        select.selectByValue(value);
    }
    public void selectMonth(String value) {
        Select select = new Select(driver.findElement(month));
        select.selectByVisibleText(value);
    }
    public void selectYear(String value) {
        Select select = new Select(driver.findElement(year));
        select.selectByValue(value);
    }
    public void clickNewsletter() {
        driver.findElement(newsletter).click();
    }
    public void clickSpecialOffers() {
        driver.findElement(specialOffers).click();
    }
    public void enterFirstName(String fname) {
        driver.findElement(firstName).sendKeys(fname);
    }
    public void enterLastName(String lname) {
        driver.findElement(lastName).sendKeys(lname);
    }
    public void enterCompany(String comp) {
        driver.findElement(company).sendKeys(comp);
    }
    public void enterAddress1(String add1) {
        driver.findElement(address1).sendKeys(add1);
    }
    public void enterAddress2(String add2) {
        driver.findElement(address2).sendKeys(add2);
    }
    public void selectCountry(String value) {
        Select select = new Select(driver.findElement(country));
        select.selectByVisibleText(value);
    }
    public void enterState(String stateName) {
        driver.findElement(state).sendKeys(stateName);
    }
    public void enterCity(String cityName) {
        driver.findElement(city).sendKeys(cityName);
    }
    public void enterZipcode(String zip) {
        driver.findElement(zipcode).sendKeys(zip);
    }
    public void enterMobileNumber(String mobile) {
        driver.findElement(mobileNumber).sendKeys(mobile);
    }
    public void clickCreateAccount() {
        WebElement btn = driver.findElement(createAccountButton);
        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].scrollIntoView({block:'center'});", btn);
        btn.click();
    }
    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }
}
