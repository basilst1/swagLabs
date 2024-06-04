package com.swagLabs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.swagLabs.pages.accountLoginPage;
import com.swagLabs.testBase.testBase;

import junit.framework.Assert;

public class accountLoginPageTest extends testBase {
	accountLoginPage accountLogin;

	@BeforeMethod
	public void launchBrowser() {
		initialization();
	}

	@Test

	public void testLogin() {
		accountLoginPage page = new accountLoginPage();

		accountLogin.enterUsername("problem_user");
		accountLogin.enterPassword("secret_sauce");
		accountLogin.clickLoginButton();
	}

}
