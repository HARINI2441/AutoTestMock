package com.krce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {
    WebDriver driver;
    WebDriverWait wait;
    public ProductsPage(WebDriver driver,WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    By productsBtn = By.xpath("//a[@href='/products']");
    By searchBox = By.id("search_product");
    By searchBtn = By.id("submit_search");
    public void clickProducts() {
       WebElement productButton = wait.until(ExpectedConditions.elementToBeClickable(productsBtn));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", productButton);
    }
    public void searchProduct(String productName) {
       WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});",search);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-150)");
        search.sendKeys(productName);
    }
    public void clickSearchButton() {
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", searchButton);
    }
}
