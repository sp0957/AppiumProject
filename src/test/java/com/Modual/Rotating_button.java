package com.Modual;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Rotating_button{
	public void rotating(AndroidDriver driver) throws InterruptedException, MalformedURLException {
		
		
		Thread.sleep(2000);
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rotating Button\"));")).click();
		driver.findElement(AppiumBy.accessibilityId("Rotating Button")).click();
		Thread.sleep(1000);

//		 WebElement element1= driver.findElement(By.id("io.appium.android.apis:id/translationX"));
//         WebElement element2= driver.findElement(By.id("io.appium.android.apis:id/translationY"));
//         WebElement element3= driver.findElement(By.id("io.appium.android.apis:id/scaleX"));
//         WebElement element4= driver.findElement(By.id("io.appium.android.apis:id/scaleY"));
//         WebElement element5= driver.findElement(By.id("io.appium.android.apis:id/rotationX"));
//         WebElement element6= driver.findElement(By.id("io.appium.android.apis:id/rotationY"));
//         WebElement element7= driver.findElement(By.id("io.appium.android.apis:id/rotationZ"));
//
//		TouchAction action=new TouchAction(driver);
//		action.longPress(ElementOption.element(element1)).moveTo(ElementOption.element(element1,399,294)).release().perform();
//		Thread.sleep(1000);
//		action.longPress(ElementOption.element(element2)).moveTo(ElementOption.element(element2,939,300)).release().perform();
//		Thread.sleep(1000);
//		action.longPress(ElementOption.element(element3)).moveTo(ElementOption.element(element3,282,406)).release().perform();
//		Thread.sleep(1000);
//		action.longPress(ElementOption.element(element4)).moveTo(ElementOption.element(element4,886,406)).release().perform();
//		Thread.sleep(1000);
//		action.longPress(ElementOption.element(element5)).moveTo(ElementOption.element(element5,166,515)).release().perform();
//		Thread.sleep(1000);
//		action.longPress(ElementOption.element(element6)).moveTo(ElementOption.element(element6,554,515)).release().perform();
//		Thread.sleep(1000);
//		action.longPress(ElementOption.element(element7)).moveTo(ElementOption.element(element7,918,522)).release().perform();
//		Thread.sleep(1000);

		
//		for (int i = 0; i < 4; i++) {
//			  driver.findElement(By.id("io.appium.android.apis:id/translationX")).click();
//			  Thread.sleep(2000);
//
//		}
//	      driver.findElement(By.id("io.appium.android.apis:id/translationY")).click();
//	      driver.findElement(By.id("io.appium.android.apis:id/scaleX")).click();
//	      driver.findElement(By.id("io.appium.android.apis:id/scaleY")).click();
//	      driver.findElement(By.id("io.appium.android.apis:id/rotationX")).click();
//	      driver.findElement(By.id("io.appium.android.apis:id/rotationY")).click();
//	      driver.findElement(By.id("io.appium.android.apis:id/rotationZ")).click();
	      
		 WebElement  silder=driver.findElement(By.id("io.appium.android.apis:id/translationX"));
		
		 int xAxisStartPonit=silder.getLocation().getX();
		 int xAxisEandPonit=xAxisStartPonit+silder.getSize().getWidth();
		 int yAxisStartPonit=silder.getLocation().getY();
		 TouchAction action=new TouchAction(driver);
		 action.press(PointOption.point(xAxisStartPonit,yAxisStartPonit)).moveTo(PointOption.point(xAxisEandPonit-1,yAxisStartPonit)).release().perform();

	}

}
