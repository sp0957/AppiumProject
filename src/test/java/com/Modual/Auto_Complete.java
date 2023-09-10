package com.Modual;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Auto_Complete{
	@Test
	public void auto(AndroidDriver driver) throws MalformedURLException, InterruptedException {
		

		
		driver.findElement(AppiumBy.accessibilityId("Auto Complete")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("1. Screen Top")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("india");
		Thread.sleep(1000);
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));")).click();
//		Thread.sleep(1000);
//		Actions actions=new Actions(driver);
//		actions.sendKeys(Keys.ENTER).build().perform();
	}

}
