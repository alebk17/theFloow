package com.app.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.framework.appium.BaseClass;
import com.framework.appium.CommonMethod;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidKeyCode;

public class LoginPage extends BaseClass{

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//android.widget.EditText[@text='Email']")
	WebElement txtEmailAddress;	

	@FindBy(xpath="//android.widget.EditText[@text='Password']")
	WebElement txtPassword;	

	@FindBy(xpath="//android.widget.Button[@text='Login']")
	WebElement btnLogin;	

	@FindBy(xpath="//android.widget.Button[@text='Already registered']")
	WebElement btnAlreadyRegister;	

	@FindBy(xpath="//android.widget.Button[@text='Grant permission']")
	WebElement btnGrantPpermission;	

	@FindBy(xpath="//android.widget.Button[@text='ALLOW']")
	WebElement btnAllow;	

	@FindBy(xpath="(//android.widget.Button[@text='Get started'])[2]")
	WebElement btnGetStarted;	

	@FindBy(xpath="//android.widget.Button[@text='Settings']")
	WebElement btnSettings;	

	@FindBy(xpath="//android.widget.ImageView[@resource-id='android:id/icon']")
	WebElement imgMore;	

	public WebElement getTxtEmailAddress() {
		return txtEmailAddress;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getBtnAlreadyRegister() {
		return btnAlreadyRegister;
	}

	public WebElement getBtnGrantPpermission() {
		return btnGrantPpermission;
	}

	public WebElement getBtnAllow() {
		return btnAllow;
	}

	public WebElement getBtnGetStarted() {
		return btnGetStarted;
	}

	public WebElement getBtnSettings() {
		return btnSettings;
	}

	public WebElement getImgMore() {
		return imgMore;
	}

	public void userLoginDetails() throws Exception {
		/**
		 * Getting data from Excel
		 */
		String username = ereader.getCellData("Login", 1, 0);
		String pass = ereader.getCellData("Login", 1, 1);

		((MobileElement) getTxtEmailAddress()).setValue(username);
		((MobileElement) getTxtPassword()).setValue(pass);
	}

	public void clickOnLoginButton() throws InterruptedException, IOException {
		getBtnLogin().click();
		Thread.sleep(5000);
	}

	public void clickOnAlreadyRegistered() {
		CommonMethod.scroolToText(driver, "Already registered");
		getBtnAlreadyRegister().click();
	}

	public void clickOnGrantPermission() {
		getBtnGrantPpermission().click();
	}

	public void verifyLoginAssertion() {
		Assert.assertTrue(getBtnGrantPpermission().isDisplayed());
	}

	public void clickOnAllowButton() throws InterruptedException {
		getBtnAllow().click();
		Thread.sleep(6000);
	}


	public void clickOnGetStaredButton() throws InterruptedException {
		getBtnGetStarted().click();
		Thread.sleep(3000);
	}

	public void clickOnSettingsButton() throws InterruptedException {
		getBtnSettings().click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		getImgMore().click();
		Thread.sleep(1000);
	}
}