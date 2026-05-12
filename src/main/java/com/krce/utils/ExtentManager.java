package com.krce.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;

public class ExtentManager {

    static ExtentReports extent;

    public static ExtentReports getReport() {

        if(extent == null) {

            // Create reports folder automatically
            File folder = new File("reports");

            if(!folder.exists()) {

                folder.mkdir();
            }

            // Report Path
            ExtentSparkReporter reporter =
                    new ExtentSparkReporter(
                            "reports/AutomationReport.html");

            // Report Name
            reporter.config().setReportName(
                    "Automation Exercise Report");

            // Document Title
            reporter.config().setDocumentTitle(
                    "Selenium Test Report");

            extent = new ExtentReports();

            extent.attachReporter(reporter);

            // System Info
            extent.setSystemInfo(
                    "Tester",
                    "Harini");

            extent.setSystemInfo(
                    "Environment",
                    "QA");
        }

        return extent;
    }
}