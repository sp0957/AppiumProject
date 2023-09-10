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

public class Grid {
@Test
	public void icon_grid(AndroidDriver driver) throws MalformedURLException, InterruptedException {
//		  driver.findElement(AppiumBy.accessibilityId("Views")).click();

		driver.findElement(AppiumBy.accessibilityId("Grid")).click();
		
		driver.findElement(AppiumBy.accessibilityId("1. Icon Grid")).click();
		Thread.sleep(4000);
		   
	}

	 public void photo_grid(AndroidDriver driver) throws InterruptedException {
		 Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("2. Photo Grid")).click();
		Thread.sleep(2000);
		   
		   Thread.sleep(2000);
	}
	
}
