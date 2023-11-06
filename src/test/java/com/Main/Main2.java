package com.Main;

import java.awt.Container;
import java.awt.Scrollbar;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.Modual.Animation;
import com.Modual.Auto_Complete;
import com.Modual.Chronometer;
import com.Modual.Control;
import com.Modual.Date_widgets;
import com.Modual.Drag_Drop;
import com.Modual.Expandable_List;
import com.Modual.Gallery;
import com.Modual.Grid;
import com.Modual.ImageSwitcher;
import com.Modual.Layout;
import com.Modual.Layout_Animation;
import com.Modual.Picker;
import com.Modual.Pop_Up_Menu;
import com.Modual.ProgressBar;
import com.Modual.Radio_Groups;
import com.Modual.Rating_Bar;
import com.Modual.Rotating_button;
import com.Modual.Search_View;
import com.Modual.Secure_View;
import com.Modual.SeekBars;

import com.Modual.TextSwitcher;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Main2 {

	public AndroidDriver driver;
	Auto_Complete AC =null;
	Chronometer CM;
	Container container;
	TextSwitcher TS;
	
	Secure_View SV;
	Search_View search_View;
	Rotating_button RB;
	Rating_Bar rating_Bar;
	Radio_Groups RG;
	ProgressBar PB;
	Layout_Animation LA;
	ImageSwitcher IS;
	Grid grid;
	Gallery gallery;
	Expandable_List EL;
	Drag_Drop DD;
	Date_widgets DW;
	Control control;
//	 public AppiumDriverLocalService service;
    Animation animation = null;
	Layout LY;
	Picker PK;
	Pop_Up_Menu PUM;
	SeekBars SB;
	


	
	@BeforeMethod
	 public void configureAppium() throws MalformedURLException, InterruptedException {
			//start appium service
		AppiumDriverLocalService	service=new AppiumServiceBuilder()
					.withAppiumJS(new File("C:\\Users\\JENIS\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
					.withIPAddress("127.0.0.1")
					.usingPort(4723).build();
			service.start();
			
			//For emulator 
			UiAutomator2Options options = new UiAutomator2Options();
	        options.setDeviceName("sahil3");
	        options.setApp("D:\\sahil_learn\\apk file-20230711T054826Z-001\\apk file\\ApiDemos-debug.apk");
	        
	        //For Real device
//	        DesiredCapabilities dsCapabilities=new DesiredCapabilities();
//			dsCapabilities.setCapability(MobileCapabilityType.APP, "D:\\sahil_learn\\apk file-20230711T054826Z-001\\apk file\\ApiDemos-debug.apk");
//			dsCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
//			dsCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO CPH2285");
//			dsCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0");
//			dsCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//			URL url=new URL("http://127.0.0.1:4723");
//			AndroidDriver driver=new AndroidDriver(url, dsCapabilities);
	        
	         driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
			driver.findElement(AppiumBy.accessibilityId("Views")).click();
			Thread.sleep(2000);
			


			
	
	 }
	
	
	
	@Test(priority = 0)
	public void Animationn() throws InterruptedException, MalformedURLException {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		animation=new Animation();
		animation.Transition(driver);
		driver.navigate().back();
		Thread.sleep(2000);
		animation.interpolators(driver);
		driver.navigate().back();
		Thread.sleep(2000);
		animation.Push(driver);
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();

	}
	
	@Test(priority = 1)
	public void autoComplete() throws MalformedURLException, InterruptedException {
		AC=new Auto_Complete();
		AC.auto(driver);
		driver.navigate().back();
		driver.navigate().back();
		
	}
	
	@Test(priority = 2)
	public void chrono() throws InterruptedException {
		CM=new Chronometer();
		CM.chronometre(driver);
		driver.navigate().back();
	}
	
 	@Test(priority = 3)
	public void contrl() throws InterruptedException {
		control=new Control();
		Thread.sleep(2000);
		control.dark_Theme(driver);
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		
	}
	
	@Test(priority = 4)
	public void date() throws InterruptedException {
		DW=new Date_widgets();
		DW.dialog(driver);
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority = 5)
	public void dragDrop() throws InterruptedException {
		DD=new Drag_Drop();
		DD.drap_demo(driver);
		driver.navigate().back();
	}
	
	@Test(priority = 6)
	public void List() throws InterruptedException {
		EL=new Expandable_List();
		EL.custom_adapter(driver);
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority = 7)
	public void gallerys() throws InterruptedException {
		gallery=new Gallery();
		gallery.photos(driver);
		driver.navigate().back();
		driver.navigate().back();
		
		
	}
	
	@Test(priority = 8)
	public void grid() throws MalformedURLException, InterruptedException {
		grid=new Grid();
		grid.icon_grid(driver);
		driver.navigate().back();
		Thread.sleep(2000);
		grid.photo_grid(driver);
		driver.navigate().back();
		driver.navigate().back();

	}
	
	@Test(priority = 9)
	public void image() throws MalformedURLException, InterruptedException {
		IS =new ImageSwitcher();
		IS.switchwr(driver);
		driver.navigate().back();
	}

	@Test(priority = 10)
	public void layoutAnimation() throws MalformedURLException, InterruptedException {
		LA=new Layout_Animation();
		LA.layout(driver);
		driver.navigate().back();
		driver.navigate().back();
		
	}
	
	
	
	@Test(priority = 11)
	public void layout() throws MalformedURLException, InterruptedException {
		Thread.sleep(2000);
		LY=new Layout();
		LY.layoutt(driver);
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
	}
	
	
	@Test(priority = 12)
	public void pickerr() throws MalformedURLException, InterruptedException {
		Thread.sleep(2000);
		PK=new Picker();
		PK.pick(driver);
		driver.navigate().back();
		
	}
	
	@Test(priority = 13)
	public void popup() throws MalformedURLException, InterruptedException {
		Thread.sleep(2000);
		PUM =new Pop_Up_Menu();
		PUM.popup(driver);
		driver.navigate().back();
	}
	
	@Test(priority = 14)
	public void Progress() throws InterruptedException, MalformedURLException {
		Thread.sleep(2000);
		PB =new ProgressBar();
		PB.incremental(driver);
		driver.navigate().back();
		driver.navigate().back();
	}
	@Test(priority = 15)
	public void radio() throws MalformedURLException, InterruptedException {
		Thread.sleep(2000);
		RG=new Radio_Groups();
		RG.radio(driver);
		driver.navigate().back();
	}
	
	@Test(priority = 16)
	public void  bar() throws MalformedURLException, InterruptedException {
		Thread.sleep(3000);
		rating_Bar=new Rating_Bar();
		rating_Bar.bar(driver);
		driver.navigate().back();
		
	}
	@Test(priority = 17)
	public void button() throws MalformedURLException, InterruptedException {
		Thread.sleep(3000);
		RB=new Rotating_button();
		RB.rotating(driver);
		driver.navigate().back();
		
	}
	
	@Test(priority = 18)
	public void search() throws MalformedURLException, InterruptedException {
		Thread.sleep(3000);
		search_View=new Search_View();
		search_View.action_bar(driver);
		Thread.sleep(2000);
		search_View.filter(driver);
		driver.navigate().back();
		driver.navigate().back();

		
	}
	
	@Test(priority = 19)
	public void secure() throws MalformedURLException, InterruptedException {
		Thread.sleep(4000);
		SV=new Secure_View();
		SV.popUp(driver);
		driver.navigate().back();
		
	}
	
	@Test(priority = 20)
	public void seek() throws MalformedURLException, InterruptedException {
		Thread.sleep(4000);
		SB=new SeekBars();
		SB.seek(driver);
		driver.navigate().back();
		
	}

	@Test(priority = 21)
	public void switcher() throws MalformedURLException, InterruptedException {
		Thread.sleep(4000);
		TS=new TextSwitcher();
		TS.text(driver);
		
	}
	
	 @AfterMethod
		public void tearDown() {
//			driver.quit();
//	        service.close();
		}

}
