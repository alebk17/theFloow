package com.app.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.appium.BaseClass;
import com.framework.appium.CommonMethod;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidKeyCode;

public class ChangPasswordPage extends BaseClass{
	public ChangPasswordPage() {
		PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//android.widget.TextView[@text='Change Password']")
	WebElement txtChangePassword;	
	
	@FindBy(xpath="//android.widget.EditText[@text='Current password']")
	WebElement txtCurrentPassword;	
	
	@FindBy(xpath="//android.widget.EditText[@text='New password']")
	WebElement txtNewPassword;	
	
	@FindBy(xpath="//android.widget.EditText[@text='Repeat new password']")
	WebElement txtRepeatNewPassword;	
	
	@FindBy(xpath="//android.widget.EditText[@text='Change it']")
	WebElement btnChange;	
		
	public WebElement getTxtChangePassword() {
		return txtChangePassword;
	}

	public WebElement getTxtCurrentPassword() {
		return txtCurrentPassword;
	}

	public WebElement getTxtNewPassword() {
		return txtNewPassword;
	}

	public WebElement getTxtRepeatNewPassword() {
		return txtRepeatNewPassword;
	}

	public WebElement getBtnChange() {
		return btnChange;
	}	

	public void changePassword() throws Exception {
		String currentPass = ereader.getCellData("ChangePassword", 1, 0);
		String newPass = ereader.getCellData("ChangePassword", 1, 1);
		String confirm_newPass = ereader.getCellData("ChangePassword", 1, 2);	
		getTxtChangePassword().click();
		((MobileElement) getTxtCurrentPassword()).setValue(currentPass);
		((MobileElement) getTxtNewPassword()).setValue(newPass);
		((MobileElement) getTxtRepeatNewPassword()).setValue(confirm_newPass);
		getBtnChange().click();
		Thread.sleep(10000);
	}
}