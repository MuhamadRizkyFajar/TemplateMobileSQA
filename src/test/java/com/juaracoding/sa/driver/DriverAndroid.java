package com.juaracoding.sa.driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.juaracoding.sa.function.FungsiKalkulator;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class DriverAndroid {

	public AppiumDriver<MobileElement> getDriver() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Pixel_4_API_25");
		capabilities.setCapability("uuid", "emulator-5554");
		capabilities.setCapability("platform", "Android");
		capabilities.setCapability("platformVersion", "7.1.1");
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(url, capabilities);
		
		return driver;
	}

}
