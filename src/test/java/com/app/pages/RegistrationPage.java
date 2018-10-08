package com.app.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.appium.BaseClass;
import com.framework.appium.CommonMethod;

import io.appium.java_client.MobileElement;

public class RegistrationPage extends BaseClass {

	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//android.widget.EditText[@text='Email address']")
	WebElement txtEmail;

	@FindBy(xpath="//android.widget.EditText[@text='Password']")
	WebElement txtPassword;

	@FindBy(xpath="//android.widget.EditText[@text='Repeat password']")
	WebElement txtRepeatPassword;

	@FindBy(xpath="//android.widget.EditText[@text='First name']")
	WebElement txtFirstName;

	@FindBy(xpath="//android.widget.EditText[@text='Surname']")
	WebElement txtSurname;

	@FindBy(xpath="//android.widget.EditText[@text='Date of birth']")
	WebElement txtDOB;

	@FindBy(xpath="//android.widget.Button[@text='OK']")
	WebElement btnOK;

	@FindBy(xpath="//android.widget.EditText[@text='Zip code']")
	WebElement txtZipCode;

	@FindBy(xpath="//android.widget.CheckBox[@index='0']")
	WebElement chkBox;

	@FindBy(xpath="//android.widget.Button[@text='Register']")
	WebElement btnRegister;


	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getTxtRepeatPassword() {
		return txtRepeatPassword;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtSurname() {
		return txtSurname;
	}

	public WebElement getTxtDOB() {
		return txtDOB;
	}

	public WebElement getBtnOK() {
		return btnOK;
	}

	public WebElement getTxtZipCode() {
		return txtZipCode;
	}

	public WebElement getChkBox() {
		return chkBox;
	}

	public WebElement getBtnRegister() {
		return btnRegister;
	}

	/**
	 * Reusable Method for User registration
	 * @throws InterruptedException
	 */
	public void userRegistration() throws InterruptedException {

		/**
		 * Getting data from Excel
		 */
		String email = ereader.getCellData("UserRegistration", 1, 0);
		String pass = ereader.getCellData("UserRegistration", 1, 1);
		String confirmPassword = ereader.getCellData("UserRegistration", 1, 2);
		String fname = ereader.getCellData("UserRegistration", 1, 3);
		String sname = ereader.getCellData("UserRegistration", 1, 4);
		String postaCode = ereader.getCellData("UserRegistration", 1, 5);

		Thread.sleep(3000);
		((MobileElement) getTxtEmail()).setValue(email);
		((MobileElement) getTxtRepeatPassword()).setValue(pass);
		((MobileElement) getTxtRepeatPassword()).setValue(confirmPassword);
		((MobileElement) getTxtFirstName()).setValue(fname);
		((MobileElement) getTxtSurname()).setValue(sname);
		getTxtDOB().click();
		getTxtDOB().click();
		((MobileElement) getTxtZipCode()).setValue(postaCode);
		CommonMethod.scroolToText(driver, "Register");

	}

	/**
	 * Clicking on Check box
	 */
	public void clickOnCheckBox() {		
		getChkBox().click();
	}


	/**
	 * Clicking on Register Button
	 * @throws InterruptedException
	 */
	public void clickOnRegisterButton() throws InterruptedException {

		getBtnRegister().click();
		Thread.sleep(10000);
	}


















}
