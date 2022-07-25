package com.juaracoding.sa;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TestCalculator {
	
	AppiumDriver<MobileElement> driver;
	
	@Before
	public void openCalculator()  throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Pixel_4_API_25");
		capabilities.setCapability("uuid", "emulator-5554");
		capabilities.setCapability("platform", "Android");
		capabilities.setCapability("platformVersion", "7.1.1");
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url, capabilities);
		
		System.out.println("Appium Testing started...");
	}
	
	@Test
	public void fungsiTambah() {
		
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("deviceName", "Pixel_4_API_25");
//		capabilities.setCapability("uuid", "emulator-5554");
//		capabilities.setCapability("platform", "Android");
//		capabilities.setCapability("platformVersion", "7.1.1");
//		capabilities.setCapability("appPackage", "com.android.calculator2");
//		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
//		
//		URL url = new URL("http://127.0.0.1:4723/wd/hub");
//		
//		driver = new AppiumDriver<MobileElement>(url, capabilities);
//		
//		System.out.println("Appium Testing started...");
		
		MobileElement satu = driver.findElement(By.id("com.android.calculator2:id/digit_1"));
		
		MobileElement dua = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
		
		MobileElement tambah = driver.findElement(By.id("com.android.calculator2:id/op_add"));
		
		MobileElement samadengan = driver.findElement(By.id("com.android.calculator2:id/eq"));
		
		MobileElement hasil = driver.findElement(By.id("com.android.calculator2:id/result"));
		
		satu.click();
		
		tambah.click();
		
		dua.click();
		
		samadengan.click();
		
//		assertEquals("3", hasil.getText());
		
		System.out.println("hasilnya : "+hasil.getText());
		
//		MobileElement tiga = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
//		
//		MobileElement empat = driver.findElement(By.id("com.android.calculator2:id/digit_4"));
//		
//		MobileElement kali = driver.findElement(By.id("com.android.calculator2:id/op_mul"));
//		
////		MobileElement samadengan2 = driver.findElement(By.id("com.android.calculator2:id/eq"));
////		
////		MobileElement hasil2 = driver.findElement(By.id("com.android.calculator2:id/result"));
//		
//		tiga.click();
//		
//		kali.click();
//		
//		empat.click();
//		
//		samadengan.click();
//		
//		assertEquals("12", hasil.getText());
//		
//		System.out.println("hasilnya : "+hasil.getText());
		
//		MobileElement moreoptions = driver.findElement(By.xpath( "//android.widget.ImageButton[@content-desc=\"More options\"]"));
//		
//		moreoptions.click();
//		
//		MobileElement openlicense = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]"));
//		
//		openlicense.click();
		
	}
	
	@Test
	public void fungsiKali() {
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("deviceName", "Pixel_4_API_25");
//		capabilities.setCapability("uuid", "emulator-5554");
//		capabilities.setCapability("platform", "Android");
//		capabilities.setCapability("platformVersion", "7.1.1");
//		capabilities.setCapability("appPackage", "com.android.calculator2");
//		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
//		
//		URL url = new URL("http://127.0.0.1:4723/wd/hub");
//		
//		driver = new AppiumDriver<MobileElement>(url, capabilities);
//		
//		System.out.println("Appium Testing started...");
		
		MobileElement tiga = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
		
		MobileElement empat = driver.findElement(By.id("com.android.calculator2:id/digit_4"));
		
		MobileElement kali = driver.findElement(By.id("com.android.calculator2:id/op_mul"));
		
		MobileElement samadengan = driver.findElement(By.id("com.android.calculator2:id/eq"));
		
		MobileElement hasil = driver.findElement(By.id("com.android.calculator2:id/result"));
		
		tiga.click();
		
		kali.click();
		
		empat.click();
		
		samadengan.click();
		
		assertEquals("12", hasil.getText());
		
		System.out.println("hasilnya : "+hasil.getText());
	}
		
		
	
}
