package com.Modual;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Layout  {
	
	public void layoutt(AndroidDriver driver) throws InterruptedException {
		
		Thread.sleep(4000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Layouts\"));")).click();
//		driver.findElement(AppiumBy.accessibilityId("Layouts")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("GridLayout")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("2. Form (XML)")).click();
		   WebElement email =driver.findElement(By.xpath("//android.widget.EditText[@index='3']"));
		   WebElement pass =driver.findElement(By.xpath("//android.widget.EditText[@index='5']"));
		Actions actions=new Actions(driver);
		Action a1=actions.moveToElement(email).click().sendKeys("Hello Testing Word").build();
		a1.perform();
		Thread.sleep(2000);
		Action a2=actions.moveToElement(pass).click().sendKeys("Test!21").build();
		a2.perform();
		
		Thread.sleep(2000);
		
	}

}
