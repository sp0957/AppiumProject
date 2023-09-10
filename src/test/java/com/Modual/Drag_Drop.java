package com.Modual;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import Base.BaseNew;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Drag_Drop extends BaseNew{

	
	
	public void drap_demo(AndroidDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		Thread.sleep(2000);
		WebElement source=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		drop(source,driver);
		Thread.sleep(2000);
		String res=driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
		assertEquals(res, "Dropped!");
		Thread.sleep(2000);
	}
	
	
//	//Drag N Drop  
	//(Remove extends com)
//			public void drop(WebElement source,AndroidDriver driver) {
//				
//				((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
//					    "elementId", ((RemoteWebElement) source).getId(),
//					    "endX", 619,// try to chang X Y values 
//					    "endY", 560
//					));
//				
//			}
//		
//		public void drap_demo(AndroidDriver driver) throws InterruptedException {
//			Thread.sleep(2000);
//			driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
//			Thread.sleep(2000);
//			WebElement source=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
//			drop(source, driver);
//			Thread.sleep(2000);
//			String res=driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
//			assertEquals(res, "Dropped!");
//			Thread.sleep(2000);
//		}
}
