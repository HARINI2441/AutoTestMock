package com.krce.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtils {

    public static String captureScreenshot(WebDriver driver,
                                           String testName) {
        // Create Screenshot Object
        File src =
                ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.FILE);
        // Create screenshots folder automatically
        File folder = new File("screenshots");
        if(!folder.exists()) {
            folder.mkdir();
        }
        // Screenshot path
        String path = "screenshots/" + testName + ".png";
        try {
            // Copy screenshot to folder
            FileUtils.copyFile(src, new File(path));
            System.out.println(
                    "Screenshot Saved Successfully");
        } catch (IOException e) {
            System.out.println(
                    "Screenshot Failed");
            e.printStackTrace();
        }
        return path;
    }
}