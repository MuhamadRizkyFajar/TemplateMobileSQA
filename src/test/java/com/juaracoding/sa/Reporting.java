package com.juaracoding.sa;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporting {
	
	ExtentSparkReporter htmlreporter;
	ExtentReports extentReports;
	
	@BeforeSuite
	public void reportSetup() {
		htmlreporter = new ExtentSparkReporter("src/main/resources/report.html");
		extentReports = new ExtentReports();
		extentReports.attachReporter(htmlreporter);
	}
	
	@AfterSuite
	public void reportTeardown() {
		extentReports.flush();
	}

}
