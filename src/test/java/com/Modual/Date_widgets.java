package com.Modual;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;

public class Date_widgets {
	@Test
	public void dialog(AndroidDriver driver) throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Date Widgets")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("1. Dialog")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("change the time")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/hours")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("8")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/minutes")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("30")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='PM']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("android:id/toggle_mode")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/input_hour")).sendKeys("12");
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/input_minute")).sendKeys("05");
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/am_pm_spinner")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='PM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(2000);
		// change the date
		driver.findElement(AppiumBy.accessibilityId("change the date")).click();
		Thread.sleep(3000);
		
		driver.findElement(AppiumBy.accessibilityId("Next month")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("Next month")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.view.View[@text='6']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		Thread.sleep(3000);
	}
	
	
	
	
		
	}
	

