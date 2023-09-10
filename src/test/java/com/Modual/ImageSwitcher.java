package com.Modual;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class ImageSwitcher{
	
	@Test
	public void switchwr(AndroidDriver driver) throws InterruptedException, MalformedURLException {
		
		Thread.sleep(2000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ImageSwitcher\"));")).click();
		 Thread.sleep(3000);
		
		 driver.findElement(By.xpath("//android.widget.ImageView[@index='0']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//android.widget.ImageView[@index='1']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//android.widget.ImageView[@index='2']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//android.widget.ImageView[@index='3']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//android.widget.ImageView[@index='4']")).click();
		 Thread.sleep(3000);

		 
	}

}
