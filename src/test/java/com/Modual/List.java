package com.Modual;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class List {

	
	@Test
	public void listt() throws InterruptedException, MalformedURLException {
		
		UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("sahil2");
        Thread.sleep(3000);
        options.setApp("D:\\sahil_learn\\apk file-20230711T054826Z-001\\apk file\\ApiDemos-debug.apk");
        Thread.sleep(3000);
        AndroidDriver     driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Lists\"));")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("08. Photos")).click();
		
		
		for (int i = 0; i <7; i++) {
			driver.findElement(AppiumBy.accessibilityId("New photo")).click();
			Thread.sleep(1000);

		}
		Thread.sleep(4000);
		
		driver.findElement(AppiumBy.accessibilityId("Clear photos")).click();
		Thread.sleep(2000);
		    WebElement ele=  driver.findElement(AppiumBy.accessibilityId("No photos"));
		    assertEquals(ele, "No photos");
		
		
	}
}
