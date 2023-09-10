package com.Modual;

import static org.testng.Assert.assertEquals;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Chronometer {
	
	public void chronometre(AndroidDriver driver) throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Chronometer")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Start")).click();
		Thread.sleep(4000);
		driver.findElement(AppiumBy.accessibilityId("Set format string")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Clear format string")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Stop")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("Reset")).click();

		
		 WebElement ele=driver.findElement(By.xpath("//android.widget.Chronometer[@text='00:00']"));
//		 assertEquals(ele, "Initial format: 00:00");
//		 Thread.sleep(2000);
		 if (ele.equals("00:00")) {
			System.out.println("Test is pass");
		} 
		
	}

}
