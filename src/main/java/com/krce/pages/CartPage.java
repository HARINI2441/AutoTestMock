package com.krce.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstProduct = By.xpath("(//div[@class='product-image-wrapper'])[1]");
    By addToCart = By.xpath("(//a[contains(text(),'Add to cart')])[1]");
    By viewCart = By.xpath("//u[text()='View Cart']");

    public void addProductToCart() {

        try {
            // Close advertisement popup if present
            driver.findElement(By.cssSelector(".fc-button-close")).click();

        } catch (Exception e) {
            System.out.println("No Ad Popup Present");
        }

        // Hover on product
        Actions actions = new Actions(driver);

        WebElement product = driver.findElement(firstProduct);
        actions.moveToElement(product).perform();

        // Scroll to Add To Cart button
        WebElement addBtn = driver.findElement(addToCart);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", addBtn);
        // JavaScript click
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addBtn);
    }
    public void clickViewCart() {
        driver.findElement(viewCart).click();
    }
}