package com.krce.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
    public static WebElement waitForVisibility(
            WebDriver driver,
            WebDriverWait wait,By locator) {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator));
    }
}


