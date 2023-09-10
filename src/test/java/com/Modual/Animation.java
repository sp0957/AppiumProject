package com.Modual;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Animation   {
	
    public void Transition(AndroidDriver driver) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Animation")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("3D Transition")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Lyon']")).click();
		
	}

	public void interpolators(AndroidDriver driver) throws InterruptedException, MalformedURLException {
//	driver.findElement(AppiumBy.accessibilityId("Views")).click();
//	Thread.sleep(2000);
//	driver.findElement(AppiumBy.accessibilityId("Animation")).click();
//	Thread.sleep(2000);
	driver.findElement(AppiumBy.accessibilityId("Interpolators")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//android.widget.TextView[@text='Accelerate']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Bounce']")).click();
	Thread.sleep(4000);
	
   }
	
	
	public void Push(AndroidDriver driver) throws MalformedURLException, InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Push")).click();
		driver.findElement(By.id("io.appium.android.apis:id/spinner")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Hyperspace']")).click();
		
	}
}
