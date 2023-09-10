package com.Modual;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Pop_Up_Menu {
	public void popup(AndroidDriver driver) throws InterruptedException, MalformedURLException {
		
		Thread.sleep(4000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Popup Menu\"));")).click();
//		driver.findElement(AppiumBy.accessibilityId("Popup Menu")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Make a Popup!")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Edit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/content")).click();
		Thread.sleep(2000);
	}
	
}
