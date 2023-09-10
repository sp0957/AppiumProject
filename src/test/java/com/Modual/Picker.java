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

public class Picker  {
	@Test
	public void pick(AndroidDriver driver) throws MalformedURLException, InterruptedException {
		
		Thread.sleep(2000);
//		driver.findElement(AppiumBy.accessibilityId("Picker")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Picker\"));")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"kupima\"));")).click();
		Thread.sleep(4000);
		String ele =driver.findElement(By.xpath("//android.widget.TextView[@text='Value: kupima']")).getText();
		if (ele.contains("kupima")) {
			System.out.println("Test Pass");
		}
		
		Thread.sleep(3000);
	}

}
