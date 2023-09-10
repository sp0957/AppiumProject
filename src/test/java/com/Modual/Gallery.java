package com.Modual;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import Base.BaseNew;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Gallery extends BaseNew{
	
	
	public void photos(AndroidDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Gallery']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		Thread.sleep(2000);
		
		WebElement el=driver.findElement(By.xpath("//android.widget.ImageView[1]"));
		swipeAction(el, "left" ,driver);
	}

	
	
}
