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

public class Radio_Groups {
	@Test
	public void radio(AndroidDriver driver) throws MalformedURLException, InterruptedException {
		Thread.sleep(4000);
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Radio Group\"));")).click();
		driver.findElement(AppiumBy.accessibilityId("Radio Group")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Lunch")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("All of them")).click();
//		 
		 String element=driver.findElement(AppiumBy.accessibilityId("You have selected: (none)")).getText();;
		Thread.sleep(2000);
		if (element.contains("You have selected: 2131296327")) {
			System.out.println("Test is pass");
		}
		

	}

}
