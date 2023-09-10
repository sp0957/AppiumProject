package com.Modual;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class TextSwitcher {
	AndroidDriver driver;
	@Test
	public void text(AndroidDriver driver) throws InterruptedException, MalformedURLException {
	
		Thread.sleep(2000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"TextSwitcher\"));")).click();
//		driver.findElement(AppiumBy.accessibilityId("TextSwitcher")).click();
		
		
		Thread.sleep(2000);
		for (int i = 0; i <12; i++) {
			driver.findElement(AppiumBy.accessibilityId("Next")).click();
		}
		
		   String ele=  driver.findElement(By.xpath("//android.widget.TextView[@text='12']")).getText();
		   assertEquals(ele, "12");
	}
}
