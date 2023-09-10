package com.Modual;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Secure_View   {
	
	public void popUp(AndroidDriver driver) throws InterruptedException, MalformedURLException {
		
		Thread.sleep(4000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Secure View\"));")).click();
		
		
		Thread.sleep(4000);
		driver.findElement(By.id("io.appium.android.apis:id/secure_view_unsecure_button")).click();;
		Thread.sleep(4000);	
//		driver.findElement(By.xpath("//android.widget.Button[@text='Don't click! It'll cost you!']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='Oops...']")).click();
		Thread.sleep(1000);

	}

}
