package com.Modual;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class ProgressBar {

 public void incremental(AndroidDriver driver) throws InterruptedException, MalformedURLException {
	
		Thread.sleep(4000);
		driver.findElement(AppiumBy.accessibilityId("Progress Bar")).click();
		
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Progress Bar\"));")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("1. Incremental")).click();
		
		  for (int i = 0; i <=5; i++) {
				  WebElement obj= driver.findElement(By.xpath("//android.widget.Button[@text='+']"));
				  obj.click();
				  Thread.sleep(1000);
			      WebElement ele= driver.findElement(By.id("io.appium.android.apis:id/increase_secondary"));
			      ele.click();
			      Thread.sleep(1000);
		}
		
		
}
}
