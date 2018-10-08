package com.framework.tests;
import org.testng.annotations.Test;

import com.app.pages.ChangPasswordPage;
import com.app.pages.LoginPage;
import com.app.pages.LogoutPage;
import com.app.pages.RegistrationPage;
import com.framework.appium.BaseClass;
import com.framework.appium.CommonMethod;

public class TheFloowTests extends BaseClass {


	RegistrationPage reg = new RegistrationPage();
	LoginPage login = new LoginPage();
	ChangPasswordPage change = new ChangPasswordPage();
	LogoutPage logout = new LogoutPage();



	/***
	 * User Registration Test
	 * @throws Exception
	 */
	//@Test(priority=0)
	public void userRegistration() throws Exception {
		try {
			reg.userRegistration();
			reg.clickOnCheckBox();
			reg.clickOnRegisterButton();
		}
		catch(Throwable t) {
			CommonMethod.takeScreenshot(driver, "User Registration Failed");
			log.error(t.getLocalizedMessage());
			throw new RuntimeException(t.getLocalizedMessage());
		}

	}


	/**
	 * User Login Test
	 * @throws Exception
	 */
	@Test(priority=1)
	public void userLoginTest() throws Exception {
		try {
			login.clickOnAlreadyRegistered();
			login.userLoginDetails();
			login.clickOnLoginButton();
			//Login Assertion
			login.verifyLoginAssertion();
			login.clickOnGrantPermission();
			login.clickOnAllowButton();
			//login.clickOnGetStaredButton();
			login.clickOnSettingsButton();

		}
		catch(Throwable t) {
			CommonMethod.takeScreenshot(driver, "User Login Test Failed");
			log.error(t.getLocalizedMessage());
			throw new RuntimeException(t.getLocalizedMessage());
		}

	}
	/***
	 * Change password Test
	 * @throws Exception
	 */
	@Test(priority=2)
	public void changePassword() throws Exception {
		try {
			change.changePassword();
		}
		catch(Throwable t) {
			CommonMethod.takeScreenshot(driver, "change password Test Failed");
			log.error(t.getLocalizedMessage());
			throw new RuntimeException(t.getLocalizedMessage());
		}

	}

	/***
	 * Logout Test
	 * @throws Exception
	 */
	//@Test(priority=3)
	public void logoutTest() throws Exception {
		try {
			logout.logoutTest();
		}
		catch(Throwable t) {
			CommonMethod.takeScreenshot(driver, "Logout Test Failed");
			log.error(t.getLocalizedMessage());
			throw new RuntimeException(t.getLocalizedMessage());
		}

	}











}
