package com.Modual;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Search_View {
	
	
	public void action_bar(AndroidDriver driver) throws InterruptedException, MalformedURLException {
		
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Search View\"));")).click();
		Thread.sleep(4000);
		driver.findElement(AppiumBy.accessibilityId("Search View")).click();
		Thread.sleep(1000);
		
		driver.findElement(AppiumBy.accessibilityId("Action Bar")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.accessibilityId("Search")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.AutoCompleteTextView[@text='   Search Demo Hint']")).sendKeys("I Am A Automation Tester.....");
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
	}
	
	public void filter(AndroidDriver driver) throws InterruptedException, MalformedURLException {

	
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Filter")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.AutoCompleteTextView[@text='Cheese hunt']")).sendKeys("nio");
		Thread.sleep(1000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Niolo\"));")).click();
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();
		
		
		
	}

}
