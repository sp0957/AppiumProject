package com.Modual;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import Base.BaseNew;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver; 

public class Expandable_List extends BaseNew{
	@Test
	public void custom_adapter(AndroidDriver driver) throws InterruptedException {
		  driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click(); 
		  Thread.sleep(2000);
		 driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		 Thread.sleep(2000);
		 WebElement ele=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		 longPressAction(ele,driver);
		 Thread.sleep(2000);
		 WebElement ele1=driver.findElement(By.xpath("//android.widget.TextView[@text='Sample menu']"));
		 String samString=ele1.getText();
		 Thread.sleep(2000);
		 assertEquals(samString, "Sample menu");
		 boolean display= ele1.isDisplayed();
		 assertTrue(display);
		 Thread.sleep(2000);
		
	}
	
	
	
	
}
