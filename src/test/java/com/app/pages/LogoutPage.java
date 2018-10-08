package com.app.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.appium.BaseClass;
import com.framework.appium.CommonMethod;

import io.appium.java_client.android.AndroidKeyCode;

public class LogoutPage extends BaseClass{
	public LogoutPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//android.widget.TextView[@text='About']")
	WebElement lblAbout;	

	@FindBy(xpath="//android.widget.Button[@text='Log out']")
	WebElement btnLogout;	

	@FindBy(xpath="//android.widget.Button[@text='OK']")
	WebElement btnOk;	

	public WebElement getLblAbout() {
		return lblAbout;
	}

	public WebElement getBtnLogout() {
		return btnLogout;
	}

	public WebElement getBtnOk() {
		return btnOk;
	}

	public void logoutTest() throws Exception {
		getLblAbout().click();
		getBtnLogout().click();
		getBtnOk().click();
		Thread.sleep(10000);		
	}	
}