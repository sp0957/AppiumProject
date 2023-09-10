package com.Modual;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.offset.PointOption;

public class SeekBars {
	
	public void seek(AndroidDriver driver) throws MalformedURLException, InterruptedException {
		Thread.sleep(3000);
//		driver.findElement(AppiumBy.accessibilityId("Seek Bar")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Seek Bar\"));")).click();
		Thread.sleep(3000);
		 WebElement  silder=driver.findElement(By.id("io.appium.android.apis:id/seek"));
			
		 int xAxisStartPonit=silder.getLocation().getX();
		 int xAxisEandPonit=xAxisStartPonit+silder.getSize().getWidth();
		 int yAxisStartPonit=silder.getLocation().getY();
		 TouchAction action=new TouchAction(driver);
		 action.press(PointOption.point(xAxisStartPonit,yAxisStartPonit)).moveTo(PointOption.point(xAxisEandPonit-1,yAxisStartPonit)).release().perform();

		
		 String er= driver.findElement(By.id("io.appium.android.apis:id/progress")).getText();
		 assertEquals(er, "100 from touch=true");
	}

}
