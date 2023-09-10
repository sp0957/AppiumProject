package com.Modual;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Layout_Animation {
	@Test
	public void layout(AndroidDriver driver) throws MalformedURLException, InterruptedException {
		Thread.sleep(2000);
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Layout Animation\"));")).click();
		driver.findElement(AppiumBy.accessibilityId("Layout Animation")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("1. Grid Fade")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("2. List Cascade")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("3. Reverse Order")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("4. Randomize")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("5. Grid Direction")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("6. Wave Scale")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("7. Nested Animations")).click();
		Thread.sleep(2000);
	}
}
