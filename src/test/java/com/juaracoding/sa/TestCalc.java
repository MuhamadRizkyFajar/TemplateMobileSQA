package com.juaracoding.sa;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.juaracoding.sa.driver.DriverAndroid;
import com.juaracoding.sa.driver.DriverSingleton;
import com.juaracoding.sa.function.FungsiKalkulator;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class TestCalc extends Reporting {
	
	AppiumDriver<MobileElement> driver;
	
	FungsiKalkulator kalkulator;
	
		
	@BeforeTest
	public void openCalculator() {
		
		DriverSingleton driverSingleton = DriverSingleton.getInstance();
		driver = driverSingleton.getDriver();
		kalkulator = new FungsiKalkulator();
		
		System.out.println("Appium Testing started...");
	}
	
	@Test
	public void fungsi1Tambah() {
		
		ExtentTest test1 = extentReports.createTest("Step 1","fungsi tambah");
		test1.log(Status.INFO, "Step 1");
		
		kalkulator.pertambahan();
		
		test1.log(Status.PASS, "Fungsi 1 Tambah berhasil");
		
	}
	
	@Test
	public void fungsi2Kali() {
		ExtentTest test2 = extentReports.createTest("Step 2","Fungsi Perkalian");
		test2.log(Status.INFO, "Step 2");	
		
		kalkulator.perkalian();
		
		test2.log(Status.PASS, "Fungsi 2 Perkalian berhasil");
	}
		
		
	
}
