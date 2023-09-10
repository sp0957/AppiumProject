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

public class Rating_Bar  {

	public void bar(AndroidDriver driver) throws InterruptedException, MalformedURLException {
		
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rating Bar\"));")).click();
		Thread.sleep(4000);
		driver.findElement(AppiumBy.accessibilityId("Rating Bar")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("io.appium.android.apis:id/ratingbar2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("io.appium.android.apis:id/ratingbar1")).click();
		
		 String element=  driver.findElement(By.xpath("//android.widget.TextView[@text='Rating: 2.0/3']")).getText();
		 if (element.contains("Rating: 2.0/3")) {
			System.out.println("Test Pass");
		}
		 else {
			 System.out.println("Test is Failed");
		 }
		
	}

}
