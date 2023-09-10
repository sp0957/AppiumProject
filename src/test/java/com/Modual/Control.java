package com.Modual;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Control{
	@Test
	public void dark_Theme(AndroidDriver driver) throws InterruptedException {
//		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("Controls")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("2. Dark Theme")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("Hello Tester....");
		Thread.sleep(3000);
 		driver.findElement(AppiumBy.accessibilityId("Checkbox 2")).click();
 		Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("RadioButton 2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("io.appium.android.apis:id/toggle1")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Mercury']")).click();
//		driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Jupiter']")).click();
		Thread.sleep(3000);
	}

}
