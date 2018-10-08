package com.framework.appium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

public class CommonMethod {	

	public static void scroolToText(AndroidDriver<?> driver, String text) {		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))");
	}

	public static void lognPress(AndroidDriver<?> driver, By element) {		
		new TouchAction<>(driver).press(ElementOption.element(driver.findElement(element))).perform();
	}

	public  static boolean takeScreenshot(AndroidDriver<?> driver,final String name) throws Exception {
		String destDir = "";
		destDir = "screenshots/failed";
		new File(destDir).mkdirs();
		//switchToNativeView();
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println("Taken Screenshot");
		return screenshot.renameTo(new File(destDir, String.format("%s.png", name)));
	}

	public static void openNotifications(AndroidDriver<?> driver) throws InterruptedException {		
		driver.openNotifications();
		Thread.sleep(1000);		
	}

	public static void installApp(AndroidDriver<?> driver, String path) {		
		driver.installApp(path);
	}

	public static boolean isAppInstalled(AndroidDriver<?> driver, String apppackage) {		
		return driver.isAppInstalled(apppackage);
	}


	public static void removeApp(AndroidDriver<?> driver, String apppackage) {		
		driver.removeApp(apppackage);
	}

	public static void closeApp(AndroidDriver<?> driver) {		
		driver.closeApp();
	}

	public static void runAppInBackground(AndroidDriver<?> driver, int timeSeconds) {		
		driver.runAppInBackground(Duration.ofSeconds(timeSeconds));
	}

	public static void launchApp(AndroidDriver<?> driver) {		
		driver.launchApp();
	}
}
