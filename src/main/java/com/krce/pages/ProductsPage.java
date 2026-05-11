package com.krce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }
    By productsBtn = By.xpath("//a[@href='/products']");
    By searchBox = By.id("search_product");
    By searchBtn = By.id("submit_search");
    public void clickProducts() {
        driver.findElement(productsBtn).click();
    }
    public void searchProduct(String productName) {
        driver.findElement(searchBox).sendKeys(productName);
    }
    public void clickSearchButton() {
        driver.findElement(searchBtn).click();
    }
}
